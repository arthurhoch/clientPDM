package br.unisc.arthurhoch.trabalhopdm.Utils;

import java.util.Calendar;

/**
 * Created by arthurhoch on 6/25/17.
 */

public interface GlobalVariable {

    public static final String IPSERVIDOR = "ec.unisc.br";
    public static final String PORTSERVIDOR = "8080";

    public static final int REQUEST_CAMERA = 1000;
    public static final int REQUEST_LOCATION = 2000;
    public static final int PERMISSION_ALL = 10000;

    public static final String SUCESSO = "Sucesso ";
    public static final String ERRO = "Erro ";
    public static final String MANDARMENSAGEM = "ao mandar mensagem!";
    public static final String PERMISSAO = " ao habilitar permissão!";

    public static final int SELECIONAR_FOTO = 1;
    public static final int TIRAR_FOTO = 0;

    public static final int SOLICITAR_TODAS = 0;
    public static final int SOLICITAR_RESOLVIDOS = 1;
    public static final int SOLICITAR_N_RESOLVIDOS = 2;


}
