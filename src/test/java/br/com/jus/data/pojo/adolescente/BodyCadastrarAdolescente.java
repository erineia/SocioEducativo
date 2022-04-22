package br.com.jus.data.pojo.adolescente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BodyCadastrarAdolescente {

    public BodyCertidaoNascimento certidaoNascimento;
    public BodyCpf cpf;
    public String dataNascimento;
    public String dataNascimentoPresumida;
    public String identidadeGenero;
    public String naturalidade;
    public String nome;
    public String nomeMae;
    public String nomePai;
    public String nomeSocial;
    public String orientacaoSexual;
    public String possuiNomeSocial;
    public String racaCor;
    public BodyRg rg;
    public String sexoBiologico;
    public String sobrenome;
    public String identificador;
}
