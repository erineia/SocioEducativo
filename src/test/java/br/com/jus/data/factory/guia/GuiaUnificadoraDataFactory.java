package br.com.jus.data.factory.guia;

import br.com.jus.data.pojo.guia.CadastrarProcesso;
import br.com.jus.data.pojo.guia.GuiaUnificadora;
import br.com.jus.data.pojo.guia.ListaNumeroGuiaDefinitiva;

public class GuiaUnificadoraDataFactory {

    public static GuiaUnificadora criarGuiaUnificadora(){

        GuiaUnificadora guiaUnificadora = new GuiaUnificadora();

        CadastrarProcesso cadastro = CadastrarProcessoDataFactory.criarProcessoGuiaUnificadora();
        String identificadorAdolescente = cadastro.getIdentificadorAdolescente();

        CadastrarProcesso cadastrarProcesso = CadastrarProcessoDataFactory.criarProcessoExecucaoGuiaUnificadora();
        String numeroProcessoExecucao = cadastrarProcesso.getNumeroProcesso();

        guiaUnificadora.setAtosInfracionais(AtosInfracionaisDataFactory.criarAtosInfracionais());
        guiaUnificadora.setListaNumeroDaGuiaDefinitiva(ListaNumeroGuiaDefnitivaDataFactory.criarListaGuiaDefinitiva());

        guiaUnificadora.setCodigoTpuMedida("11386");
        guiaUnificadora.setDataDecisaoUnifcacaoDeMedidas("10/04/2022");
        guiaUnificadora.setMagistrado("Maria Aparecida Dias");
        guiaUnificadora.setMagistradoCPF("851.242.850-36");
        guiaUnificadora.setMedidaResultanteUnificacao("Advertência");
        guiaUnificadora.setIdentificadorAdolescente(identificadorAdolescente);
        guiaUnificadora.setNumeroProcessoExecucao(numeroProcessoExecucao);
        guiaUnificadora.setOrigemGuia("SENTENCA_CONDENATORIA");
        guiaUnificadora.setServentuario("Bruno Ramos Paiva Filho");
        guiaUnificadora.setServentuarioCPF("408.576.405-50");
        guiaUnificadora.setServentuarioCargo("Administrador de empresa publicas e privadas");


        return guiaUnificadora;
    }

}
