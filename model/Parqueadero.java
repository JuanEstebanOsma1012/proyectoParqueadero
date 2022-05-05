package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Parqueadero {

	private String nombre;
	
	private Propietario[] listaPropietarios;
	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
	private ArrayList<RegistroParqueo> listaRegistroParqueo = new ArrayList<>();
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
	
	public Parqueadero(String nombre, int numPropietarios, ArrayList<Vehiculo> listaVehiculos,
			ArrayList<RegistroParqueo> listaRegistroParqueo, int numFilasPuestos, int numColumnasPuestos) {
		super();
		this.nombre = nombre;
		this.listaPropietarios = new Propietario[numPropietarios];
		this.listaVehiculos = listaVehiculos;
		this.listaRegistroParqueo = listaRegistroParqueo;
		this.listaPuestos = new Puesto[numFilasPuestos][numColumnasPuestos];
	}	
	
	public Parqueadero(String nombre) {
		super();
		this.nombre = nombre;
		this.listaPropietarios = new Propietario[10];
		this.listaPuestos = new Puesto[10][10];
	}

	public Parqueadero() {
		super();
		this.listaPropietarios = new Propietario[10];
		this.listaPuestos = new Puesto[10][10];
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
	
	/**
	 * Punto 1: metodo que inicializa la matriz de puestos tal que quede con una fila de carros y otra fila de motos
	 */
	public void inicializarMatrizDePuestosIntercalados(){
		
		Iterator<Puesto[]> i = Arrays.asList(listaPuestos).iterator();
		while (i.hasNext()) {

			inicializarArregloConTipoVehiculo(i.next(), TipoVehiculo.CARRO);
			
			if (i.hasNext()) {
				
				inicializarArregloConTipoVehiculo(i.next(), TipoVehiculo.MOTO);
				
			}
		}
	}
	
	//igual que el metodo anterior pero lo hace sin iterables, aunque es mas susceptible a errores

//	public void inicializarMatrizDePuestosIntercalados(){
//		
//		for (int i = 0; i < listaPuestos.length; i+=2) {
//			inicializarArregloConTipoVehiculo(listaPuestos[i], TipoVehiculo.CARRO);
//		}
//		for (int i = 1; i < listaPuestos.length; i+=2) {
//			inicializarArregloConTipoVehiculo(listaPuestos[i], TipoVehiculo.CARRO);
//		}
//	}
	
	//Desde aqui empieza el CRUD de vehiculo
	
	/**
	 * Punto 2: este metodo crea un vehiculo con todos los parametros que este contiene,
	 * se asume que el parqueadero al que pertenece ese vehiculo es desde el que lo estamos creando
	 * @param placa
	 * @param modelo
	 * @param propietario
	 * @param tipoVehiculo
	 * @return
	 */
	public boolean crearVehiculo(String placa, String modelo, Propietario propietario, TipoVehiculo tipoVehiculo){
		
		try {
			
			Vehiculo vehiculo = new Vehiculo(placa, modelo, propietario, this, tipoVehiculo);
			listaVehiculos.add(vehiculo);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Punto 3: este metodo busca un vehiculo en la lista de vehiculos del parqueadero, unicamente
	 * por su placa, ya que es imposible que dos vehiculos tengan la misma placa
	 * @param placa
	 * @return
	 */
	public Vehiculo buscarVehiculo(String placa){
		
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo != null && vehiculo.verificarPlaca(placa)) {
				return vehiculo;
			}
		}
		
		return null;
	}
	
	/**
	 * Punto 4: este metodo elimina un vehiculo de la lista de vehiculos del parqueadero, unicamente
	 * validando su placa, se hace eso de la funcion buscar vehiculo para traer el vehiculo que debo eliminar
	 * @param placa
	 * @return
	 */
	public boolean eliminarVehiculo(String placa){
		
		try {
			
			Vehiculo vehiculoEncontrado = buscarVehiculo(placa);
			if (vehiculoEncontrado != null) {
				listaVehiculos.remove(vehiculoEncontrado);
			}
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	private void inicializarArregloConTipoVehiculo(Puesto[] arreglo, TipoVehiculo tipoVehiculo) {

		for (int i = 0; i < arreglo.length; i++) {
			
			if (arreglo[i] == null) {
				arreglo[i] = new Puesto();
			}
			
			arreglo[i].setTipoPuesto(tipoVehiculo);
		}
	}
	
}
