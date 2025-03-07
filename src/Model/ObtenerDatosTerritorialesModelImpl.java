package Model;

import java.util.ArrayList;
import java.util.List;

import DTO.CalleDTO;
import DTO.DepartamentoDTO;
import DTO.LocalidadDTO;
import DTO.MunicipioDTO;
import DTO.ProvinciaDTO;
import Util.Constantes;
import Util.DatosTerritorialesUtil;
import Util.LectorDeArchivosUtil;

public class ObtenerDatosTerritorialesModelImpl implements ObtenerDatosTerritorialesModel {
	
	private static final List<String[]> datosArchivoProvincias = LectorDeArchivosUtil.leerArchivo(Constantes.ARCHIVO_PROVINCIAS);
	private static final List<String[]> datosArchivoMunicipios = LectorDeArchivosUtil.leerArchivo(Constantes.ARCHIVO_MUNICIPIOS);
	private static final List<String[]> datosArchivoDepartamentos = LectorDeArchivosUtil.leerArchivo(Constantes.ARCHIVO_DEPARTAMENTOS);
	private static final List<String[]> datosArchivoLocalidades = LectorDeArchivosUtil.leerArchivo(Constantes.ARCHIVO_LOCALIDADES);
	private static final List<String[]> datosArchivoCalles = LectorDeArchivosUtil.leerArchivo(Constantes.ARCHIVO_CALLES);
	
	@Override
	public List<ProvinciaDTO> obtenerProvincias() {
		//System.out.println("Obteniendo provincias");
		List<ProvinciaDTO> provincias = new ArrayList<>();
		for(String[] datos : datosArchivoProvincias) {
			//System.out.println("id: " + datos[4] + " - nombre: " + datos[7]);
			ProvinciaDTO provincia = new ProvinciaDTO();
			provincia.setId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[4]));
			provincia.setNombre(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[7]));
			provincias.add(provincia);
		}
		return DatosTerritorialesUtil.obtenerProvinciasOrdenadasAlfabeticamente(provincias);
	}

	@Override
	public List<MunicipioDTO> obtenerMunicipios() {
		//System.out.println("Obteniendo municipios");
		List<MunicipioDTO> municipios = new ArrayList<>();
		for(String[] datos : datosArchivoMunicipios) {
			//System.out.println("id: " + datos[4] + " - nombre: " + datos[5] + " - provinciaId: " + datos[7]);
			MunicipioDTO municipio = new MunicipioDTO();
			municipio.setId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[4]));
			municipio.setNombre(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[5]));
			municipio.setProvinciaId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[7]));
			municipios.add(municipio);
		}
		return DatosTerritorialesUtil.obtenerMunicipiosOrdenadosAlfabeticamente(municipios);
	}

	@Override
	public List<DepartamentoDTO> obtenerDepartamentos() {
		//System.out.println("Obteniendo departamentos");
		List<DepartamentoDTO> departamentos = new ArrayList<>();
		for(String[] datos : datosArchivoDepartamentos) {
			//System.out.println("id: " + datos[4] + " - nombre: " + datos[5] + " - provinciaId: " + datos[9]);
			DepartamentoDTO departamento = new DepartamentoDTO();
			departamento.setId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[4]));
			departamento.setNombre(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[5]));
			departamento.setProvinciaId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[7]));
			departamentos.add(departamento);
		}
		
		return departamentos;
	}

	@Override
	public List<LocalidadDTO> obtenerLocalidades() {
		//System.out.println("Obteniendo localidades");
		List<LocalidadDTO> localidades = new ArrayList<>();
		for(String[] datos : datosArchivoLocalidades) {
			//System.out.println("id: " + datos[6] + " - nombre: " + datos[11] + " - provinciaId: " + datos[12] + " - municipioId: - " + datos[9] + " - departamentoId:  " + datos[3]);
			LocalidadDTO localidad = new LocalidadDTO();
			localidad.setId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[6]));
			localidad.setNombre(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[11]));
			localidad.setProvinciaId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[12]));
			localidad.setMunicipioId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[9]));
			localidad.setDepartamentoId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[3]));
			localidad.setLocalidadCensalId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[7]));
			localidades.add(localidad);
		}
		
		return DatosTerritorialesUtil.obtenerLocalidadesOrdenadasAlfabeticamente(localidades);
	}
	
	@Override
	public List<CalleDTO> obtenerCalles() {
		//System.out.println("Obteniendo calles");
		List<CalleDTO> calles = new ArrayList<>();
			for(String[] datos : datosArchivoCalles) {
				//System.out.println("id: " + datos[8] + " - nombre: " + datos[11] + " - provinciaId: " + datos[12] + " - localidadId: - " + datos[9]);
				CalleDTO calle = new CalleDTO();
				calle.setId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[8]));
				calle.setNombre(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[11]));
				calle.setProvinciaId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[12]));
				calle.setLocalidadId(LectorDeArchivosUtil.obtenerEnFormatoDeVariable(datos[9]));
				calles.add(calle);
			}
				
		return DatosTerritorialesUtil.obtenerCallesOrdenadasAlfabeticamente(calles);
	}
	
	@Override
	public ProvinciaDTO obtenerProvinciaPorId(String provinciaId) {
		//System.out.println("Obteniendo provincia id" + provinciaId);
		return DatosTerritorialesUtil.filtrarProvinciaPorId(this.obtenerProvincias(), provinciaId);
	}


	@Override
	public List<MunicipioDTO> obtenerMunicipiosPorProvincia(String provinciaId) {
		//System.out.println("Obteniendo municipios para la provincia id " + provinciaId);	
		return DatosTerritorialesUtil.filtrarMunicipiosPorProvincia(this.obtenerMunicipios(), provinciaId);
	}

	@Override
	public List<DepartamentoDTO> obtenerDepartamentosPorProvincia(String provinciaId) {
		//System.out.println("Obteniendo departamentos para la provincia id " + provinciaId);
		return DatosTerritorialesUtil.filtrarDepartamentosPorProvincia(this.obtenerDepartamentos(), provinciaId);
	}

	@Override
	public List<LocalidadDTO> obtenerLocalidadesPorMunicipio(String municipioId) {
		//System.out.println("Obteniendo localidades para el municipio id " + municipioId);
		return DatosTerritorialesUtil.filtrarLocalidadesPorMunicipio(this.obtenerLocalidades(), municipioId);
	}

	

	@Override
	public List<CalleDTO> obtenerCallesPorProvincia(String provinciaId) {
		//System.out.println("Obteniendo calles para la provincia id " + provinciaId);
		return DatosTerritorialesUtil.filtrarCallesPorProvincia(this.obtenerCalles(), provinciaId);
	}

	@Override
	public List<CalleDTO> obtenerCallesPorLocalidad(String localidadId) {
		//System.out.println("Obteniendo calles para la localidad id " + localidadId);
		return DatosTerritorialesUtil.filtrarCallesPorLocalidad(this.obtenerCalles(), localidadId);
	}

	@Override
	public List<CalleDTO> obtenerCallesPorProvinciaYLocalidad(String provinciaId, String localidadId) {
		return DatosTerritorialesUtil.filtrarCallesPorLocalidad(this.obtenerCallesPorProvincia(provinciaId), localidadId);
	}

	

	

	
}
