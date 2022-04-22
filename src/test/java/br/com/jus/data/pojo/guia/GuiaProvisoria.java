package br.com.jus.data.pojo.guia;

import java.util.List;

public class GuiaProvisoria {

    private List<AtosInfracionais> atosInfracionais;
    private String codigoTpuMedida;
    private String dataFimInternacao;
    private String dataInicioInternacao;
    private String dataSentenca;
    private List<DocumentosInstruirGuia>documentosInstruirGuia;
    private String houveInternacao;
    private String identificadorAdolescente;
    private String magistrado;
    private String magistradoCPF;
    private String numeroProcessoConhecimento;
    private String origemGuia;
    private String medida;
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

    public String getDataFimInternacao() {
        return dataFimInternacao;
    }

    public void setDataFimInternacao(String dataFimInternacao) {
        this.dataFimInternacao = dataFimInternacao;
    }

    public String getDataInicioInternacao() {
        return dataInicioInternacao;
    }

    public void setDataInicioInternacao(String dataInicioInternacao) {
        this.dataInicioInternacao = dataInicioInternacao;
    }

    public String getDataSentenca() {
        return dataSentenca;
    }

    public void setDataSentenca(String dataSentenca) {
        this.dataSentenca = dataSentenca;
    }

    public List<DocumentosInstruirGuia> getDocumentosInstruirGuia() {
        return documentosInstruirGuia;
    }

    public void setDocumentosInstruirGuia(List<DocumentosInstruirGuia> documentosInstruirGuia) {
        this.documentosInstruirGuia = documentosInstruirGuia;
    }

    public String getHouveInternacao() {
        return houveInternacao;
    }

    public void setHouveInternacao(String houveInternacao) {
        this.houveInternacao = houveInternacao;
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

    public String getNumeroProcessoConhecimento() {
        return numeroProcessoConhecimento;
    }

    public void setNumeroProcessoConhecimento(String numeroProcessoConhecimento) {
        this.numeroProcessoConhecimento = numeroProcessoConhecimento;
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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
}
