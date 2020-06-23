package br.com.armandoalmeida.DecoratorPattern.decorator;

import br.com.armandoalmeida.DecoratorPattern.enumeration.TabTypeEnum;
import br.com.armandoalmeida.DecoratorPattern.exceptions.InvalidTabException;

public class TabDecorator implements Tab {
    protected Tab tab;

    public TabDecorator(Tab tab) {
        this.tab = tab;
    }

    public TabDecorator(String tab) {
        try {
            this.tab = TabTypeEnum.getTabClazz(tab);
        } catch (NullPointerException | IllegalArgumentException | IllegalAccessException | InstantiationException e) {
            throw new InvalidTabException(tab);
        }
    }

    @Override
    public String methodName() {
        return this.tab.methodName();
    }
}
