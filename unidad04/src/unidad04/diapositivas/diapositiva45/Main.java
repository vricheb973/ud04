package unidad04.diapositivas.diapositiva45;

public class Main {

	public static void main(String[] args) {

		Grupo daw = new Grupo();
		
        Alumno alumno1 = new Alumno("Juan Pérez", "12345678A", 8.5);
        Alumno alumno2 = new Alumno("María López", "87654321B", 9.2);
        Alumno alumno3 = new Alumno("Carlos Ruiz", "11223344C", 7.0);
        Alumno alumno4 = new Alumno("Lucía García", "55667788D", 6.8);
        Alumno alumno5 = new Alumno("Pedro Jiménez", "99887766E", 5.5);

        daw.agregarAlumno(alumno1);
        daw.agregarAlumno(alumno2);
        daw.agregarAlumno(alumno3);
        daw.agregarAlumno(alumno4);
        daw.agregarAlumno(alumno5);
        
        daw.mostrarAlumnos();

	}

}
