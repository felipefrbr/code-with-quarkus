package org.acme.app;

import io.quarkus.arc.config.ConfigProperties;

import java.util.Optional;

@ConfigProperties(prefix = "hello")
public class HelloProperties {

    private Optional<String> text;
    private String app;

    public Optional<String> getText() {
        return text;
    }

    public HelloProperties setText(Optional<String> text) {
        this.text = text;
        return this;
    }

    public String getApp() {
        return app;
    }

    public HelloProperties setApp(String app) {
        this.app = app;
        return this;
    }
}
