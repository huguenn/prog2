package tps;

import Implementaciones.ColaPU;
import Implementaciones.PilaTF;
import metodos.Ejercicios;

public class TP1 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		PilaTF p=new PilaTF();
		p.InicializarPila();
		p.Apilar(1);
		p.Apilar(2);
		p.Apilar(3);
		System.out.println("El top es " + p.Tope());
		p.Desapilar();
		PilaTF destino= new PilaTF();
		destino.InicializarPila();
		Ejercicios.PasarPila(p, destino);
		Ejercicios.MostrarPila(destino);
		ColaPU<String> c=new ColaPU<String>();
		c.Acolar("Hola");
		
		
		
		

	}

}
