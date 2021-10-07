package demo.serenity.pruebas.steps;


import demo.serenity.pruebas.pageobjects.AutomatizacionPageObject;
import net.thucydides.core.annotations.Step;

public class AutomatizacionStep {

	AutomatizacionPageObject PageObject = new AutomatizacionPageObject();

	@Step
	public void abrirnavegador() {
		PageObject.open();
	}
	@Step
	public void escribirUsuario(String Usuario) {
		PageObject.EscribirUsuario(Usuario);
	}
	@Step
	public void escribirClave(String Clave) {
		PageObject.EscribirClave(Clave);
	}
	@Step
	public void clickBotonInicioSesion() {
		PageObject.BotonInicioSesion();
	}
	@Step
	public void clickBotonOrganizacion() {
		PageObject.BotonOrganizacion();
	}
	@Step
	public void clikcBotonUnidadNeg() {
		PageObject.BotonUnidadNeg();
	}
	@Step
	public void clickBotonNuevoNeg() {
		PageObject.BotonNuevoNeg();
	}
	@Step
	public void escribirNombreNeg(String NombreNeg) {
		PageObject.EscribirNombreNeg(NombreNeg);
	}
	@Step
	public void clickBotonGuardarNeg() {
		PageObject.BotonGuardarNeg();
	}
	@Step
	public void Validarcomparaciontexto() {
		PageObject.ValidacionTexto();
	}
	@Step
	public void clickBotonReunion() {
		PageObject.BotonReunion();
	}
	@Step
	public void clickBotonReuniones() {
		PageObject.BotonReuniones();
	}
	@Step
	public void clickBotonAgendarReunion() {
		PageObject.BotonAgendarReunion();
	}
	@Step
	public void escribirNombreReunion(String NombreReunion) {
		PageObject.EscribirNombreReunion(NombreReunion);
	}
	@Step
	public void escribirTipoReunion(String TipoReunion) {
		PageObject.EscribirTipoReunion(TipoReunion);
	}
	@Step
	public void escribirNumeroReunion(String NumeroReunion) {
		PageObject.EscribirNumeroReunion(NumeroReunion);
	}
	@Step
	public void escribirFechaInicio(String FechaInicio) {
		PageObject.EscribirFechaIninio(FechaInicio);
	}
	@Step
	public void escribirHoraInicio(String HoraInicio) {
		PageObject.EscribirHoraInicio(HoraInicio);
	}
	@Step
	public void escribirFechaFin(String FechaFin) {
		PageObject.EscribirFechaFin(FechaFin);
	}
	@Step
	public void escribirHoraFin(String HoraFin) {
		PageObject.EscribirHoraFin(HoraFin);
	}
	@Step
	public void escribirLocalizacion(String Localizacion) {
		PageObject.EscribirLocalizacion(Localizacion);
	}
	@Step
	public void escribirUnit(String Unit) {
		PageObject.EscribirUnit(Unit);
	}
	@Step
	public void escribirOrganizador(String Organizador) {
		PageObject.EscribirOrganizador(Organizador);
	}
	@Step
	public void escribirResponsable(String Responsable) {
		PageObject.EscribirResponsable(Responsable);
	}
	@Step
	public void escribirAsistentes(String Asistentes) {
		PageObject.EscribirAsistentes(Asistentes);
	}
	@Step
	public void clickBotonGuardarReunion() {
		PageObject.BotonGuardarReunion();
	}
	@Step
	public void espera() throws InterruptedException {
		PageObject.Espera();
	}

}
