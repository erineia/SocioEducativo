package br.com.jus.data.factory.guia;

import br.com.jus.data.pojo.guia.CadastrarProcesso;
import br.com.jus.data.pojo.guia.GuiaDefinitiva;

public class GuiaDefinitivaDataFactory {

    public static GuiaDefinitiva criarGuiaDefinitiva(){

        GuiaDefinitiva  guiaDefinitiva = new  GuiaDefinitiva();

        CadastrarProcesso cadastro = CadastrarProcessoDataFactory.criarProcessoConhecimentoGuiaDefintivia();

        String identificadorAdolescente = cadastro.getIdentificadorAdolescente();
        String numeroProcessoConhecimento = cadastro.getNumeroProcesso();

        guiaDefinitiva.setAtosInfracionais(AtosInfracionaisDataFactory.criarAtosInfracionais());
        guiaDefinitiva.setCodigoTpuMedida("11386");
        guiaDefinitiva.setDataSentenca("14/12/2021");
        guiaDefinitiva.setDataTransitoJulgado("10/04/2022");
        guiaDefinitiva.setDocumentosInstruirGuia(DocumentosInstruirGuiaDataFactory.criarDocumentosInstruirGuia());
        guiaDefinitiva.setIdentificadorAdolescente(identificadorAdolescente);
        guiaDefinitiva.setMagistrado("Patrick Dias Silva");
        guiaDefinitiva.setMagistradoCPF("851.242.850-36");
        guiaDefinitiva.setMedida("Advertência");
        guiaDefinitiva.setNumeroProcessoConhecimento(numeroProcessoConhecimento);
        guiaDefinitiva.setOrigemGuia("SENTENCA_HOMOLOGATORIA");
        guiaDefinitiva.setServentuario("Marcos Dias Barroso");
        guiaDefinitiva.setServentuarioCPF("125.176.460-66");
        guiaDefinitiva.setServentuarioCargo("Administrador de empresa publicas e privadas");


        return guiaDefinitiva;
    }

}
