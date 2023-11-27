package ru.motorin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.motorin.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.motorin.MySecondTestAppSpringBoot.exception.ValidationFailedException;
import ru.motorin.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ValidationService {
    void isValid(Request request, BindingResult bindingResult) throws
            ValidationFailedException, UnsupportedCodeException;
}
