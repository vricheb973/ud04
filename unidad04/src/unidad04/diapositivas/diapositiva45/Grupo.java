package unidad04.diapositivas.diapositiva45;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private List<Alumno> alumnos;
	
	public Grupo() {
		this.alumnos = new ArrayList<Alumno>();
	}
	
	public List<Alumno> getAlumnos(){
		return alumnos;
	}
	
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	//Métodos
	public void agregarAlumno(Alumno a) {
		this.alumnos.add(a);
	}
	
	public boolean eliminarAlumnoPorDNIForeach(String dni) {		
		Alumno eliminar = null;
		boolean result = false;
		
		for(Alumno a : this.alumnos) {
			if(a.getDni().equals(dni)) {
				eliminar = a;
			}
		}
		if(eliminar != null) {
			result = this.alumnos.remove(eliminar);
		}
		
		return result;
	}
	
	public Alumno buscarPorDNI(String dni) {
		Alumno result = null;
		
		for(Alumno a : this.alumnos) {
			if(a.getDni().equals(dni) && result == null) {
				result = a;
			}
		}
		
		return result;
	}
	
	public List<Alumno> alumnosAprobados(){
		List<Alumno> aprobados = new ArrayList<>();
		
		for(Alumno a : this.alumnos) {
			if(a.getNotaMedia() >= 5.0) {
				aprobados.add(a);
			}
		}
		
		return aprobados;
	}
	
	public double notaMediaGrupo() {
		double media = 0.0;
		
		for(Alumno a : this.alumnos) {
			media += a.getNotaMedia();
		}		
		
		
		return media/this.alumnos.size();
	}
	
	public int totalAlumnos() {
		return this.alumnos.size();
	}
	
	public void mostrarAlumnos() {
		for(Alumno a : this.alumnos) {
			a.mostrar();
		}
	}
	
}
