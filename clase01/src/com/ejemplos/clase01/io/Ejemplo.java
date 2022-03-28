package com.ejemplos.clase01.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//copia de un archivo
public class Ejemplo {

	public static void main(String[] args) throws IOException{

		File inputFile = new File("C:\\Users\\dell\\Desktop\\archivos_java\\saludo.txt");
		File outputFile= new File("salida.txt");

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		int c;
		
		while( (c =in.read()) !=-1 ) {
			out.write(c);
		}
		
		in.close();
		out.close();
		
	}

}
