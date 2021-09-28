package aula3ponto4;

//ELEVAR AO QUADRADO
//java.lang.Math.pow() faz isso pra vc. elevar

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero_um;
        int opcao;
        int resultado;
        Scanner ler = new Scanner(System.in);


        System.out.print("MENU \n[1]-CALCULAR\n[0]-SAIR\nInforme sua opcao: ");
        opcao = ler.nextInt();

        if ((opcao != 1) && (opcao !=0)) {
            System.out.println("CONDICAO INVALIDA!");
            System.out.print("\n\nMENU \n[1]-CALCULAR\n[0]-SAIR\nInforme sua opcao: ");
            opcao = ler.nextInt();

        }else {

        for (int i = 0;opcao != 0 ;i++){
                System.out.print("Informe o numero a ser elevado ao quadrado: ");
                numero_um = ler.nextInt();
                resultado = numero_um * numero_um ;
                System.out.print("Informe o resultado: " + resultado);

            System.out.print("\n\nMENU \n[1]-CALCULAR\n[0]-SAIR\nInforme sua opcao: ");
            opcao = ler.nextInt();
            if ((opcao != 1)&& (opcao !=0)){
                System.out.println("CONDICAO INVALIDA!");
                break;

            }

            }

        }

    }

}
