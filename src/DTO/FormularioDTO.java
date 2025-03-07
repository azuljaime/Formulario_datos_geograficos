package DTO;

public class FormularioDTO {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String provinciaId;
	private String municipioId;
	private String localidadId;
	
	public FormularioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public String getLocalidadId() {
		return localidadId;
	}
	public void setLocalidadId(String localidadId) {
		this.localidadId = localidadId;
	}
	
	
}
