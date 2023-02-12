package com.truongtv1399it.SpringTutorial.properties;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String getUrl(){
        return this.url;
    }
}
