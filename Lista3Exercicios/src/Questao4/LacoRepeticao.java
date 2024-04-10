package Questao4;

import java.util.Scanner;

public class LacoRepeticao {
    private int[] numeros;
    private int quantidade;
    public LacoRepeticao(){
        this.quantidade = 0;
        numeros = new  int[1];
    }
    public void adicionarNumerosArray(){
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um numero interio maior ou igual a zero: ");
            num = scanner.nextInt();
            if (num >= 0) {
                if (quantidade == numeros.length) {
                    int arrayDeNumerosNovo[] = new int[numeros.length + 1];

                    for (int k = 0; k < numeros.length; k++) {
                        arrayDeNumerosNovo[k] = numeros[k];
                    }
                    numeros = arrayDeNumerosNovo;
                }
                numeros[quantidade] = num;
                quantidade++;
            }
        }while (num>=0);
    }
    public  void media(){
        float soma = 0;
        for (int i=0;i<numeros.length;i++){
            soma+= numeros[i];
        }
        System.out.println("Média: " + soma/numeros.length);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
