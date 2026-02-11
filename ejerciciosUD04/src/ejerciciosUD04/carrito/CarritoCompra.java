package ejerciciosUD04.carrito;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
	
	private List<Producto> productos;
	
	public CarritoCompra() {
		this.productos = new ArrayList<>();
	}

	//	void agregarProducto(Producto p): si el producto (mismo nombre) ya existe, 
//	solo aumenta la cantidad; si no existe, lo añade.
	public void agregarProducto(Producto p) {
		boolean encontrado = false;
		
		for(Producto prod : this.productos) {
			if(prod.getNombre().equals(p.getNombre()) && !encontrado) {
				prod.setCantidad(prod.getCantidad() + p.getCantidad());
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			this.productos.add(p);
		}
	}
	
		
//	boolean eliminarProductoPorNombre(String nombre): elimina el producto y 
//	devuelve true si lo ha encontrado.
	public boolean eliminarProductoPorNombre(String nombre) {
		Producto eliminar = null;
		boolean result = false;
		
		for(Producto p : this.productos) {
			if(p.getNombre().equals(nombre) && eliminar == null) {
				eliminar = p;
			}
		}
		
		for(int i=0; i<this.productos.size() && eliminar == null; i++) {
			if(productos.get(i).getNombre().equals(nombre)) {
				eliminar = productos.get(i);
			}
		}
		
		if(eliminar != null) {
			result = this.productos.remove(eliminar);
		}
		
		return result;
	}
	
	
//	Producto buscarProducto(String nombre): devuelve el producto o null si no está.
//	double calcularTotal(): suma de todos los importes de los productos del carrito.
//	void mostrarCarrito(): muestra todos los productos con su importe.
//	int contarProductosDistintos(): devuelve el número de productos diferentes.

}
