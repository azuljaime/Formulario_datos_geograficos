package Model;

import java.util.List;

import DTO.CalleDTO;
import DTO.DepartamentoDTO;
import DTO.LocalidadDTO;
import DTO.MunicipioDTO;
import DTO.ProvinciaDTO;

public interface ObtenerDatosTerritorialesModel {
	public List<ProvinciaDTO> obtenerProvincias();
	public List<MunicipioDTO> obtenerMunicipios();
	public List<DepartamentoDTO> obtenerDepartamentos();
	public List<LocalidadDTO> obtenerLocalidades();
	public List<CalleDTO> obtenerCalles();
	
	
	public ProvinciaDTO obtenerProvinciaPorId(String provinciaId);
	public List<MunicipioDTO> obtenerMunicipiosPorProvincia(String provinciaId);
	public List<DepartamentoDTO> obtenerDepartamentosPorProvincia(String provinciaId);
	public List<LocalidadDTO> obtenerLocalidadesPorMunicipio(String municipioId);
	
	public List<CalleDTO> obtenerCallesPorProvincia(String provinciaId);
	public List<CalleDTO> obtenerCallesPorLocalidad(String localidadId);
	public List<CalleDTO> obtenerCallesPorProvinciaYLocalidad(String provinciaId, String localidadId);
}
