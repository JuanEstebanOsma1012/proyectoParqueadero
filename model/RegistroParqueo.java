package model;

public class RegistroParqueo {

	private String fecha;
	private String horaLlegada;
	private String horaSalida;
	private Double total;
	
	private Parqueadero parqueadero;
	private Puesto puesto;
	private Vehiculo vehiculo;
	
	public RegistroParqueo(String fecha, String horaLlegada, String horaSalida, Double total, Parqueadero parqueadero,
			Puesto puesto, Vehiculo vehiculo) {
		super();
		this.fecha = fecha;
		this.horaLlegada = horaLlegada;
		this.horaSalida = horaSalida;
		this.total = total;
		this.parqueadero = parqueadero;
		this.puesto = puesto;
		this.vehiculo = vehiculo;
	}
	
	public RegistroParqueo() {
		super();
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Parqueadero getParqueadero() {
		return parqueadero;
	}

	public void setParqueadero(Parqueadero parqueadero) {
		this.parqueadero = parqueadero;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "RegistroParqueo [fecha=" + fecha + ", horaLlegada=" + horaLlegada + ", horaSalida=" + horaSalida
				+ ", total=" + total + ", parqueadero=" + parqueadero + ", puesto=" + puesto + ", vehiculo=" + vehiculo
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
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
		RegistroParqueo other = (RegistroParqueo) obj;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		return true;
	}
	
}
