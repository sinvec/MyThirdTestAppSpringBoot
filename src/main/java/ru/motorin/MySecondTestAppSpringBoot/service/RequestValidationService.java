package ru.motorin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.motorin.MySecondTestAppSpringBoot.exception.ValidationFailedException;
import ru.motorin.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.motorin.MySecondTestAppSpringBoot.model.Request;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(Request request, BindingResult bindingResult) throws
                ValidationFailedException, UnsupportedCodeException
    {
        if (bindingResult.hasErrors()) {
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
        if (request.getUid().equals("123")) {
            throw new UnsupportedCodeException("123 is invalid Uid!");
        }
    }
}
