package br.com.jus.data.factory.guia;

import br.com.jus.data.pojo.guia.AtosInfracionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AtosInfracionaisDataFactory {

    public static List<AtosInfracionais> criarAtosInfracionais() {
        Random aleatorio = new Random();
        Integer numero_1 = (aleatorio.nextInt(89997) + 10000);
        Integer numero_2 = numero_1 + 1;
        Integer numero_3 = numero_1 + 2;
        AtosInfracionais atoInfracional_1 = new AtosInfracionais();

        atoInfracional_1.setCodigoTpu(numero_1.toString());
        atoInfracional_1.setDataFato("22/02/2022");
        atoInfracional_1.setDescricao("furto");
        atoInfracional_1.setLocalFato("Brasília DF");

        AtosInfracionais atoInfracional_2 = new AtosInfracionais();

        atoInfracional_2.setCodigoTpu(numero_2.toString());
        atoInfracional_2.setDataFato("22/02/2022");
        atoInfracional_2.setDescricao("latrocinio");
        atoInfracional_2.setLocalFato("Goías GO");

        AtosInfracionais atoInfracional_3 = new AtosInfracionais();

        atoInfracional_3.setCodigoTpu(numero_3.toString());
        atoInfracional_3.setDataFato("22/02/2022");
        atoInfracional_3.setDescricao("trafico");
        atoInfracional_3.setLocalFato("Formosa GO");

        List<AtosInfracionais> atos = new ArrayList<>();
        atos.add(atoInfracional_1);
        atos.add(atoInfracional_2);
        atos.add(atoInfracional_3);
        return atos;
    }
}
