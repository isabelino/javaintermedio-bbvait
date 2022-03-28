package com.ejemplos.clase01.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//agregar datos a un archivo
public class Ejemplo3 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream archivo = new FileOutputStream("C:\\Users\\dell\\Desktop\\archivos_java\\datos.txt");
			DataOutputStream flujo = new DataOutputStream(archivo);
			

			
			flujo.writeInt(2);
			flujo.writeUTF("Rolando");
			flujo.writeDouble(3.1412121);
			flujo.writeDouble(2000.5);
			
			flujo.close();
			archivo.close();
			
		} catch (IOException e) {
			System.err.println("fallo");
		}
		
		//mostrar datos desde archivo
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\archivos_java\\\\datos.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			int n = dis.readInt();
			System.out.println(n);
		
			System.out.println(dis.readUTF());
	
			
			for (int i = 0; i < n ;i++) {
				System.out.println(dis.readDouble());
			}
			
			dis.close();
			fis.close();
			
		} catch (IOException e) {
			System.err.println("fallo");
		}

	}

}
