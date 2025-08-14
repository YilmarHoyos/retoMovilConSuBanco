package com.consubanco.task;
import com.consubanco.models.UsuarioLombokData;
import com.consubanco.uis.TheAppUserInterface;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    protected final UsuarioLombokData usuarioLombokData;

    public Login(UsuarioLombokData usuarioLombokData) {
        this.usuarioLombokData = usuarioLombokData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TheAppUserInterface.BTN_LOGIN_SCREEN),
                Enter.theValue(usuarioLombokData.getUser()).into(TheAppUserInterface.LBL_USER_NAME),
                Enter.theValue(usuarioLombokData.getPass()).into(TheAppUserInterface.LBL_PASSWORD),
                Click.on(TheAppUserInterface.BTN_LOGIN)

                );
    }

    public static Login conCredenciales(UsuarioLombokData usuarioLombokData) {
        return Instrumented.instanceOf(Login.class).withProperties(usuarioLombokData);
    }
}
