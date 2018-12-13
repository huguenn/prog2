
package utilitarios;
import
import
import
import
import
import
api.ColaTDA;
api.ConjuntoTDA;
api.PilaTDA;
implementaciones.listas.ColaLD;
implementaciones.listas.ConjuntoLD;
implementaciones.listas.PilaLD;
public class MetodosConjunto {
public MetodosConjunto() {
// TODO Auto-generated constructor stub
}
/**
@Tarea: Imprimir el conjunto en pantalla
@Parámetros: Conjunto
@Devuelve: Nada
@Precondición: Siempre que la cola este inicializada
@Postcondición:
@Costo: Lineal
**/
public static void ImprimirConjunto(ConjuntoTDA conjunto) {
ConjuntoTDA temp = conjunto.ObtenerCopia();
System.out.print("Conjunto: ");
while(!temp.ConjuntoVacio()) {
System.out.print(temp.Elegir());
System.out.print(" - ");
temp.Sacar(temp.Elegir());
}
}
System.out.printf("%n");
/**
@Tarea: Permite obtener la interseccion de dos conjuntos
@Parámetros: Conjunto1 y Conjunto2
@Devuelve: Conjunto interseccion
@Precondición: Siempre que los conjuntos esten inicializados
@Postcondición:
@Costo: Lineal
**/
public static ConjuntoTDA Interseccion(ConjuntoTDA conjunto1, ConjuntoTDA
conjunto2) {
ConjuntoTDA resultado = new ConjuntoLD();
ConjuntoTDA c1 = conjunto1.ObtenerCopia();
while (!c1.ConjuntoVacio()) {
int valor = c1.Elegir();
if (conjunto2.Pertenece(valor)) {
resultado.Agregar(valor);
}
c1.Sacar(valor);
}
}
return resultado;
/**
@Tarea: Permite obtener la union de dos conjuntos
@Parámetros: Conjunto1 y Conjunto2
@Devuelve: Conjunto union
@Precondición: Siempre que los conjuntos esten inicializados
@Postcondición:
@Costo: Lineal
**/
public static ConjuntoTDA Union(ConjuntoTDA conjunto1, ConjuntoTDA conjunto2) {69

ConjuntoTDA resultado = new ConjuntoLD();
ConjuntoTDA c1 = conjunto1.ObtenerCopia();
ConjuntoTDA c2 = conjunto2.ObtenerCopia();
while (!c1.ConjuntoVacio()) {
resultado.Agregar(c1.Elegir());
c1.Sacar(c1.Elegir());
}
while (!c2.ConjuntoVacio()) {
resultado.Agregar(c2.Elegir());
c2.Sacar(c2.Elegir());
}
}
return resultado;
/**
@Tarea: Permite obtener la diferencia de dos conjuntos
@Parámetros: Conjunto1 y Conjunto2
@Devuelve: Conjunto diferencia
@Precondición: Siempre que los conjuntos esten inicializados
@Postcondición:
@Costo: Lineal
**/
public static ConjuntoTDA Diferencia(ConjuntoTDA conjunto1, ConjuntoTDA conjunto2) {
ConjuntoTDA c1 = conjunto1.ObtenerCopia();
ConjuntoTDA c2 = conjunto2.ObtenerCopia();
while (!c1.ConjuntoVacio()) {
c2.Sacar(c1.Elegir());
c1.Sacar(c1.Elegir());
}
}
return c2;
// TP3 ----------------
/**
@Tarea: Permite obtener la diferencia simetrica de dos conjuntos sin utilizar
operaciones
@Parámetros: Conjunto1 y Conjunto2
@Devuelve: Conjunto diferencia simetrica
@Precondición: Siempre que los conjuntos esten inicializados
@Postcondición:
@Costo: Lineal
**/
public static ConjuntoTDA DiferenciaSimetricaSinOperaciones(ConjuntoTDA conjunto1,
ConjuntoTDA conjunto2) {
ConjuntoTDA resultado = new ConjuntoLD();
ConjuntoTDA c1 = conjunto1.ObtenerCopia();
ConjuntoTDA c2 = conjunto2.ObtenerCopia();
while (!c1.ConjuntoVacio()) {
int valor = c1.Elegir();
if (!conjunto2.Pertenece(valor)) {
resultado.Agregar(valor);
}
c1.Sacar(valor);
}
while (!c2.ConjuntoVacio()) {
int valor = c2.Elegir();
if (!conjunto1.Pertenece(valor)) {
resultado.Agregar(valor);
}
c2.Sacar(valor);
}

}
return resultado;
/**
@Tarea: Permite obtener la diferencia simetrica de dos conjuntos
@Parámetros: Conjunto1 y Conjunto2
@Devuelve: Conjunto diferencia simetrica
@Precondición: Siempre que los conjuntos esten inicializados
@Postcondición:
@Costo: Lineal
**/
public static ConjuntoTDA DiferenciaSimetrica(ConjuntoTDA conjunto1, ConjuntoTDA
conjunto2) {
ConjuntoTDA union = new ConjuntoLD();
union = Union(conjunto1, conjunto2);
ConjuntoTDA interseccion = new ConjuntoLD();
interseccion = Interseccion(conjunto1, conjunto2);
}
return Diferencia(interseccion, union);
/**
@Tarea: Permite determinar si dos conjuntos sin iguales
@Parámetros: Conjunto1 y Conjunto2
@Devuelve: True si son iguales, False si no son iguales
@Precondición: Siempre que los conjuntos esten inicializados
@Postcondición:
@Costo: Lineal
**/
public static boolean SonIguales(ConjuntoTDA conjunto1, ConjuntoTDA conjunto2) {
boolean sonIguales = true;
ConjuntoTDA c1 = conjunto1.ObtenerCopia();
ConjuntoTDA c2 = conjunto1.ObtenerCopia();
while(!c1.ConjuntoVacio()) {
sonIguales = sonIguales && c2.Pertenece(c1.Elegir());
c1.Sacar(c1.Elegir());
}
c1 = conjunto1.ObtenerCopia();
c2 = conjunto1.ObtenerCopia();
while(!c2.ConjuntoVacio()) {
sonIguales = sonIguales && c1.Pertenece(c2.Elegir());
c2.Sacar(c2.Elegir());
}
}
return sonIguales;
/**
@Tarea: Permite obtener la cantidad de elementos de un conjunto
@Parámetros: Conjunto
@Devuelve: Cantidad de elementos
@Precondición: Siempre que el conjunto este inicializado
@Postcondición:
@Costo: Lineal
**/
public static int CantidadElementos(ConjuntoTDA conjunto) {
int cantidadElementos = 0;
ConjuntoTDA c1 = conjunto.ObtenerCopia();
while(!c1.ConjuntoVacio()) {
c1.Sacar(c1.Elegir());
cantidadElementos++;
}
}
return cantidadElementos;
public static ConjuntoTDA ElementosComunes(PilaTDA pila, ColaTDA cola) {
  PilaTDA p = new PilaLD();
  ColaTDA c = new ColaLD();
  ConjuntoTDA aux = new ConjuntoLD();
  ConjuntoTDA resultado = new ConjuntoLD();
  MetodosPila.CopiarPilaMismoOrden(pila, p);
  MetodosCola.CopiarCola(cola, c);
    while(!p.PilaVacia()) {
      aux.Agregar(p.Tope());
      p.Desapilar();
    }
    while(!c.ColaVacia()) {
      if (aux.Pertenece(c.Primero())) {
      resultado.Agregar(c.Primero());
      }
      c.Desacolar();
    }
  return resultado;
}

/**
@Tarea: Permite determinar si una pila y una cola tienen los mismos elementos
@Parámetros: Pila y Cola
@Devuelve: True si tienen los mismos elementos, False si no tienen los mismos
elementos
@Precondición: Siempre que la pila y la cola esten inicializados
@Postcondición:
@Costo: Lineal
**/
public static boolean TienenLosMismosElementos(PilaTDA pila, ColaTDA cola) {
PilaTDA p = new PilaLD();
ColaTDA c = new ColaLD();
ConjuntoTDA auxp = new ConjuntoLD();
ConjuntoTDA auxc = new ConjuntoLD();
    while(!p.PilaVacia()) {
    auxp.Agregar(p.Tope());
    p.Desapilar();
    }
    while(!c.ColaVacia()) {
    auxc.Agregar(c.Primero());
    c.Desacolar();
    }
return SonIguales(auxp, auxc);
  }
}
