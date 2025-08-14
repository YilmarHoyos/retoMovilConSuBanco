package com.consubanco.task;

import com.consubanco.uis.TheAppUserInterface;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ListDemo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TheAppUserInterface.BTN_LIST_DEMO),
                Click.on(TheAppUserInterface.BTN_ALTO)
        );
    }

    public static ListDemo enLaLista() {
        return Instrumented.instanceOf(ListDemo.class).withProperties();
    }
}
