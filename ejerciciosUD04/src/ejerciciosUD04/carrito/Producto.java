package ejerciciosUD04.carrito;

public class Producto {
	
	private String nombre;
	private double precioUnitario;
	private int cantidad;
	
	public Producto(String nombre, double precioUnitario, int cantidad) {
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	//Métodos
	public double calcularImporte() {
		return this.precioUnitario * this.cantidad;
	}

}
