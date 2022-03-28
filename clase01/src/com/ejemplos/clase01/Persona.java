package com.ejemplos.clase01;

public class Persona {
	
	//atributos o variables
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	

	
	Persona(String name,String lastname,int age,String email){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if( !(nombre.equals("Jose")) ){
			this.nombre = nombre;
		}else {
			System.out.print("no se puede asignar");
		}
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String mostrarTodo() {
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + ", edad=" + this.edad + ", email=" + this.email + "]";
	}
	
	
	

}
