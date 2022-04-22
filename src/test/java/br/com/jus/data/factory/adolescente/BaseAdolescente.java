package br.com.jus.data.factory.adolescente;

import br.com.jus.utils.DateUtils;
import br.com.jus.utils.Documents;

public interface BaseAdolescente {

    String NASCIMENTO = DateUtils.getDateDifferenceDays(-18);
    String NATURALIDADE = Documents.faker().address().cityName();
    String NOME = Documents.faker().name().firstName();
    String NOME_SOCIAL = Documents.faker().name().firstName();
    String NOME_MAE = Documents.faker().name().firstName();
    String NOME_PAI = Documents.faker().name().firstName();
    String SOBRENOME = Documents.faker().name().lastName();
    String SEXO_BIOLOGICO = Documents.faker().options().option("MASCULINO", "FEMININO", "INTERSEXO");
    String ORIENTACAO_SEXUAL = Documents.faker().options().option("ASSEXUAL", "BISSEXUAL_PANSEXUAL", "HETEROSSEXUAL", "HOMOSSEXUAL", "NAO_INFORMADO");
    String RACA_COR = Documents.faker().options().option("BRANCA", "PRETA", "AMARELA", "PARDA", "INDIGENA");
    String IDENTIDADE_GENERO = Documents.faker().options().option("MULHER_CIS", "HOMEM_CIS", "MULHER_TRANS", "HOMEM_TRANS", "TRAVESTI", "INTERSEXO", "PESSOA_NAO_BINARIA", "NAO_INFORMADO");
    String CPF = Documents.geraCPF();
    String RG = Documents.gerarRg();
    String UF = Documents.faker().options().option(
            "AC",
            "AL",
            "AP",
            "AM",
            "BA",
            "CE",
            "DF",
            "ES",
            "GO",
            "MA",
            "MT",
            "MS",
            "MG",
            "PA",
            "PB",
            "PR",
            "PE",
            "PI",
            "RJ",
            "RN",
            "RS",
            "RO",
            "RR",
            "SC",
            "SP",
            "SE",
            "TO");
}
