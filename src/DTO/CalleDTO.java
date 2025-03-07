package DTO;

public class CalleDTO {

	private String id;
	private String nombre;
	private String provinciaId;
	private String localidadId;
	
	public CalleDTO() {
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
	public String getLocalidadId() {
		return localidadId;
	}
	public void setLocalidadId(String localidadId) {
		this.localidadId = localidadId;
	}
	
	
}
