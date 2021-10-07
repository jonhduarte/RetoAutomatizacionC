package demo.serenity.pruebas.pageobjects;

import static org.junit.Assert.assertThat;
import java.io.IOException;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://serenity.is/demo/")
public class AutomatizacionPageObject extends PageObject {

	// MAPEO LOGIN
	By TxtUsuario = By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Username']");
	By TxtClave = By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Password']");
	By BtnIniciarSesion = By.xpath("//button[@id='StartSharp_Membership_LoginPanel0_LoginButton']");

	// MAPEO NUEVA ORGANIZACION
	By BtnOrganizacion = By.xpath("//body/div[2]/aside[1]/section[1]/div[1]/ul[1]/li[6]/a[1]");
	By BtnUnidadNeg = By.xpath("//body/div[2]/aside[1]/section[1]/div[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]");
	By BtnNuevoNeg = By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");
	By TxtNombreNeg = By.xpath("//input[@id='StartSharp_Organization_BusinessUnitDialog7_Name']");
	By BtnGuardarNeg = By.xpath("//body/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]");
	By ValidacionTexto = By.xpath("//*[contains(text(),'Pruebas Test')]");

	// MAPEO NUEVA REUNION
	By Btnreunion = By.xpath("//body/div[2]/aside[1]/section[1]/div[1]/ul[1]/li[5]/a[1]");
	By Btnreuniones = By.xpath("//body/div[2]/aside[1]/section[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]");
	By BtnAgendarReunion = By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");

	//
	By TxtNombreReunion = By.xpath("//input[@id='StartSharp_Meeting_MeetingDialog14_MeetingName']");
	By BtnTipoReunion = By.xpath("//span[@id='select2-chosen-6']");
	By TxtTipoReunion = By.xpath("//input[@id='s2id_autogen6_search']");
	
	
	By TxtNumeroReunion = By.xpath("//input[@id='StartSharp_Meeting_MeetingDialog14_MeetingNumber']");
	By TxtFechaInicio = By.xpath("//input[@id='StartSharp_Meeting_MeetingDialog14_StartDate']");
	By TxtHoraInicio = By.xpath("");//pendiente
	By TxtFechaFin = By.xpath("//input[@id='StartSharp_Meeting_MeetingDialog14_EndDate']");
	By TxtHoraFin = By.xpath("");//pendiente
	
	
	By BtnLocalizacion =  By.xpath("//span[@id='select2-chosen-7']");
	By TxtLocalizacion = By.xpath("//input[@id='s2id_autogen7_search']");
	
	By BtnUnit = By.xpath("//span[@id='select2-chosen-8']");
	By TxtUnit = By.xpath("//input[@id='s2id_autogen8_search']");
	
	By BtnOrganizador = By.xpath("//span[@id='select2-chosen-9']");
	By TxtOrganizador = By.xpath("//input[@id='s2id_autogen9_search']");
	
	By BtnResponsable = By.xpath("//span[@id='select2-chosen-10']");
	By TxtResponsable = By.xpath("//input[@id='s2id_autogen10_search']");
	
	By BtnAsistentes = By.xpath("//span[@id='select2-chosen-12']");
	By TxtAsistentes = By.xpath("//input[@id='s2id_autogen12_search']");
	
	By BtnGuardarReunion = By.xpath("//body/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]");
	
	
	
	// METODOS LOGIN
	public void EscribirUsuario(String usuario) {
		getDriver().findElement(TxtUsuario).sendKeys(usuario);
	}
	public void EscribirClave(String Clave) {
		getDriver().findElement(TxtClave).sendKeys(Clave);
	}
	public void BotonInicioSesion() {
		getDriver().findElement(BtnIniciarSesion).click();
	}
	// METODOS NUEVA ORGANIZACION
	public void BotonOrganizacion() {
		getDriver().findElement(BtnOrganizacion).click();
	}
	public void BotonUnidadNeg() {
		getDriver().findElement(BtnUnidadNeg).click();
	}
	public void BotonNuevoNeg() {
		getDriver().findElement(BtnNuevoNeg).click();
	}
	public void EscribirNombreNeg(String nombreneg) {
		getDriver().findElement(TxtNombreNeg).sendKeys(nombreneg);
	}
	public void BotonGuardarNeg() {
		getDriver().findElement(BtnGuardarNeg).click();
	}
	// VALIDACION TEXTO
	public void ValidacionTexto() {
		assertThat(getDriver().findElement(ValidacionTexto).isDisplayed(), Matchers.is(true));
	}
	//METODOS NUEVA REUNION
	public void BotonReunion() {
		getDriver().findElement(Btnreunion).click();
	}
	public void BotonReuniones() {
		getDriver().findElement(Btnreuniones).click();
	}
	public void BotonAgendarReunion() {
		getDriver().findElement(BtnAgendarReunion).click();
	}
	public void EscribirNombreReunion(String nombrereunion) {
		getDriver().findElement(TxtNombreReunion).sendKeys(nombrereunion);
	}
	public void EscribirTipoReunion(String tiporeunion) {
		getDriver().findElement(BtnTipoReunion).click();
		getDriver().findElement(TxtTipoReunion).sendKeys(tiporeunion);
		getDriver().findElement(TxtTipoReunion).sendKeys(Keys.ENTER);
	}
	public void EscribirNumeroReunion(String numeroreunion) {
		getDriver().findElement(TxtNumeroReunion).sendKeys(numeroreunion);
	}
	public void EscribirFechaIninio(String fechainicio) {
		getDriver().findElement(TxtFechaInicio).clear();
		getDriver().findElement(TxtFechaInicio).sendKeys(fechainicio);
	}
	public void EscribirHoraInicio(String horainicio) {
		getDriver().findElement(TxtHoraInicio).sendKeys(horainicio);
	}
	public void EscribirFechaFin(String fechafin) {
		getDriver().findElement(TxtFechaFin).clear();
		getDriver().findElement(TxtFechaFin).sendKeys(fechafin);
	}
	public void EscribirHoraFin(String horafin) {
		getDriver().findElement(TxtHoraFin).sendKeys(horafin);
	}
	public void EscribirLocalizacion(String localizacion) {
		getDriver().findElement(BtnLocalizacion).click();
		getDriver().findElement(TxtLocalizacion).sendKeys(localizacion);
		getDriver().findElement(TxtLocalizacion).sendKeys(Keys.ENTER);
	}
	public void EscribirUnit(String unit) {
		getDriver().findElement(BtnUnit).click();
		getDriver().findElement(TxtUnit).sendKeys(unit);
		getDriver().findElement(TxtUnit).sendKeys(Keys.ENTER);
	}
	public void EscribirOrganizador(String organizador) {
		getDriver().findElement(BtnOrganizador).click();
		getDriver().findElement(TxtOrganizador).sendKeys(organizador);
		getDriver().findElement(TxtOrganizador).sendKeys(Keys.ENTER);
	}
	public void EscribirResponsable(String responsable) {
		getDriver().findElement(BtnResponsable).click();
		getDriver().findElement(TxtResponsable).sendKeys(responsable);
		getDriver().findElement(TxtResponsable).sendKeys(Keys.ENTER);
	}
	public void EscribirAsistentes(String asistentes) {
		getDriver().findElement(BtnAsistentes).click();
		getDriver().findElement(TxtAsistentes).sendKeys(asistentes);
		getDriver().findElement(TxtAsistentes).sendKeys(Keys.ENTER);
	}
	public void BotonGuardarReunion() {
		getDriver().findElement(BtnGuardarReunion).click();
	}
	public void Espera() throws InterruptedException {
		Thread.sleep(5000);
	}

}
