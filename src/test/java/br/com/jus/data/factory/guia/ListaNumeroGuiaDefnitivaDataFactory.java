package br.com.jus.data.factory.guia;

import br.com.jus.data.pojo.guia.ListaNumeroGuiaDefinitiva;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeroGuiaDefnitivaDataFactory {

    public static List<ListaNumeroGuiaDefinitiva> criarListaGuiaDefinitiva(){

        ListaNumeroGuiaDefinitiva list_1 = new ListaNumeroGuiaDefinitiva();
        ListaNumeroGuiaDefinitiva list_2 = new ListaNumeroGuiaDefinitiva();
        ListaNumeroGuiaDefinitiva list_3 = new ListaNumeroGuiaDefinitiva();

        list_1.setNumeroGuia("202204110020");
        list_2.setNumeroGuia("202204110021");
        list_3.setNumeroGuia("202204110022");

        List<ListaNumeroGuiaDefinitiva>list = new ArrayList<>();
        list.add(list_1);
        list.add(list_2);
        list.add(list_3);

       return list;
    }
}
