package com.ejemplos.clase01;

public class VehiculoDeportivo extends Vehiculo{

	private int cilindrada;
	private int motor;
	
	VehiculoDeportivo(String color, int numMatricula,int cilindrada,int motor) {
		super(color, numMatricula);
		this.cilindrada= cilindrada;
		this.motor= motor;
		
	}

	@Override
	public String toString() {
		return "VehiculoDeportivo [cilindrada=" + cilindrada + ", motor=" + motor + ", toString()=" + super.toString()
				+ "]";
	}


	
	

}
