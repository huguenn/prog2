public Interface ConjuntoTDA{
  void InicializarConjunto();
  //siempre q el conjunto esté inicializado
  boolean ConjuntoVacio();
  //siempre q el conjunto esté inicializado
  void Agregar (int x);
  //siempre q el conjunto esté inicializado  y !vacio
  int elegir ();
  //siempre q el conjunto esté inicializado
  void sacar (int x);
  //siempre q el conjunto esté inicializado
  boolean Pertenece (int x)
}

public class ConjuntoLD implments ConjuntoTDA{
  Nodo c;
  public void InicializaConjunto (){
    c=NULL;

  }
  public boolean ConjuntoVacio(){
    return (c==NULL);
  }
  public void Agregar (int x){
    //verificar que el valor no este en el conjunto
    if(!this.Pertenece (x){
    Nodo aux=new Nodo();
    aux.info=x;
    aux.sig=c;
    c=aux;
    }
  }
  public int elegir (){
    return c.info;
  }
  public void sacar (int x){
    if(c!=NULL){
    //si es el primer elemento de la lista
      if(c.info==x){
        c=c.sig;
      } else {
        Nodo aux=c;
        while(aux.sig!=NULL && aux.sig.info!=x)
          aux=aux.sig;
          if (aux.sig!=NULL){
            aux.sig=aux.sig.sig;
          }
      }
    }
  }
  public boolean Pertenece (int x){
    Nodo aux=c;
    while ((aux!=NULL)&&(aux.info!=x)){
      aux=aux.sig;
    }
    return(aux!=null);
  }
}
