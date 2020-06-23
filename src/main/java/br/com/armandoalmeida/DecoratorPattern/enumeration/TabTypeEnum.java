package br.com.armandoalmeida.DecoratorPattern.enumeration;

import br.com.armandoalmeida.DecoratorPattern.decorator.ActiveTab;
import br.com.armandoalmeida.DecoratorPattern.decorator.ProfileTab;
import br.com.armandoalmeida.DecoratorPattern.decorator.SummaryTab;
import br.com.armandoalmeida.DecoratorPattern.decorator.Tab;

public enum TabTypeEnum {
    PROFILE(ProfileTab.class), ACTIVE(ActiveTab.class), SUMMARY(SummaryTab.class);

    Class<? extends Tab> tabClazz;

    TabTypeEnum(Class<? extends Tab> tabClazz) {
        this.tabClazz = tabClazz;
    }

    public static Tab getTabClazz(String tab) throws IllegalAccessException, InstantiationException {
        return TabTypeEnum.valueOf(tab.toUpperCase()).tabClazz.newInstance();
    }
}
