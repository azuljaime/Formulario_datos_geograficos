package Util;

import java.util.List;
import java.util.stream.Collectors;

import DTO.CalleDTO;
import DTO.DepartamentoDTO;
import DTO.LocalidadDTO;
import DTO.MunicipioDTO;
import DTO.ProvinciaDTO;

public class DatosTerritorialesUtil {
	
	public static ProvinciaDTO filtrarProvinciaPorId(List<ProvinciaDTO> provincias, String provinciaId){
		return provincias.stream().filter(p -> p.getId().equals(provinciaId)).findFirst().get();
	}
	
	public static MunicipioDTO filtrarMunicipioPorId(List<MunicipioDTO> municipios, String municipioId){
		return municipios.stream().filter(p -> p.getId().equals(municipioId)).findFirst().get();
	}
	
	public static LocalidadDTO filtrarLocalidadPorId(List<LocalidadDTO> localidades, String localidadId){
		return localidades.stream().filter(p -> p.getId().equals(localidadId)).findFirst().get();
	}
	
	public static List<MunicipioDTO> filtrarMunicipiosPorProvincia(List<MunicipioDTO> municipios, String provinciaId){
		return municipios.stream().filter(m -> m.getProvinciaId().equals(provinciaId)).collect(Collectors.toList());
	}
	
	public static List<DepartamentoDTO> filtrarDepartamentosPorProvincia(List<DepartamentoDTO> departamentos, String provinciaId){
		return departamentos.stream().filter(d -> d.getProvinciaId().equals(provinciaId)).collect(Collectors.toList());
	}
	
	public static List<LocalidadDTO> filtrarLocalidadesPorMunicipio(List<LocalidadDTO> localidades, String municipioId){
		return localidades.stream().filter(l -> l.getMunicipioId().equals(municipioId)).collect(Collectors.toList());
	}
	
	public static List<CalleDTO> filtrarCallesPorProvincia(List<CalleDTO> calles, String provinciaId){
		return calles.stream().filter(c -> c.getProvinciaId().equals(provinciaId)).collect(Collectors.toList());
	}
	
	public static List<CalleDTO> filtrarCallesPorLocalidad(List<CalleDTO> calles, String localidadId){
		return calles.stream().filter(c -> c.getLocalidadId().equals(localidadId)).collect(Collectors.toList());
	}
	
	public static List<ProvinciaDTO> obtenerProvinciasOrdenadasAlfabeticamente(List<ProvinciaDTO> provincias){
		provincias.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
		return provincias;
	}
	
	public static List<MunicipioDTO> obtenerMunicipiosOrdenadosAlfabeticamente(List<MunicipioDTO> municipios){
		municipios.sort((m1, m2) -> m1.getNombre().compareTo(m2.getNombre()));
		return municipios;
	}
	
	public static List<LocalidadDTO> obtenerLocalidadesOrdenadasAlfabeticamente(List<LocalidadDTO> localidades){
		localidades.sort((l1, l2) -> l1.getNombre().compareTo(l2.getNombre()));
		return localidades;
	}
	
	public static List<CalleDTO> obtenerCallesOrdenadasAlfabeticamente(List<CalleDTO> calles){
		calles.sort((c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));
		return calles;
	}
	
	
}

