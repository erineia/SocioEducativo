package br.com.jus.data.pojo.guia;

import java.util.List;

public class GuiaUnificadora {

    private List<AtosInfracionais>atosInfracionais;
    private List<ListaNumeroGuiaDefinitiva>ListaNumeroDaGuiaDefinitiva;
    private String codigoTpuMedida;
    private String dataDecisaoUnifcacaoDeMedidas;
    private String identificadorAdolescente;
    private String magistrado;
    private String magistradoCPF;
    private String medidaResultanteUnificacao;
    private String numeroProcessoExecucao;
    private String origemGuia;
    private String serventuario;
    private String serventuarioCPF;
    private String serventuarioCargo;

    public List<AtosInfracionais> getAtosInfracionais() {
        return atosInfracionais;
    }

    public void setAtosInfracionais(List<AtosInfracionais> atosInfracionais) {
        this.atosInfracionais = atosInfracionais;
    }

    public List<ListaNumeroGuiaDefinitiva> getListaNumeroDaGuiaDefinitiva() {
        return ListaNumeroDaGuiaDefinitiva;
    }

    public void setListaNumeroDaGuiaDefinitiva(List<ListaNumeroGuiaDefinitiva> listaNumeroDaGuiaDefinitiva) {
        ListaNumeroDaGuiaDefinitiva = listaNumeroDaGuiaDefinitiva;
    }

    public String getCodigoTpuMedida() {
        return codigoTpuMedida;
    }

    public void setCodigoTpuMedida(String codigoTpuMedida) {
        this.codigoTpuMedida = codigoTpuMedida;
    }

    public String getDataDecisaoUnifcacaoDeMedidas() {
        return dataDecisaoUnifcacaoDeMedidas;
    }

    public void setDataDecisaoUnifcacaoDeMedidas(String dataDecisaoUnifcacaoDeMedidas) {
        this.dataDecisaoUnifcacaoDeMedidas = dataDecisaoUnifcacaoDeMedidas;
    }

    public String getIdentificadorAdolescente() {
        return identificadorAdolescente;
    }

    public void setIdentificadorAdolescente(String identificadorAdolescente) {
        this.identificadorAdolescente = identificadorAdolescente;
    }

    public String getMagistrado() {
        return magistrado;
    }

    public void setMagistrado(String magistrado) {
        this.magistrado = magistrado;
    }

    public String getMagistradoCPF() {
        return magistradoCPF;
    }

    public void setMagistradoCPF(String magistradoCPF) {
        this.magistradoCPF = magistradoCPF;
    }

    public String getMedidaResultanteUnificacao() {
        return medidaResultanteUnificacao;
    }

    public void setMedidaResultanteUnificacao(String medidaResultanteUnificacao) {
        this.medidaResultanteUnificacao = medidaResultanteUnificacao;
    }

    public String getNumeroProcessoExecucao() {
        return numeroProcessoExecucao;
    }

    public void setNumeroProcessoExecucao(String numeroProcessoExecucao) {
        this.numeroProcessoExecucao = numeroProcessoExecucao;
    }

    public String getOrigemGuia() {
        return origemGuia;
    }

    public void setOrigemGuia(String origemGuia) {
        this.origemGuia = origemGuia;
    }

    public String getServentuario() {
        return serventuario;
    }

    public void setServentuario(String serventuario) {
        this.serventuario = serventuario;
    }

    public String getServentuarioCPF() {
        return serventuarioCPF;
    }

    public void setServentuarioCPF(String serventuarioCPF) {
        this.serventuarioCPF = serventuarioCPF;
    }

    public String getServentuarioCargo() {
        return serventuarioCargo;
    }

    public void setServentuarioCargo(String serventuarioCargo) {
        this.serventuarioCargo = serventuarioCargo;
    }
}
