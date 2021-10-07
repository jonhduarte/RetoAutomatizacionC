package demo.serenity.pruebas.stepdefinitions;

import java.util.List;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demo.serenity.pruebas.models.DatosPrincipales;
import demo.serenity.pruebas.steps.AutomatizacionStep;
import net.thucydides.core.annotations.Steps;

public class AutomatizacionStepDefinition {

	@Steps
	AutomatizacionStep automatizacionStep;

	@Given("^Ingresamos a la Pagina de StarSharp$")
	public void ingresamosALaPaginaDeStarSharp() {
		automatizacionStep.abrirnavegador();
	}

	@And("^Ingresamos las Credenciales$")
	public void ingresamos_las_Credenciales(List<DatosPrincipales> ListaDatosPrincipales) {
		automatizacionStep.escribirUsuario(ListaDatosPrincipales.get(0).getUsuario());
		automatizacionStep.escribirClave(ListaDatosPrincipales.get(0).getClave());
		automatizacionStep.clickBotonInicioSesion();
	}

	@And("^Buscamos opcion de Organizacion y unidades de negocio$")
	public void buscamosOpcionDeOrganizacionYUnidadesDeNegocio() {
		automatizacionStep.clickBotonOrganizacion();
		automatizacionStep.clikcBotonUnidadNeg();
		
	}

	@And("^Seleccionamos nuevo negocio$")
	public void seleccionamosNuevoNegocio() {
		automatizacionStep.clickBotonNuevoNeg();
	}

	@Given("^Completamos los campos del formulario$")
	public void completamos_los_campos_del_formulario(List<DatosPrincipales> ListaDatosPrincipales) {
		automatizacionStep.escribirNombreNeg(ListaDatosPrincipales.get(0).getNombrenegocio());
		automatizacionStep.clickBotonGuardarNeg();
	}

	@Then("^verificamos que el nombre del negocio aparezca$")
	public void verificamosQueElNombreDelNegocioAparezca(List<DatosPrincipales> ListaDatosPrincipales) throws InterruptedException  {
		automatizacionStep.espera();
	}
	
	@And("^Buscamos opcion Reunion y Reuniones$")
	public void buscamosOpcionReunionYReuniones() {
	    automatizacionStep.clickBotonReunion();
	    automatizacionStep.clickBotonReuniones();
	}

	@And("^Seleccionamos nueva reunion$")
	public void seleccionamosNuevaReunion() throws InterruptedException {
	    automatizacionStep.clickBotonAgendarReunion();
	    automatizacionStep.espera();
	}

	@And("^completamos los campos del formulario de reuniones$")
	public void completamosLosCamposDelFormularioDeReuniones(List<DatosPrincipales> ListaDatosPrincipales) {
		automatizacionStep.escribirNombreReunion(ListaDatosPrincipales.get(0).getNombrereunion());
		automatizacionStep.escribirTipoReunion(ListaDatosPrincipales.get(0).getTiporeunion());
		automatizacionStep.escribirNumeroReunion(ListaDatosPrincipales.get(0).getNumeroreunion());
		automatizacionStep.escribirFechaInicio(ListaDatosPrincipales.get(0).getFechainicio());
		//automatizacionStep.escribirHoraInicio(ListaDatosPrincipales.get(0).getHorainicio());
		automatizacionStep.escribirFechaFin(ListaDatosPrincipales.get(0).getFechafin());
		//automatizacionStep.escribirHoraFin(ListaDatosPrincipales.get(0).getHorafin());
		automatizacionStep.escribirLocalizacion(ListaDatosPrincipales.get(0).getLocalizacion());
		automatizacionStep.escribirUnit(ListaDatosPrincipales.get(0).getUnit());
		automatizacionStep.escribirOrganizador(ListaDatosPrincipales.get(0).getOrganizador());
		automatizacionStep.escribirResponsable(ListaDatosPrincipales.get(0).getResponsable());
		automatizacionStep.escribirAsistentes(ListaDatosPrincipales.get(0).getAsistentes());
		automatizacionStep.clickBotonGuardarReunion();
	}
	
	@Then("^verificamos que la reunion quede creada$")
	public void verificamosQueLaReunionQuedeCreada() throws InterruptedException {
		automatizacionStep.espera();
	}
	

}
