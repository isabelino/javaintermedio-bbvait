package com.ejemplos.clase01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Refresh {

	public static void main(String[] args) {
		
		
		
		/*Persona objPersona = new Persona("Jose", "Perez", 220, "jp@email.com"); 		
		Persona objPersona2 = new Persona("Maria","Sanz",55,"ms@email.com"); 		
		Alumno alumno = new Alumno("Ramon","Ayala",30,"ra@email.com","matematicas","noche");
		System.out.println(alumno.mostrarTodo());
		*/
		Vehiculo coche1 = new VehiculoDeportivo("Amarillo",21245,300,2500);
		Vehiculo coche2 = new VehiculoBus("Negro", 323232, 50);
		
		System.out.print(coche1.toString());
		System.out.print(coche2.toString());
		
		
		
	
		
		
		//comentario en una sola linea
		/*
		 * comentarios en varias lineas
		 */
		//* 
		//comentarios en varias lineas
		//*
		
		//Declaracion
		// tipo de variable nombre o identificador valor opcional
		/*int numero = 10,numero2=15,numero3;
		String nombre ="Rolando";
		numero3 = numero+numero2;
			
		System.out.println("el resultado es :"+numero3);
		*/
		
		//Tipos de datos primitivos
		//byte valor=1;    valor por defecto 0
		//short valor1=1;	valor por defecto 0
		//int valor3=1212127;  valor por defecto 0
		//long valor4=121212121; valor por defecto 0L
		//float valor5=20.125f;	valor por defecto 0.0f
		//double valor6=15.22151;	valor por defecto 0.0d
		//char valor7 = 'A';	valor por defecto 'u0000'
		//String valor8 ="lo que quieras"; valor por defecto null
		//boolean valor9= true;	 valor por defecto false
		
		//System.out.println(valor7);
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese valores");
		String valor = sc.next();
		System.out.println("El resultado es:"+valor);*/
		
		//Operadores aritmeticos
		//suma + ejem: a+b
		//resta - ejem: a-b
		//multiplicacion * ejem: a*b
		//division / ejem: a/b
		//modulo o resto % ejem: a%b
		
		//Operadores de asignacion
		// = asignacion a=b
		// += suma y asignacion a+=b (a = a+b)
		// -= resta y asignacion a-=b (a =a-b)
		// *= multiplicacion y asignacion a*=b (a =a*b)
		// /= division y asignacion a/=b (a =a/b)
		// %= modulo y asignacion a%=b (a =a%b)
		
		//Operadores de relacion
		// == igualdad a==b
		// != distinto a!=b
		// <  Menor que a<b
		// >  Mayor que a>b
		// <= Menor o igual que a <= b
		// >= Mayor o igual que a >= b
		
		//comparar cadenas equals a.equals(b)
		//comparar cadenas sin tener en cuenta mayusculas o minusculas a.equalsIgnoreCase
		
		/*String nombre= "rolando";
		int edad=25;*/
		//condicional anidada
		/*if(edad==24) {
			System.out.println("su edad es 25");
		}else if(edad==25){
			System.out.println("su edad es 25");
		}else if(edad==30)
		System.out.println("su edad es 30");
		}*/
		
		/*if( nombre.equalsIgnoreCase("Rolando") ) {
			
			System.out.println("nombre correcto");
		}*/
		
		//Operadores logicos
		//And y &&
		//OR o ||
		//not no !
		
		/*if(nombre.equals("rolando") && edad == 25) {
			
			System.out.print("Ingreso");
		}*/
		
		//switch case
		
		/*int dia = 1;
		
		switch (dia) {
		
		case 1:
			System.out.print("lunes");
		break;
		
		case 2:
			System.out.print("Martes");
		break;
		
		case 3:
			System.out.print("Miercoles");
		break;
		
		default:
			System.out.print("No es ninguna de las anteriores");
		}*/
		
		//Estructuras repetitivas
		//for
		/*for(int i=1;i <= 100;i++) {
			System.out.println(i);
		}*/

		//int x=1;
		/*while(x <= 50) {
			System.out.println(x);
			x= x+1;
		}*/
		
		/*do {
			System.out.println(x);
			x++;
		} while (x<=100);*/
		
		
		//Arrays
		//declaraciones
		/*String array[];
		array = new String[10];*/
		//String array[] = new String[10];
		
		/*Scanner sc = new Scanner(System.in);
		
		String nombres[] = new String[3];
		
		for (int i = 0; i < nombres.length; i++) {		
			System.out.println("Ingresar nombres");
			nombres[i]= sc.nextLine();	
		}
		
		for (int x = 0; x < nombres.length; x++) {
			System.out.println(nombres[x]);
		}*/
		
		//Colecciones
		//SET
		
		/*Set<String> frutas = new HashSet();
		frutas.add("manzana");
		frutas.add("pera");
		frutas.add("fresa");
		frutas.add("naranja");
		frutas.remove("pera");
		
		for(String s: frutas) {
			System.out.println(s);
		}*/
		
		//ArrayList
		/*ArrayList<String> coches = new ArrayList<String>();
		coches.add("volvo");
		coches.add("Ford");
		coches.add("BMW");
		coches.add("Mazda");
		coches.add("Ferrari");
		coches.set(0,"Opel");
		coches.remove("Ford");
		coches.clear();
		System.out.println(coches);*/
		
		//agregar elementos coches.add("Ferrari")
		//acceder a un elemento seria por coches.get(0)
		//modificar un elemento coches.set(0,"Opel")
		//eliminar un elemento coches.remove(0)
		//eliminar todos los elementos del array coches.clear()
		
		//Hasmap
		/*HashMap<String,String> capitalesCiudades = new HashMap<String,String>();
		capitalesCiudades.put("Spain", "Madrid");
		capitalesCiudades.put("Germany","Berlin");
		capitalesCiudades.put("Norway", "Oslo");
		capitalesCiudades.put("USA","Washington DC");
		
		capitalesCiudades.put("France","Paris");
		capitalesCiudades.replace("Germany", "fjalkfjakljf");
		capitalesCiudades.remove("USA");
		capitalesCiudades.clear();
		
		System.out.print(capitalesCiudades);*/
		
		//agregar elementos capitalesCiudades.put("France","Paris");
		//acceder a un elemento capitalesCiudades.get("Germany");
		//modificar un elemento capitalesCiudades.replace("Germany", "fjalkfjakljf");
		//eliminar capitalCiudades.remove("Norway")
		//eliminar todos los elementos capitalesCiudades.clear();
		

	}

}
