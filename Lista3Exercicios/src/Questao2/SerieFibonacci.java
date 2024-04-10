package Questao2;

public class SerieFibonacci {
    private  int[] serieFibonacci;
    public  SerieFibonacci(){
        serieFibonacci = new  int[30];
    }
    public void adicionarNoArray(){
        int atual = 0;
        int anterio = 1;
        int proximo = 0;
        for (int i=0; i<serieFibonacci.length;i++){
            proximo = anterio + atual;
            serieFibonacci[i] = anterio;
            atual = anterio;
            anterio = proximo;
        }
    }
    public  void imprimirArray(){
        for (int numeros : serieFibonacci){
            System.out.println("Numero: " + numeros);
        }
    }



}
