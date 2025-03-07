package DTO;

public class LocalidadDTO {
	private String id;
	private String nombre;
	private String provinciaId;
	private String municipioId;
	private String departamentoId;
	private String localidadCensalId;
	
	public LocalidadDTO() {
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
	public String getMunicipioId() {
		return municipioId;
	}
	public void setMunicipioId(String municipioId) {
		this.municipioId = municipioId;
	}
	public String getDepartamentoId() {
		return departamentoId;
	}
	public void setDepartamentoId(String departamentoId) {
		this.departamentoId = departamentoId;
	}
	public String getLocalidadCensalId() {
		return localidadCensalId;
	}
	public void setLocalidadCensalId(String localidadCensalId) {
		this.localidadCensalId = localidadCensalId;
	}
	
}
