package com.consubanco.task;

import com.consubanco.uis.TheAppUserInterface;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresoLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TheAppUserInterface.BTN_LOGIN_SCREEN)
        );
    }

    public static IngresoLogin enLaPlataforma() {
        return Instrumented.instanceOf(IngresoLogin.class).withProperties();
    }
}
