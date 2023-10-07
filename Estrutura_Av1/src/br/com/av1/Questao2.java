package br.com.av1;

import java.util.Scanner;

public class Questao2 {
    public void Cosmeticos(){
        Scanner ler = new Scanner(System.in);
        int[][] estante = new int[40][40];
        boolean parar = false;


        while (!parar) {
            System.out.println("Qual produto deseja armazenar? ");
            System.out.println(
                            "1: Xampu" +
                            "2: Condicionador" +
                            "3: Hidratante" +
                            "4: Titura" +
                            "5: Demaquilante" +
                            "0: vazio");
            System.out.println();

            System.out.print("Entre com o número do armario: ");
            int armario = ler.nextInt();

            System.out.print("Emtre com o número da prateleira: ");
            int prateleira = ler.nextInt();

            System.out.print("Digite o numero do produto à armazenar: ");
            int id = ler.nextInt();

            if (estante[armario][prateleira] >= 40)
                System.out.println("Espacos insuficiente");

            if (armario < 0 || armario > 40 || prateleira < 0 || prateleira > 40) {
                System.out.println("Armario ou prateleira invalido.");
                continue;
            }

            if(id <= 5) {
                estante[armario][prateleira]++;
                System.out.println("O produto foi adicionado!");
            }

            System.out.print("Deseja prosseguir, (1)sim ou (2)nao ? ");
            int keep = ler.nextInt();
            if (keep == 2) {
                parar = true;
            } else if (keep == 1) {
                parar = false;
            }
        }
        System.out.println("Quantidade de caixas em cada prateleira/armario");
        for (int prateleira = 0; prateleira <= 40; prateleira++) {
            for (int armario = 0; armario <= 40; armario++) {
                System.out.print(estante[prateleira][armario]);
            }
        }
        ler.close();
    }
}

