package model;

public enum TipoVehiculo {

	MOTO(0), CARRO(1);
	int id;
	
	TipoVehiculo(int num){
		id = num;
	}
	
	TipoVehiculo(){
		id = 0;
	}
	
	public int getId(){
		return id;
	}
	
}
