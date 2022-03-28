package com.ejemplos.clase01.io;

import java.io.FileInputStream;
import java.io.IOException;


//mostrando datos desde un archivo
public class Ejemplo2 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream archivoEntrada = new FileInputStream("C:\\Users\\dell\\Desktop\\archivos_java\\miarchivo.txt");
			byte buffer[]= new byte[20];
			
			int numBytes;
			
			do {
				numBytes = archivoEntrada.read(buffer);
				System.out.write(buffer, 0, numBytes);
			}while(numBytes == buffer.length);
			
			
		} catch (IOException e) {
			System.err.println("fallo de lectura");
		}

	}

}
