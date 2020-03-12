package clasesSeleccion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\formacion\\eclipse-workspace\\infoSeleccionFutbol.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(fileReader);
			ArrayList<SeleccionFutbol> lstSeleccion = new ArrayList<SeleccionFutbol>();
			String linea = "";
			int contId = 1;
			
			
			while((linea = buffReader.readLine()) != null) {
				String[] info = linea.split("~");
				Entrenador seleccion = new Entrenador();
				
				seleccion.setId(contId);
				seleccion.setNombres(info[1]);
				seleccion.setApellidos(info[2]);
				seleccion.setEdad(Integer.parseInt(info[3]));
				
				if(info[0].equals("E"))
					seleccion.setIdFederacion(Integer.parseInt(info[4]));
					
				lstSeleccion.add(seleccion);
				contId++;
			}

			for (SeleccionFutbol seleccion : lstSeleccion) {
				
				if(((Entrenador)seleccion).getIdFederacion() == 0) {
					System.out.println("==== SELECCION ====");
					((Entrenador)seleccion).Viajar();
					((Entrenador)seleccion).Concentrarse();
					((Entrenador)seleccion).PartidoFutbol();
					System.out.println("=================");
				}else {
					System.out.println("==== ENTRENADOR ====");
					((Entrenador)seleccion).Viajar();
					((Entrenador)seleccion).Concentrarse();
					((Entrenador)seleccion).PartidoFutbol();
					((Entrenador)seleccion).PlanificarEntrenamiento();
					((Entrenador)seleccion).Entrenamiento();
					System.out.println("=================");
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		
	}

}
