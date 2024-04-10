import Questao2.SerieFibonacci;
import Questao3.NotasAlunos;
import Questao4.LacoRepeticao;

public class Main {
    public static void main(String[] args) {
        SerieFibonacci serieFibonacci = new SerieFibonacci();
        serieFibonacci.adicionarNoArray();
        serieFibonacci.imprimirArray();

        System.out.println("-----------------------");
        System.out.println();

        NotasAlunos notasAlunos = new NotasAlunos();
        notasAlunos.preencherArray();
        notasAlunos.calcularMedia();
        notasAlunos.quantidadeDeNotasAcimaEAbaixoDaMedia();

        System.out.println("--------------------------");
        System.out.println();

        LacoRepeticao lacoRepeticao = new LacoRepeticao();
        lacoRepeticao.adicionarNumerosArray();
        lacoRepeticao.media();
    }
}