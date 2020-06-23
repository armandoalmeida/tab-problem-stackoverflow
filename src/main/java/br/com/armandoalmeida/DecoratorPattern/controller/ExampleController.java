package br.com.armandoalmeida.DecoratorPattern.controller;

import br.com.armandoalmeida.DecoratorPattern.decorator.TabDecorator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/")
    public String getByTabParam(@RequestParam String tab) {
        return new TabDecorator(tab).methodName();
    }

}
