package Questao3;

import java.util.Scanner;

public class NotasAlunos {
    private float[] notasDosAlunos;
    private float media;
    private int quantidadeNotasAcima;
    private int quantidadeNotasAbaixo;
    public NotasAlunos(){
        notasDosAlunos = new  float[10];
        this.media = 0;
        this.quantidadeNotasAcima = 0;
        this.quantidadeNotasAbaixo = 0;
    }
    public void preencherArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe as notas: ");
        for (int i=0; i<notasDosAlunos.length;i++){
            notasDosAlunos[i] = scanner.nextFloat();
        }
    }
    public void calcularMedia(){
        float soma = 0;
        for (int i=0; i<notasDosAlunos.length;i++){
            soma +=notasDosAlunos[i];
        }
        this.media = soma/10;
        System.out.println("Média: " + this.media);
    }
    public void quantidadeDeNotasAcimaEAbaixoDaMedia(){
        for (int i =0; i<notasDosAlunos.length; i++){
            if (notasDosAlunos[i] < media){
                quantidadeNotasAbaixo++;
            }
            else {
                quantidadeNotasAcima++;
            }
        }
        System.out.println("Notas Acima da Media: " + this.quantidadeNotasAcima);
        System.out.println("Notas Abaixo da Média: " + this.quantidadeNotasAbaixo);

    }
}
