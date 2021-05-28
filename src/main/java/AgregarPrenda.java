public class AgregarPrenda implements Propuesta {
  Prenda prenda;
  Guardarropa guardarropaCompartido;

  public AgregarPrenda(Prenda prenda, Guardarropa guardarropaCompartido) {
    this.prenda = prenda;
    this.guardarropaCompartido = guardarropaCompartido;
  }

  public void ejecutar() {
    guardarropaCompartido.agregarPrenda(prenda);
  }

  public void revertir() {
    guardarropaCompartido.quitarPrenda(prenda);
  }

}
