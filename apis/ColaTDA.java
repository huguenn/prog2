package apis;

public interface ColaTDA<T> {
	
	void InicializarCola();
	void Acolar(T x);
	void Desacolar();
	T Primero();
	boolean PilaVacia();
	

}
