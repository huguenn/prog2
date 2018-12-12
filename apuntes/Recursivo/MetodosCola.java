package utilitarios;
import api.ColaTDA;
import api.ConjuntoTDA;
import api.PilaTDA;
import implementaciones.listas.PilaLD;
import implementaciones.listas.ColaLD;
import implementaciones.listas.ConjuntoLD;
public class MetodosCola {
public MetodosCola() {
// TODO Auto-generated constructor stub
}

public static void ImprimirCola(ColaTDA cola) {
ColaTDA temp = new ColaLD();
CopiarCola(cola, temp);
System.out.print("Cola: ");
  while(!temp.ColaVacia()) {
  System.out.print(temp.Primero());
  System.out.print(" - ");
  temp.Desacolar();
  }
System.out.printf("%n");
}

public static void CopiarCola(ColaTDA origen, ColaTDA destino) {
ColaTDA tmp = new ColaLD();
  while (!origen.ColaVacia()) {
  tmp.Acolar(origen.Primero());
  origen.Desacolar();
  }

  while (!tmp.ColaVacia()) {
  origen.Acolar(tmp.Primero());
  destino.Acolar(tmp.Primero());
  tmp.Desacolar();
  }
}

public static void PasarCola(ColaTDA origen, ColaTDA destino) {
  while (!origen.ColaVacia()) {
  destino.Acolar(origen.Primero());
  origen.Desacolar();
  }
}

public static void InvertirColaConPilasAuxiliares(ColaTDA cola) {
PilaTDA aux = new PilaLD();
  while (!cola.ColaVacia()) {
  aux.Apilar(cola.Primero());
  cola.Desacolar();
  }

  while (!aux.PilaVacia()) {
  cola.Acolar(aux.Tope());
  aux.Desapilar();
  }
}
