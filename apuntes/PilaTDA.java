public class PilaLD implements PilaTDA {
  class Nodo{
    int info;
    Nodo sig;
  }
  Nodo tope;
  public void InicializarPila(){
    tope=null;
  }
  public void Apilar(int x){
    Nodo aux= new Nodo();
    aux.info =x;
    aux.sig = tope;
    tope = aux;
  }

  public void Desapilar(){
    tope = tope.sig;
  }

  public boolean PilaVacia(){
    return (tope==null);
  }

  public int Tope(){
    return tope.info;
  }
}
