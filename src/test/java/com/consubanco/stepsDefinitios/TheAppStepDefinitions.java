package com.consubanco.stepsDefinitios;

import com.consubanco.driver.AppiumDispositivoDriver;
import com.consubanco.models.UsuarioLombokData;
import com.consubanco.task.IngresoLogin;
import com.consubanco.task.ListDemo;
import com.consubanco.task.Login;
import com.consubanco.uis.TheAppUserInterface;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;


import java.io.IOException;


public class TheAppStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("abrimos la APK")
    public void abrimosLaAPK() {
        OnStage.theActorCalled("Bot").can(BrowseTheWeb.with(AppiumDispositivoDriver.conLasCapabilities().enElDispositivo()));
    }


    @Entonces("se deben mostrar los textos {string}")
    public void seDebenMostrarLosTextos(String texto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TheAppUserInterface.TXT_VALIDACION.of(texto)), WebElementStateMatchers.containsText(texto)));
    }


    @Cuando("hacemos clic en Login Screen")
    public void hacemosClicEnLoginScreen() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoLogin.enLaPlataforma());
    }

    @Entonces("se debe abrir la pantalla de {string}")
    public void seDebeAbrirLaPantallaDe(String texto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TheAppUserInterface.TXT_LOGIN_SCREEN.of(texto)), WebElementStateMatchers.containsText(texto)));

    }

    @Cuando("intento iniciar sesion con credenciales")
    public void intentoIniciarSesionConCredenciales(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.conCredenciales(UsuarioLombokData.setData(dataTable).get(0)));
    }


    @Entonces("se debe mostrar la pantalla de Login con el boton {string}")
    public void seDebeMostrarLaPantallaDeLoginConElBoton(String texto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TheAppUserInterface.TXT_ALERT.of(texto)), WebElementStateMatchers.containsText(texto)));

    }

    @Cuando("hacemos clic en el link List Demo y luego en Altocumulus")
    public void hacemosClicEnElLinkListDemoYLuegoEnAltocumulus() {
        OnStage.theActorInTheSpotlight().attemptsTo(ListDemo.enLaLista());

    }

    @Entonces("se debe mostrar una pantalla con el texto {string}")
    public void seDebeMostrarUnaPantallaConElTexto(String texto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TheAppUserInterface.TXT_VALIDATION.of(texto)), WebElementStateMatchers.containsText(texto)));

    }


}
