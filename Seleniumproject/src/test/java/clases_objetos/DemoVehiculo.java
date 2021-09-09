package clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehiculo minivan = new Vehiculo ();
int rango;
// Asignando valores a las variables
minivan.pasajeros = 9;
minivan.capacidad = 15;
minivan.kmh= 20;
// calculo de rando asumiendo un tanque lleno 
rango = minivan.capacidad * minivan.kmh ;

System.out.println("la minivan puede llevar" + minivan.pasajeros + "pasajeros con rango de" + rango + "kilometros");

Vehiculo carro = new Vehiculo();
carro.pasajeros = 4;
System.out.println("numero en carro es: " + carro.pasajeros); 
}

}
