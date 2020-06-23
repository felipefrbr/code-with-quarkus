package org.acme.app;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class HelloService {

    @Inject
    private HelloProperties properties;

    public String say(){
        return String.format("%s (%s)", properties.getText().orElse("Hello Quarkus"), properties.getApp());
    }

}
