package unidad04.diapositivas.diapositiva45;

public class Alumno {
	
	private String nombre;
	private String dni;
	private double notaMedia;
	
	public Alumno(String nombre, String dni, double notaMedia) {
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public void mostrar() {
		System.out.printf("Nombre: %s - DNI: %s - Nota: %.2f \n", this.nombre, this.dni, this.notaMedia);
	}
	
}
