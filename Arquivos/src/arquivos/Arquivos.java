package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alessandro
 */
public class Arquivos {

    public static void main(String[] args) {
        gravar();
        ler();
    }

    public static void gravar() {
        File f = new File("src/proibido.txt");
        try {
            PrintWriter out = new PrintWriter(f);
            out.println("Celular");
            out.println("Fone de Ouvido");
            out.println("Baralho");
            out.println("Jogos de Azar");
            out.println("Jogos");
            out.println(" \\n");
            out.println("Boné / Gorro / Toca");
            out.println("Namorar durante as aulas");
            out.println("Dormir");
            out.println("Conversar");
            out.print("\"Aluno(a) Chato(a)\"");
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    private static void ler() {
        File f = new File("src/proibido.txt");
        try {
            BufferedReader br = 
                    new BufferedReader(new FileReader(f));
            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}

/*
        out.println("Ainda");
        out.println("Estou ");
        out.println("Esperando");
        out.println("Silencio");
        out.println("Proibido Celular");
        out.close();
 */
