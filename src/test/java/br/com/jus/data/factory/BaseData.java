package br.com.jus.data.factory;

import static br.com.jus.config.ConfigurationManager.configuration;

public interface BaseData {

    String URL_TOKEN =
            String.format(configuration().urlGeraToken());
}
