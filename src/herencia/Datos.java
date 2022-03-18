package herencia;

public abstract class Datos {
	private String nombre;
	private String longuitud;
	private String descripcion;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the longuitud
	 */
	public String getLonguitud() {
		return longuitud;
	}
	/**
	 * @param longuitud the longuitud to set
	 */
	public void setLonguitud(String longuitud) {
		this.longuitud = longuitud;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
