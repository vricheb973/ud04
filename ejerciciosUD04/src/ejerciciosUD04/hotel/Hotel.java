package ejerciciosUD04.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private List<Reserva> reservas;

	public Hotel() {
		this.reservas = new ArrayList<Reserva>();
	}

	public void nuevaReserva(Reserva r) {
		this.reservas.add(r);
	}

	public boolean cancelarReserva(int numeroHabitacion) {
		Reserva eliminar = buscarReserva(numeroHabitacion);
		boolean result = false;
		
		if(eliminar != null) {
			result = this.reservas.remove(eliminar);
		}
		
		return result;
	}

	public Reserva buscarReserva(int numeroHabitacion) {
		Reserva encontrada = null;
				
		for(Reserva r : this.reservas) {
			if(r.getNumeroHabitacion() == numeroHabitacion && encontrada == null) {
				encontrada = r;
			}
		}

		return encontrada;
	}
	
	public List<Reserva> reservasCliente(String nombreCliente){
		List<Reserva> result = new ArrayList<Reserva>();
		
		for(Reserva r : this.reservas) {
			if(r.getNombreCliente().equals(nombreCliente)) {
				result.add(r);
			}
		}
		
		return result;
	}
	
	public double ingresosTotales(int precioPorNoche) {
		double total = 0.0;
		
		for(Reserva r : this.reservas) {
			total = total + r.getNoches() * precioPorNoche;
		}
		
		return total;
	}
	
	public int contarReservasActivas() {
		return this.reservas.size();
	}
	
	public void mostrarReservas() {
		for(Reserva r : this.reservas) {
			r.mostrarInfo();
			System.out.println("--------------");
		}
	}
	
	
	
	
	
	
	

}
