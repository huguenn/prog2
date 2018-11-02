/*
Estructura que permite almacenar valores,
recuperarlos y eliminarlos. A diferencia de
la pila, el primer valor ingresado es el
primero que se recupera o elimina.
Nos permite saber si la cola tiene elementos
o no
*/
public interface ColaTDA {
  //que esté inicializado
  void Acolar (int x);
  //que esté inicializado y !Vacio
  void Desacolar();
  //que este inicializada
  boolean ColaVacia();
  //que este inicializado y !Vacio
  int Primero();
}
