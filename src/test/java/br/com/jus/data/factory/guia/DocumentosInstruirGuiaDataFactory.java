package br.com.jus.data.factory.guia;

import br.com.jus.data.pojo.guia.DocumentosInstruirGuia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DocumentosInstruirGuiaDataFactory {

    public static List<DocumentosInstruirGuia> criarDocumentosInstruirGuia() {
        Random aleatorio = new Random();
        Integer numero_1 = (aleatorio.nextInt(899999997) + 100000000);
        Integer numero_2 = numero_1 + 1;
        Integer numero_3 = numero_1 + 2;
        DocumentosInstruirGuia documentosInstruirGuia_1 = new DocumentosInstruirGuia();

        documentosInstruirGuia_1.setIdentificadorDocAutos(numero_1.toString());
        documentosInstruirGuia_1.setTipoDocumento("CPF");

        DocumentosInstruirGuia documentosInstruirGuia_2 = new DocumentosInstruirGuia();

        documentosInstruirGuia_2.setIdentificadorDocAutos(numero_2.toString());
        documentosInstruirGuia_2.setTipoDocumento("Cópia do termo que propõe a remissão");

        DocumentosInstruirGuia documentosInstruirGuia_3 = new DocumentosInstruirGuia();

        documentosInstruirGuia_3.setIdentificadorDocAutos(numero_3.toString());
        documentosInstruirGuia_3.setTipoDocumento("Cópia da representação");

        List<DocumentosInstruirGuia> documentos = new ArrayList<>();
        documentos.add(documentosInstruirGuia_1);
        documentos.add(documentosInstruirGuia_2);
        documentos.add(documentosInstruirGuia_3);
        return documentos;
    }

    public static List<DocumentosInstruirGuia> criarDocumentosInvalidos() {
        Random aleatorio = new Random();
        Integer numero_1 = (aleatorio.nextInt(899999997) + 100000000);
        Integer numero_2 = numero_1 + 1;
        Integer numero_3 = numero_1 + 2;

        DocumentosInstruirGuia documentosInstruirGuia_1 = new DocumentosInstruirGuia();

        documentosInstruirGuia_1.setIdentificadorDocAutos(numero_1.toString());
        documentosInstruirGuia_1.setTipoDocumento("foto");

        DocumentosInstruirGuia documentosInstruirGuia_2 = new DocumentosInstruirGuia();

        documentosInstruirGuia_2.setIdentificadorDocAutos(numero_2.toString());
        documentosInstruirGuia_2.setTipoDocumento("remissão");

        DocumentosInstruirGuia documentosInstruirGuia_3 = new DocumentosInstruirGuia();

        documentosInstruirGuia_3.setIdentificadorDocAutos(numero_3.toString());
        documentosInstruirGuia_3.setTipoDocumento("representação");

        List<DocumentosInstruirGuia> documentos = new ArrayList<>();
        documentos.add(documentosInstruirGuia_1);
        documentos.add(documentosInstruirGuia_2);
        documentos.add(documentosInstruirGuia_3);
        return documentos;
    }

}
