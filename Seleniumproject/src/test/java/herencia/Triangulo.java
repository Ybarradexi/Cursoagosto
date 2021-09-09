package herencia;

public class Triangulo extends Dosdimensiones {
	
	String estilo;
	
	double area() {
		return base*altura/2; // Aqui se accede a las variables establecidas en la clase padre (Superclase);
		
		
	}
	
	void mostrarEstilo() {
		System.out.println ("Triangulo es:" + estilo);
	}
	
}
