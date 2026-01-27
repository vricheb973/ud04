package ejerciciosUD04.hotel;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Hotel miHotel = new Hotel();
        miHotel.nuevaReserva(new Reserva(101, "Juan Pérez", "10/05/2024", 3));
        miHotel.nuevaReserva(new Reserva(102, "Ana López", "15/05/2024", 2));
        miHotel.nuevaReserva(new Reserva(201, "Juan Pérez", "20/05/2024", 5));
        miHotel.nuevaReserva(new Reserva(103, "Carlos Ruiz", "01/06/2024", 1));
        miHotel.nuevaReserva(new Reserva(305, "Marta García", "10/06/2024", 15));
        miHotel.nuevaReserva(new Reserva(101, "Sofía Torres", "25/06/2024", 2));
        miHotel.nuevaReserva(new Reserva(404, "Jose María Villalta", "01/07/2024", 4));
        miHotel.nuevaReserva(new Reserva(202, "Juan Pérez", "15/07/2024", 1));
        miHotel.nuevaReserva(new Reserva(501, "Lucía Fernández", "31/12/2024", 3));
        miHotel.nuevaReserva(new Reserva(105, "Pedro Picapiedra", "10/01/2025", 2));

        // --- PRUEBAS DE FUNCIONALIDAD ---

        System.out.println("=== LISTADO DE TODAS LAS RESERVAS ===");
        miHotel.mostrarReservas();

        System.out.println("\n=== PRUEBA: Buscar Reserva Habitación 305 ===");
        Reserva r = miHotel.buscarReserva(305);
        if (r != null) r.mostrarInfo();

        System.out.println("\n=== PRUEBA: Reservas de 'Juan Pérez' ===");
        List<Reserva> reservasJuan = miHotel.reservasCliente("Juan Pérez");
        System.out.println("Juan tiene " + reservasJuan.size() + " reservas.");

        System.out.println("\n=== PRUEBA: Ingresos Totales (Precio 100€/noche) ===");
        System.out.printf("Total: %.2f €\n", miHotel.ingresosTotales(100));

        System.out.println("\n=== PRUEBA: Cancelar Habitación 102 ===");
        if (miHotel.cancelarReserva(102)) {
            System.out.println("Reserva cancelada con éxito. Reservas activas: " + miHotel.contarReservasActivas());
        }

	}

}
