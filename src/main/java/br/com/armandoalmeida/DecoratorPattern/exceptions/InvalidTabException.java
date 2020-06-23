package br.com.armandoalmeida.DecoratorPattern.exceptions;

import br.com.armandoalmeida.DecoratorPattern.enumeration.TabTypeEnum;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;

public class InvalidTabException extends ResponseStatusException {
    private static final long serialVersionUID = 6506407978371228411L;

    public InvalidTabException(String tab) {
        super(HttpStatus.BAD_REQUEST, "Invalid tab '" + tab + "'. Valid values: " + Arrays.toString(TabTypeEnum.values()));
    }
}
