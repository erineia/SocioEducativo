package br.com.jus.data.factory.guia;

import br.com.jus.data.pojo.guia.CadastrarProcesso;
import br.com.jus.data.pojo.guia.GuiaProvisoria;

public class GuiaProvisoriaDataFactory  {

    public static GuiaProvisoria criarGuiaProvisoria() {
        GuiaProvisoria guiaProvisoria = new GuiaProvisoria();

        CadastrarProcesso cadastro = CadastrarProcessoDataFactory.criarProcessoConhecimentoGuiauiaProvisoria();

        String identificadorAdolescente = cadastro.getIdentificadorAdolescente();
        String numeroProcessoConhecimento = cadastro.getNumeroProcesso();

        guiaProvisoria.setAtosInfracionais(AtosInfracionaisDataFactory.criarAtosInfracionais());
        guiaProvisoria.setCodigoTpuMedida("11386");
        guiaProvisoria.setDataFimInternacao("20/10/2027");
        guiaProvisoria.setDataInicioInternacao("20/10/2023");
        guiaProvisoria.setDataSentenca("14/12/2021");
        guiaProvisoria.setDocumentosInstruirGuia(DocumentosInstruirGuiaDataFactory.criarDocumentosInstruirGuia());
        guiaProvisoria.setHouveInternacao("Sim");
        guiaProvisoria.setIdentificadorAdolescente(identificadorAdolescente);
        guiaProvisoria.setMagistrado("Angelos");
        guiaProvisoria.setMagistradoCPF("851.242.850-36");
        guiaProvisoria.setMedida("Advertência");
        guiaProvisoria.setNumeroProcessoConhecimento(numeroProcessoConhecimento);
        guiaProvisoria.setOrigemGuia("SENTENCA_HOMOLOGATORIA");
        guiaProvisoria.setServentuario("Pedro Alves Cabral");
        guiaProvisoria.setServentuarioCPF("125.176.460-66");
        guiaProvisoria.setServentuarioCargo("Adminstrador de empresa publicas e privadas");

        return guiaProvisoria;

    }
}
