package herencia;

public class Pribcipal {
 static Pnumericos bits = new Pnumericos();
 static Pnumericos corto = new Pnumericos();
 static Pnumericos entero = new Pnumericos();
 static Pnumericos largo = new Pnumericos();
	
public static void main(String []args) {
	//ejemplo 
	
	bits.setNombre("byte");
	bits.setLonguitud("127 a128");
	bits.setDescripcion("es el entero mas pequeño");
	bits.setPrimitivo("si");
	bits.setBits((byte)10);
	bits.setLonguitud("127  A 128");
System.out.println(bits.getNombre() +""+ bits.getLonguitud());

	
}
}
