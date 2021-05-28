public class QuitarPrenda implements Propuesta {
  Prenda prenda;
  Guardarropa guardarropaCompartido;

  public QuitarPrenda(Prenda prenda, Guardarropa guardarropaCompartido) {
    this.prenda = prenda;
    this.guardarropaCompartido = guardarropaCompartido;
  }

  public void ejecutar() {
    guardarropaCompartido.quitarPrenda(prenda);
  }


  public void revertir() {
    guardarropaCompartido.agregarPrenda(prenda);
  }
}
