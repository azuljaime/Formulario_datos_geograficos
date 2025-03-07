package Util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LectorDeArchivosUtil {
	
	public static List<String[]> leerArchivo(String uriArchivo){
		ArrayList<String[]> listaDatos = new ArrayList<String[]>();
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		try {
			//System.out.println("Leyendo archivo");
			//System.out.println("Ruta del archivo : " + uriArchivo);
		    br = new BufferedReader(new FileReader(uriArchivo));
		    while ((line = br.readLine()) != null) {                
		        String[] datos = line.split(cvsSplitBy);
		       listaDatos.add(datos);
		    }
		    
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    if (br != null) {
		        try {
		            br.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}	
		return quitarEncabezadoDeLaLista(listaDatos);
	}
	
	private static List<String[]> quitarEncabezadoDeLaLista(List<String[]> listaDatos){
		Boolean seObtuvoPrimerElemento = false;
		ArrayList<String[]> nuevaListaDatos = new ArrayList<String[]>();
		for(String[] datos : listaDatos) {
			if(seObtuvoPrimerElemento) {	
				nuevaListaDatos.add(datos);
			}
			seObtuvoPrimerElemento = true;
		}
		return nuevaListaDatos;
	}
	
	public static String obtenerEnFormatoDeVariable(String dato) {
		return dato.substring(1, dato.length() - 1);
	}
}
