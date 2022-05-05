package model;

public class Vehiculo {

	private String placa;
	private String modelo;
	
	private Propietario propietario;
	private Parqueadero parqueadero;
	
	private TipoVehiculo tipoVehiculo;

	public Vehiculo(String placa, String modelo, Propietario propietario, Parqueadero parqueadero,
			TipoVehiculo tipoVehiculo) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.propietario = propietario;
		this.parqueadero = parqueadero;
		this.tipoVehiculo = tipoVehiculo;
	}

	public Vehiculo() {
		super();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Parqueadero getParqueadero() {
		return parqueadero;
	}

	public void setParqueadero(Parqueadero parqueadero) {
		this.parqueadero = parqueadero;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", modelo=" + modelo + ", propietario=" + propietario + ", parqueadero="
				+ parqueadero + ", tipoVehiculo=" + tipoVehiculo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	public boolean verificarPlaca(String placa) {
		return this.placa.equals(placa);
	}
	
}
