package metodos;

import java.util.Locale;

/**
 *
 * @author Alessandro
 * @create: 20/05/2016, 13:10:58
 */
public class Informacoes {

    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("Configuracoes do Sistema Operacional:");
        System.out.println("Sigla: " + local.getCountry());
        System.out.println("Pais: " + local.getDisplayCountry());
        System.out.println("Idioma: " + local.getDisplayLanguage());
        System.out.println("Teclado: " + local.getDisplayName());
        System.out.println("");
        System.out.println("Outras Informações ");
        System.out.println("Arquitetura: " + System.getProperty("os.arch"));
        System.out.println("Nome do SO: " + System.getProperty("os.name"));
        System.out.println("Versão do SO: " + System.getProperty("os.version"));
        System.out.println("Diretorio do Projeto: " + System.getProperty("user.dir"));
        System.out.println("Pasta do Usuario: " + System.getProperty("user.home"));
        System.out.println("Nome do Usuario: " + System.getProperty("user.name"));
        System.out.println("------------------------------");
        System.out.println("Todas as Propriedades");
        System.getProperties().list(System.out);
    }
}
