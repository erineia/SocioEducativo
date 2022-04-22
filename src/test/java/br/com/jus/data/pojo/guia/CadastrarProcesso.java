package br.com.jus.data.pojo.guia;

public class CadastrarProcesso {

    private String identificadorAdolescente;
    private String nomeTribunal;
    private String numeroProcesso;
    private String orgao;
    private String tipoProcesso;

    public String getIdentificadorAdolescente() {
        return identificadorAdolescente;
    }

    public void setIdentificadorAdolescente(String identificadorAdolescente) {
        this.identificadorAdolescente = identificadorAdolescente;
    }

    public String getNomeTribunal() {
        return nomeTribunal;
    }

    public void setNomeTribunal(String nomeTribunal) {
        this.nomeTribunal = nomeTribunal;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getTipoProcesso() {
        return tipoProcesso;
    }

    public void setTipoProcesso(String tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }
}
