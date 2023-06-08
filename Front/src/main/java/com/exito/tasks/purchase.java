package com.exito.tasks;


import com.exito.models.Purchases;
import com.exito.userinterfaces.Purchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class purchase implements Task {



    Purchases data;
    String option;

    public purchase(Purchases data, String option) {
        this.data = data;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 0; i < Integer.parseInt(option); i++)
        {
            String value = String.valueOf(i);
            System.out.println(value);
            actor.wasAbleTo(Click.on(Purchase.BUTTON),
                    Click.on(Purchase.LIST),
                    Click.on(Purchase.CATEGORIES),
                    Click.on(Purchase.PRODUCTS));
            actor.wasAbleTo(WaitUntil.the(Purchase.ADD, WebElementStateMatchers.isClickable()),
                                Click.on(Purchase.ADD));

        }
        actor.wasAbleTo((WaitUntil.the(Purchase.ADD_LIST, WebElementStateMatchers.isEnabled())),
                Enter.theValue(data.getEMAIL()).into(Purchase.EMAIL),
                Click.on(Purchase.NEXT),
                Click.on(Purchase.EXITO));

    }

    public static purchase format(Purchases data, String option) {
        return Tasks.instrumented(purchase.class, data, option);
    }
}

