package DTO;

public class MunicipioDTO {
	private String id;
	private String nombre;
	private String provinciaId;
	public MunicipioDTO() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProvinciaId() {
		return provinciaId;
	}
	public void setProvinciaId(String provinciaId) {
		this.provinciaId = provinciaId;
	}
	
	public MunicipioDTO mapFromDepartamentoDTO(DepartamentoDTO departamento) {
		MunicipioDTO municipio = new MunicipioDTO();
		municipio.setId(departamento.getId());
		municipio.setNombre(departamento.getNombre());
		municipio.setProvinciaId(departamento.getProvinciaId());
		return municipio;
	}
}
