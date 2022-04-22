package br.com.jus.data.pojo.guia;

import java.util.List;

public class GuiaInternacaoSancao {

    private List<AtosInfracionais>atosInfracionais;
    private String codigoTpuMedida;
    private String dataDecisaoInternacaoSancao;
    private String identificadorAdolescente;
    private String magistrado;
    private String magistradoCPF;
    private String medida;
    private String numeroProcessoConhecimento;
    private String numeroProcessoExecucao;
    private String prazo;
    private String serventuario;
    private String serventuarioCPF;
    private String serventuarioCargo;

    public List<AtosInfracionais> getAtosInfracionais() {
        return atosInfracionais;
    }

    public void setAtosInfracionais(List<AtosInfracionais> atosInfracionais) {
        this.atosInfracionais = atosInfracionais;
    }

    public String getCodigoTpuMedida() {
        return codigoTpuMedida;
    }

    public void setCodigoTpuMedida(String codigoTpuMedida) {
        this.codigoTpuMedida = codigoTpuMedida;
    }

    public String getDataDecisaoInternacaoSancao() {
        return dataDecisaoInternacaoSancao;
    }

    public void setDataDecisaoInternacaoSancao(String dataDecisaoInternacaoSancao) {
        this.dataDecisaoInternacaoSancao = dataDecisaoInternacaoSancao;
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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getNumeroProcessoConhecimento() {
        return numeroProcessoConhecimento;
    }

    public void setNumeroProcessoConhecimento(String numeroProcessoConhecimento) {
        this.numeroProcessoConhecimento = numeroProcessoConhecimento;
    }

    public String getNumeroProcessoExecucao() {
        return numeroProcessoExecucao;
    }

    public void setNumeroProcessoExecucao(String numeroProcessoExecucao) {
        this.numeroProcessoExecucao = numeroProcessoExecucao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
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
