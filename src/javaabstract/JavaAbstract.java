
package javaabstract;


public class JavaAbstract {

	
	public static void main(String[] args) {
		
		Planta planta = new Planta();
		
		AnimalCarnivoro Lobo = new AnimalCarnivoro();
		
		AnimalHerviboro Koala = new AnimalHerviboro();
		
		planta.alimentacion();
		
		Lobo.alimentacion();
		
		Koala.alimentacion();
		
	}
	
}
