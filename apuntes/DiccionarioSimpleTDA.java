public interface DiccionarioSimpleTDA{
  void InicializarDiccionario();
  //siempre que el diccionario este inicializado
  void Agregar(int clave, int valor);
  //siempre que el diccionario este inicializado
  void Eliminar(int clave);
  //siempre que el diccionario este inicializado y la clave exista
  int Recuperar(int clave);
  //siempre que el diccionario este inicializado
  Conjunto TDA Claves ();
}

public class DiccSimpleLD implements DiccionarioSimpleTDA {
  Class NodoClave{
    int clave;
    int valor;
    NodoClave sigclave;
  }
  NodoClave origen;

  public voiod InicializarDiccionario(){
    origen=null;
  }

  public void Agregar (int clave, int valor){
    NodoClave mc=Clave2NodoClave(clave);
    if(mc==null){
      mc=new NodoClave();
      mc.clave=clave;
      mc.sigclave=origen;
      origen=mc;
      mc.valor=valor;
    }
  }

  private NodoClave Clave2NodoClave (int clave){
    NodoClave aux=origen;
    while(aux!=null && aux.clave!=clave){
      aux=aux.sigclave;
      return aux;
    }
  }

  public void eliminar (int clave){
    if(origen!=null){
      origen=origen.sigclave;
    } else {
      NodoClave aux=origen;
      while(aux.sigclave!=null &&aux.sigclave.clave!=clave){
        aux=aux.sigclave;
      }
      if(aux.sigclave!=null){
        aux.sigclave=aux.sigclave.sigclave;
      }
    }
  }

  public int Recuperar (int clave){
    NodoClave m=Clave2NodoClave (clave);
    return m.valor;
  }
  public ConjuntoTDA claves(){
    ConjuntoTDA c= new ConjuntoLC();
    c.InicializarConjunto ();
    NodoClave aux=origen;
    while (aux!=null){
      c.agregar(aux.clave);
      aux=aux.sigclave;
      return c;
    }
  }
}
