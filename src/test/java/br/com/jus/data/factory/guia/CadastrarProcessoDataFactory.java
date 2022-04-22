package br.com.jus.data.factory.guia;

import br.com.jus.config.Configuration;
import br.com.jus.data.factory.adolescente.AdolescenteDataFactory;
import br.com.jus.data.pojo.adolescente.BodyCadastrarAdolescente;
import br.com.jus.data.pojo.guia.CadastrarProcesso;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.restassured.http.ContentType;
import org.aeonbits.owner.ConfigFactory;
import org.apache.http.HttpStatus;
import org.junit.Before;

import java.util.Random;

import static io.restassured.RestAssured.*;

public class CadastrarProcessoDataFactory {

        //numero de processo estão sendo passado fixo//
    public static CadastrarProcesso criarProcessoConhecimentoGuiaSansao() {
        CadastrarProcesso processo = new CadastrarProcesso();

        processo.setIdentificadorAdolescente("202200000010");
        processo.setNomeTribunal("TRIBUNAL DE JUSTIÇA DO ESTADO DE GOIÁS");
        processo.setNumeroProcesso("52673117420198090024");
        processo.setOrgao("TRIBUNAL DE JUSTIÇA DO ESTADO DE GOIÁS");
        processo.setTipoProcesso("CONHECIMENTO");


        return processo;
    }
    public static CadastrarProcesso criarProcessoExecucaoGuiaSancao() {
        CadastrarProcesso processo = new CadastrarProcesso();

        processo.setIdentificadorAdolescente("202200000010");
        processo.setNomeTribunal("TRIBUNAL DE JUSTIÇA DO ESTADO DE GOIÁS");
        processo.setNumeroProcesso("53762686320208090048");
        processo.setOrgao("Tribunal De Justiça Do Estado De Goiás");
        processo.setTipoProcesso("EXECUCAO");


        return processo;
    }


    //numero de processo estão sendo passado fixo//
    public static CadastrarProcesso criarProcessoGuiaUnificadora() {
        CadastrarProcesso processo = new CadastrarProcesso();

        processo.setIdentificadorAdolescente("202200000009");
        processo.setNomeTribunal("TRIBUNAL DE JUSTIÇA DO ESTADO DE GOIÁS");
        processo.setNumeroProcesso("00569167420048090006");
        processo.setOrgao("TRIBUNAL DE JUSTIÇA DO ESTADO DE GOIÁS");
        processo.setTipoProcesso("CONHECIMENTO");


        return processo;
    }
    public static CadastrarProcesso criarProcessoExecucaoGuiaUnificadora() {
        CadastrarProcesso processo = new CadastrarProcesso();

        processo.setIdentificadorAdolescente("202200000009");
        processo.setNomeTribunal("Tribunal De Justiça Do Estado De Goiás");
        processo.setNumeroProcesso("00569167420048090006");
        processo.setOrgao("Tribunal De Justiça Do Estado De Goiás");
        processo.setTipoProcesso("EXECUCAO");


        return processo;
    }




    //numero de processo estão sendo passado fixo para guia definitiva//
    public static CadastrarProcesso criarProcessoConhecimentoGuiaDefintivia() {
        CadastrarProcesso processo = new CadastrarProcesso();

        processo.setIdentificadorAdolescente("202200000002");
        processo.setNomeTribunal("Tribunal de Justiça do Estado do Amazonas");
        processo.setNumeroProcesso("0609546-20.2015.8.04.0001");
        processo.setOrgao("Tribunal de Justiça do Estado do Amazonas");
        processo.setTipoProcesso("CONHECIMENTO");


        return processo;
    }

    //numero de processo estão sendo passado fixo para guia  provisoria//
    public static CadastrarProcesso criarProcessoConhecimentoGuiauiaProvisoria() {
        CadastrarProcesso processo = new CadastrarProcesso();

        processo.setIdentificadorAdolescente("202200000002");
        processo.setNomeTribunal("Tribunal de Justiça do Estado do Amazonas");
        processo.setNumeroProcesso("0609546-20.2015.8.04.0001");
        processo.setOrgao("Tribunal de Justiça do Estado do Amazonas");
        processo.setTipoProcesso("CONHECIMENTO");


        return processo;
    }



}
//public class CadastrarProcessoDataFactory {
//
//    public static CadastrarProcesso criarProcessoConhecimento() {
//        CadastrarProcesso processo = new CadastrarProcesso();
//
//        processo.setIdentificadorAdolescente("202200000009");
//        processo.setNomeTribunal("TRIBUNAL DE JUSTIÇA DO ESTADO DE GOIÁS");
//        processo.setNumeroProcesso("00569167420048090006");
//        processo.setOrgao("TRIBUNAL DE JUSTIÇA DO ESTADO DE GOIÁS");
//        processo.setTipoProcesso("CONHECIMENTO");
//
//
//        return processo;
//    }
//    public static CadastrarProcesso criarProcessoExecucao() {
//        CadastrarProcesso processo = new CadastrarProcesso();
//
//        processo.setIdentificadorAdolescente("202200000009");
//        processo.setNomeTribunal("Tribunal De Justiça Do Estado De Goiás");
//        processo.setNumeroProcesso("00569167420048090006");
//        processo.setOrgao("Tribunal De Justiça Do Estado De Goiás");
//        processo.setTipoProcesso("EXECUCAO");
//
//
//        return processo;
//    }