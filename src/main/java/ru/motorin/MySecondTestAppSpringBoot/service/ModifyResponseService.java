package ru.motorin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.motorin.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
