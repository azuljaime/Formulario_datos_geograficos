import java.util.List;
import java.util.Scanner;

import DTO.*;
import Model.ObtenerDatosTerritorialesModelImpl;

public class Formulario {
	
	private static ObtenerDatosTerritorialesModelImpl obtenerDatosTerritoriales = new ObtenerDatosTerritorialesModelImpl();
	
	public static void main(String[] args) {
		Integer opcionesPorLinea = 0;
		Scanner scanner = new Scanner(System.in);
		
		/*************************PRIMER PANTALLA*********************************/
		
		System.out.println("Bienvenido");
		System.out.println("Ingrese su nombre");
		String nombre = scanner.nextLine();
		
		
		/*************************SEGUNDA PANTALLA*********************************/
		
		System.out.println("Ingrese su apellido");
		String apellido = scanner.nextLine();
		

		/*************************TERCER PANTALLA*********************************/
		
		System.out.println("Ingrese su Nº de documento");
		String dni = scanner.nextLine();
 
		/*************************CUARTA PANTALLA*********************************/
		
		System.out.println("Por favor, seleccione una provincia");
		System.out.println(" ");
		List<ProvinciaDTO> provincias = obtenerDatosTerritoriales.obtenerProvincias();
		
		for(ProvinciaDTO provincia : provincias) {
			if(opcionesPorLinea <=5) {
				opcionesPorLinea++;
				System.out.print(provincias.indexOf(provincia) + "-" + provincia.getNombre() + "  ");
			}else {
				opcionesPorLinea = 0;
				System.out.println(" ");
				System.out.println(" ");
			}
		}
		
		opcionesPorLinea = 0;
		System.out.println(" ");
		ProvinciaDTO provinciaSeleccionada = provincias.get(Integer.parseInt(scanner.nextLine()));
		
		
		/*************************QUINTA PANTALLA*********************************/
		
		System.out.println("Por favor, seleccione un municipio");
		List<MunicipioDTO> municipios = obtenerDatosTerritoriales.obtenerMunicipiosPorProvincia(provinciaSeleccionada.getId());
		for(MunicipioDTO municipio : municipios) {
			if(opcionesPorLinea <=5) {
				opcionesPorLinea++;
				System.out.print(municipios.indexOf(municipio) + "-" + municipio.getNombre() + "  ");
			}else {
				opcionesPorLinea = 0;
				System.out.println(" ");
				System.out.println(" ");
			}
		}
		opcionesPorLinea = 0;
		System.out.println(" ");
		MunicipioDTO municipioSeleccionado = municipios.get(Integer.parseInt(scanner.nextLine()));
		
		
		/*************************SEXTA PANTALLA*********************************/
		
		System.out.println("Por favor, seleccione una localidad");
		List<LocalidadDTO> localidades = obtenerDatosTerritoriales.obtenerLocalidadesPorMunicipio(municipioSeleccionado.getId());
		for(LocalidadDTO localidad : localidades) {
			if(opcionesPorLinea <=5){
				opcionesPorLinea++;
				System.out.print(localidades.indexOf(localidad) + "-" + localidad.getNombre() + "  ");
			}else {
				opcionesPorLinea = 0;
				System.out.println(" ");
				System.out.println(" ");
			}
		}
		opcionesPorLinea = 0;
		System.out.println(" ");
		LocalidadDTO localidadSeleccionada = localidades.get(Integer.parseInt(scanner.nextLine()));
		
		
		/*************************SEPTIMA PANTALLA*********************************/
		
		System.out.println("Por favor, seleccione una calle");
		List<CalleDTO> calles = obtenerDatosTerritoriales.obtenerCallesPorLocalidad(localidadSeleccionada.getLocalidadCensalId());
		for(CalleDTO calle : calles) {
			if(opcionesPorLinea <=5){
				opcionesPorLinea++;
				System.out.print(calles.indexOf(calle) + "-" + calle.getNombre() + "  ");
			}else {
				opcionesPorLinea = 0;
				System.out.println(" ");
				System.out.println(" ");
			}
		}
		opcionesPorLinea = 0;
		System.out.println(" ");
		CalleDTO calleSeleccionada = calles.get(Integer.parseInt(scanner.nextLine()));
		
		/*************************OCTAVA PANTALLA*********************************/
		
		System.out.println("Ingrese la altura");
		String altura = scanner.nextLine();
		
		
		/*************************NOVENA PANTALLA*********************************/
		
		System.out.println("Por favor, ingrese la primer entre calle");
		for(CalleDTO calle : calles) {
			if(opcionesPorLinea <=5){
				opcionesPorLinea++;
				System.out.print(calles.indexOf(calle) + "-" + calle.getNombre() + "  ");
			}else {
				opcionesPorLinea = 0;
				System.out.println(" ");
				System.out.println(" ");
			}
			
		}
		opcionesPorLinea = 0;
		System.out.println(" ");
		CalleDTO entreCalle1 = calles.get(Integer.parseInt(scanner.nextLine())); 
		
		
		/*************************DECIMA PANTALLA*********************************/
		
		System.out.println("Por favor, ingrese la segunda entre calle");
		for(CalleDTO calle : calles) {
			if(opcionesPorLinea <=5){
				opcionesPorLinea++;
				System.out.print(calles.indexOf(calle) + "-" + calle.getNombre() + "  ");
			}else {
				opcionesPorLinea = 0;
				System.out.println(" ");
				System.out.println(" ");
			}
		}
		opcionesPorLinea = 0;
		System.out.println(" ");
		CalleDTO entreCalle2 = calles.get(Integer.parseInt(scanner.nextLine())); 

		/*************************ULTIMA PANTALLA*********************************/
		
		System.out.println("Por favor, verifique que los datos ingresados sean correctos");
		System.out.println("");
		System.out.println("DATOS PERSONALES");
		System.out.println("");
		System.out.println("Nombre completo: " + nombre.toUpperCase() + " " + apellido.toUpperCase() + " Nº de documento: " + dni);
		System.out.println("");
		System.out.println("DOMICILIO");
		System.out.println("");
		System.out.println("Provincia: " + provinciaSeleccionada.getNombre() + " Municipio: " + municipioSeleccionado.getNombre() + " Localidad: " + localidadSeleccionada.getNombre());
		System.out.println("");
		System.out.println("DIRECCION");
		System.out.println("");
		System.out.println("Calle: " + calleSeleccionada.getNombre() + " Altura: " + altura + " entrecalle1: " + entreCalle1.getNombre() + " entrecalle2: " + entreCalle2.getNombre());
	}
	
	
}
