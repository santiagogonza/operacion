package polimormisfo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Gato();
		Animal b = new Caballo();
		Animal c = new Perro();
		a.sonido();
		b.sonido();
		c.sonido();
		
	
	}

}
