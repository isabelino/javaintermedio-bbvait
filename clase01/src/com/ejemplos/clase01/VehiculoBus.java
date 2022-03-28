package com.ejemplos.clase01;

public class VehiculoBus extends Vehiculo{

	private int capacidad;

	VehiculoBus(String color, int numMatricula,int capacidad) {
		super(color, numMatricula);
		this.capacidad= capacidad;
	}

	@Override
	public String toString() {
		return "VehiculoBus [capacidad=" + capacidad + ", toString()=" + super.toString() + "]";
	}
	
	

}
