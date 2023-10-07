package br.com.av1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Questao1 {
    public void Link() {
        try
        {
            Deque<String> links = new ArrayDeque<>();
            Scanner scan = new Scanner(new File("Lista_URL.txt"));
            Scanner ler = new Scanner(System.in);

            while(scan.hasNextLine()){
                links.add(scan.nextLine());
            }

            System.out.println("Lista Decrescente");
            for(Iterator itr = links.descendingIterator(); itr.hasNext();){
                System.out.println(itr.next().toString() + " ");
            }
            System.out.println("");
            System.out.println("*********************************");
            System.out.println("");

            System.out.println("Lista Convencional");
            for(Iterator itr = links.iterator(); itr.hasNext();){
                System.out.println(itr.next().toString() + " ");
            }
            System.out.println("");
            System.out.println("*********************************");
            System.out.println("");


            System.out.print("Insira um link para deletar: ");
            String link = ler.nextLine();
            if(links.contains(link))
                links.remove(link);
            else
                System.out.println("Link inexistente!");

            System.out.println("");
            System.out.println("*********************************");
            System.out.println("");
            System.out.println("Lista Nova");
            for(Iterator itr = links.descendingIterator(); itr.hasNext();){
                System.out.println(itr.next().toString() + " ");
            }
            System.out.print("Tamanho da lista: " + links.size());

            System.out.println("");
            System.out.println("*********************************");
            System.out.println("");
            System.out.print("Consulte um link em nossa lista: ");
            String newLink = ler.nextLine();
            if(links.contains(newLink))
                System.out.println("Link Encontrado!");
            else
                System.out.println("Link não Encontrado!");

        }catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
