package br.com.jus.data.factory.guia;

import br.com.jus.data.pojo.guia.CadastrarProcesso;
import br.com.jus.data.pojo.guia.GuiaInternacaoSancao;

public class GuiaSancaoInternacaoDataFactory {

    public static GuiaInternacaoSancao criarGuiaInternacaoSancao(){

        GuiaInternacaoSancao guiaInternacaoSancao = new GuiaInternacaoSancao();

        CadastrarProcesso cadastro = CadastrarProcessoDataFactory.criarProcessoConhecimentoGuiaSansao();
        String identificadorAdolescente = cadastro.getIdentificadorAdolescente();
        String numeroProcessoConhecimento = cadastro.getNumeroProcesso();


        CadastrarProcesso cadastrarProcesso = CadastrarProcessoDataFactory.criarProcessoExecucaoGuiaSancao();
        String numeroProcessoExecucao = cadastrarProcesso.getNumeroProcesso();

        guiaInternacaoSancao.setAtosInfracionais(AtosInfracionaisDataFactory.criarAtosInfracionais());
        guiaInternacaoSancao.setCodigoTpuMedida("11387");
        guiaInternacaoSancao.setDataDecisaoInternacaoSancao("22/02/2022");
        guiaInternacaoSancao.setIdentificadorAdolescente(identificadorAdolescente);
        guiaInternacaoSancao.setNumeroProcessoConhecimento(numeroProcessoConhecimento);
        guiaInternacaoSancao.setNumeroProcessoExecucao(numeroProcessoExecucao);
        guiaInternacaoSancao.setMedida("Internação com atividades externas");
        guiaInternacaoSancao.setMagistrado("Maria Dias Silva");
        guiaInternacaoSancao.setMagistradoCPF("851.242.850-36");
        guiaInternacaoSancao.setPrazo("50");
        guiaInternacaoSancao.setServentuario("Lessa Silva");
        guiaInternacaoSancao.setServentuarioCPF("125.176.460-66");
        guiaInternacaoSancao.setServentuarioCargo("Administrador de empresa publicas e privadas");


        return guiaInternacaoSancao;
    }
}
