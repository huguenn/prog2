public class ColaTDA implements ColaTDA{
Nodo primero;
Nodo ultimo;
public void InicializarCola (){
primero NULL;
ultimo = NULL;

  public void Acolar (int x){
  Nodo Aux = new Nodo();
  aux.info=x;
  aux.sig = NULL;
  //si la cola no está vacia
    if (primero!=NULL){
      ultimo.sig=aux;
      ultimo=aux;
    }
  //si la cola esta vacia
    if(primero==NULL){
        primero=ultimo;
    }

  }

  public void Desacolar (){
    primero=primero.sig;
    //si la cola qeda vacia
    if (primero==NULL){
      ultimo=NULL;

    }
  }

  public boolean ColaVacia (){
    return(ultimo==NULL)
  }
  public int Tope (){
    return primero.info;

  }
}


}
