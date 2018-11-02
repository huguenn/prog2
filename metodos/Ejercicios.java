package metodos;

import Implementaciones.PilaTF;
import apis.PilaTDA;

public class Ejercicios {
	public static void PasarPila(PilaTDA o, PilaTDA d){
		while (!o.PilaVacia()){
			d.Apilar(o.Tope());
			o.Desapilar();
		}
	}
	
	public static void CopiarPila(PilaTDA o, PilaTDA d){
		PilaTF aux=new PilaTF();
		aux.InicializarPila();
		
		PasarPila(o,aux);
		
		while (!aux.PilaVacia()){
			o.Apilar(aux.Tope());
			d.Apilar(aux.Tope());
			aux.Desapilar();
		}
		
	}
	
	public static void MostrarPila(PilaTDA o){
		PilaTF aux=new PilaTF();
		aux.InicializarPila();
		
		CopiarPila(o,aux);
		
		while (!aux.PilaVacia()){
			System.out.println(aux.Tope());
			aux.Desapilar();
		}
		
	}
	
	
	public static void InvertirPila(PilaTDA o){
		PilaTF aux=new PilaTF();
		aux.InicializarPila();
		PasarPila(o,aux);
		CopiarPila(aux,o);
		
		
	}
	
	
}
