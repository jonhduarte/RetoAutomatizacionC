package demo.serenity.pruebas.models;
/**
 * @author Jduarte
 *
 */
public class DatosPrincipales {

	String usuario;
	String clave;
	String nombrenegocio;
	String nombrereunion;
	String tiporeunion;
	String numeroreunion;
	String fechainicio;
	String horainicio;
	String fechafin;
	String horafin;
	String localizacion;
	String unit;
	String organizador;
	String responsable;
	String asistentes;
	
	public DatosPrincipales(String usuario, String clave, String nombrenegocio, String nombrereunion,
			String tiporeunion, String numeroreunion, String fechainicio, String horainicio, String fechafin,
			String horafin, String localizacion, String unit, String organizador, String responsable,
			String asistentes) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.nombrenegocio = nombrenegocio;
		this.nombrereunion = nombrereunion;
		this.tiporeunion = tiporeunion;
		this.numeroreunion = numeroreunion;
		this.fechainicio = fechainicio;
		this.horainicio = horainicio;
		this.fechafin = fechafin;
		this.horafin = horafin;
		this.localizacion = localizacion;
		this.unit = unit;
		this.organizador = organizador;
		this.responsable = responsable;
		this.asistentes = asistentes;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getClave() {
		return clave;
	}

	public String getNombrenegocio() {
		return nombrenegocio;
	}

	public String getNombrereunion() {
		return nombrereunion;
	}

	public String getTiporeunion() {
		return tiporeunion;
	}

	public String getNumeroreunion() {
		return numeroreunion;
	}

	public String getFechainicio() {
		return fechainicio;
	}

	public String getHorainicio() {
		return horainicio;
	}

	public String getFechafin() {
		return fechafin;
	}

	public String getHorafin() {
		return horafin;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public String getUnit() {
		return unit;
	}

	public String getOrganizador() {
		return organizador;
	}

	public String getResponsable() {
		return responsable;
	}

	public String getAsistentes() {
		return asistentes;
	}

}
