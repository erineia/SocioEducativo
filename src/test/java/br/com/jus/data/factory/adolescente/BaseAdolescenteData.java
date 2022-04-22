package br.com.jus.data.factory.adolescente;

import static br.com.jus.config.ConfigurationManager.configuration;


public interface BaseAdolescenteData{
AdolescenteDataFactory adofactory = new AdolescenteDataFactory();


    /**
     * Dados para api Adolescente
     */

    String URL_ADOLESCENTE =
            String.format("%s/api/v1/adolescentes", configuration().urlAdolescente());

    String URL_ADOLESCENTE_BUSCAR_CPF =
            String.format("%s/api/v1/adolescentes/cpf/{}", configuration().urlAdolescente());

    String URL_ADOLESCENTE_BUSCAR_IDENTIFICADOR =
            String.format("%s/api/v1/adolescentes/identificador/{}", configuration().urlAdolescente());

}
