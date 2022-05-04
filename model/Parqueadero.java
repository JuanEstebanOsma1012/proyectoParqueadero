package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Parqueadero {

	private String nombre;
	
	private Propietario[] listaPropietarios;
	private ArrayList<Vehiculo> listaVehiculos;
	private ArrayList<RegistroParqueo> listaRegistroParqueo;
	private Puesto[][] listaPuestos;
	
	public Parqueadero(String nombre, Propietario[] listaPropietarios, ArrayList<Vehiculo> listaVehiculos,
			ArrayList<RegistroParqueo> listaRegistroParqueo, Puesto[][] listaPuestos) {
		super();
		this.nombre = nombre;
		this.listaPropietarios = listaPropietarios;
		this.listaVehiculos = listaVehiculos;
		this.listaRegistroParqueo = listaRegistroParqueo;
		this.listaPuestos = listaPuestos;
	}	
	
	public Parqueadero(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Parqueadero() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Propietario[] getListaPropietarios() {
		return listaPropietarios;
	}

	public void setListaPropietarios(Propietario[] listaPropietarios) {
		this.listaPropietarios = listaPropietarios;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public ArrayList<RegistroParqueo> getListaRegistroParqueo() {
		return listaRegistroParqueo;
	}

	public void setListaRegistroParqueo(ArrayList<RegistroParqueo> listaRegistroParqueo) {
		this.listaRegistroParqueo = listaRegistroParqueo;
	}

	public Puesto[][] getListaPuestos() {
		return listaPuestos;
	}

	public void setListaPuestos(Puesto[][] listaPuestos) {
		this.listaPuestos = listaPuestos;
	}

	@Override
	public String toString() {
		return "Parqueadero [nombre=" + nombre + ", listaPropietarios=" + Arrays.toString(listaPropietarios)
				+ ", listaVehiculos=" + listaVehiculos.toString() + ", listaRegistroParqueo=" + listaRegistroParqueo.toString()
				+ ", listaPuestos=" + Arrays.toString(listaPuestos) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parqueadero other = (Parqueadero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
