package br.com.armandoalmeida.DecoratorPattern.decorator;

public class ActiveTab implements Tab {

    @Override
    public String methodName() {
        return "active tab method executed...";
    }
}
