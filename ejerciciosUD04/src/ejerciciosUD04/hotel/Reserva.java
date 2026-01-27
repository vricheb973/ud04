package ejerciciosUD04.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

	private int numeroHabitacion;

	private String nombreCliente;

	private LocalDate fechaEntrada;

	private int noches;
	
	public Reserva(int numeroHabitacion, String nombreCliente, String fechaEntrada, int noches) {
		this.numeroHabitacion = numeroHabitacion;
		this.nombreCliente = nombreCliente;
		this.fechaEntrada = LocalDate.parse(fechaEntrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.noches = noches;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public int getNoches() {
		return noches;
	}

	public void setNoches(int noches) {
		this.noches = noches;
	}

	public double calcularPrecio(int precioPorNoche) {
		return this.noches * precioPorNoche;
	}

	public void mostrarInfo() {
		System.out.println("Fecha entrada: " + this.fechaEntrada);
		System.out.println("Noches: " + this.noches);
		System.out.println("Nombre cliente: " + this.nombreCliente);
		System.out.println("Número habitación: " + this.numeroHabitacion);
		System.out.printf("Precio: %.2f € \n", this.calcularPrecio(80));
	}

}
