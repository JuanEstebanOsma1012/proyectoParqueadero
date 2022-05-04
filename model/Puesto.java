package model;

public class Puesto {

	private String numero;
	private String estado;
	private Double precio;
	
	private TipoVehiculo tipoPuesto;
	private Parqueadero parqueadero;
	
	public Puesto(String numero, String estado, Double precio, TipoVehiculo tipoPuesto, Parqueadero parqueadero) {
		super();
		this.numero = numero;
		this.estado = estado;
		this.precio = precio;
		this.tipoPuesto = tipoPuesto;
		this.parqueadero = parqueadero;
	}
	
	public Puesto() {
		super();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public TipoVehiculo getTipoPuesto() {
		return tipoPuesto;
	}

	public void setTipoPuesto(TipoVehiculo tipoPuesto) {
		this.tipoPuesto = tipoPuesto;
	}

	public Parqueadero getParqueadero() {
		return parqueadero;
	}

	public void setParqueadero(Parqueadero parqueadero) {
		this.parqueadero = parqueadero;
	}

	@Override
	public String toString() {
		return "Puesto [numero=" + numero + ", estado=" + estado + ", precio=" + precio + ", tipoPuesto=" + tipoPuesto
				+ ", parqueadero=" + parqueadero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Puesto other = (Puesto) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	
}
