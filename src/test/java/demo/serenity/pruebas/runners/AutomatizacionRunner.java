package demo.serenity.pruebas.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/demo/serenity/features/HistoriaCasos.feature",
glue="demo.serenity.pruebas.stepdefinitions",
snippets=SnippetType.CAMELCASE,
tags="@Tag_CreacionLogin_y_Unidades,@Tag_CreacionReunion")

public class AutomatizacionRunner {

}