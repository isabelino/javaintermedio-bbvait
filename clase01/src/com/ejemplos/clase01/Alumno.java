package com.ejemplos.clase01;

public class Alumno extends Persona{

	private String clases;
	private String grupo;
	
	Alumno(String name,String lastname,int age,String email,String clases,String grupo){
		super(name,lastname,age,email);
		this.clases= clases;
		this.grupo= grupo;
	}

	
	public String mostrarTodo() {
		return super.mostrarTodo() +" clases:"+this.clases+" grupo:"+this.grupo;
	}

	
	
	
	
}
