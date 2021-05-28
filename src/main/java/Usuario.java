import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  // (...)
  List<Propuesta> propuestasPendientes = new ArrayList<Propuesta>();
  List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
  List<Propuesta> propuestasAceptadas = new ArrayList<Propuesta>();

  public void recibirPropuesta(Propuesta propuesta) {
    propuestasPendientes.add(propuesta);
  }

  public void proponer(Propuesta propuesta, Usuario usuario) {
    usuario.recibirPropuesta(propuesta);
  }

  public void aceptar(Propuesta propuesta) {
    propuesta.ejecutar();
    propuestasPendientes.remove(propuesta);
    propuestasAceptadas.add(propuesta);
  }

  public void rechazar(Propuesta propuesta) {
    propuestasPendientes.remove(propuesta);
  }

  public Propuesta obtenerPropuesta(Propuesta propuesta) {
    return propuestasAceptadas.stream()
       .filter(unaPropuesta -> equals(propuesta))
       .collect(Collectors.toList())
       .get(0);
  }

  public void deshacerPropuesta(Propuesta propuesta) {
    Propuesta propuestaAceptada = obtenerPropuesta(propuesta);
    propuestaAceptada.revertir();
    propuestasAceptadas.remove(propuesta);
  }

  public void eliminarPropuesta(Propuesta propuesta) {
    propuestasPendientes.remove(propuesta);
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropas.add(guardarropa);
  }



}
