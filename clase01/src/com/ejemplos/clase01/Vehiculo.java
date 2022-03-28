package com.ejemplos.clase01;

public class Vehiculo {

		private String color;
		private int numMatricula;
		
		Vehiculo(String color,int numMatricula){
			this.color= color;
			this.numMatricula= numMatricula;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getNumMatricula() {
			return numMatricula;
		}

		public void setNumMatricula(int numMatricula) {
			this.numMatricula = numMatricula;
		}

		@Override
		public String toString() {
			return "Vehiculo [color=" + color + ", numMatricula=" + numMatricula + "]";
		}
	    
		
		
}
