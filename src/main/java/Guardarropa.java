import java.util.ArrayList;
import java.util.List;

public class Guardarropa {


  // Iteracion anterior
  Usuario propietario;
  List<Prenda> prendas = new ArrayList<Prenda>();

  public Guardarropa() {

  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

}
