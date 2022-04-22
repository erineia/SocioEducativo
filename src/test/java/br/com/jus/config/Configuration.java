package br.com.jus.config;

import org.aeonbits.owner.Config;

@Config.Sources("file:src/test/resources/api-ambiente.properties")
public interface Configuration extends Config {

    // Redundancia a urlAdolescente deveria ser baseURI pois esse link eh utilizado em outros testes
    @Key("baseURI")
    String urlAdolescente();

    @Key("baseURI")
    String baseURI();

    @Key("port")
    Integer port();

    @Key("guiasPath")
    String guiasPath();

    @Key("gera.token")
    String urlGeraToken();

    @Key("log.all")
    boolean logAll();
}
