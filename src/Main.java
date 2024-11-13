package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para realizar a leitura de dados de entrada
        Scanner scanner = new Scanner(System.in);

        // Realiza a leitura do diâmetro da bola de boliche
        int diametro = scanner.nextInt();

        // Realiza a leitura das dimensões da caixa
        int altura = scanner.nextInt();
        int largura = scanner.nextInt();
        int profundidade = scanner.nextInt();

        // Chama o metodo verificarSeCabe e imprime o resultado
        System.out.println(verificarSeCabe(diametro, altura, largura, profundidade));

        // Fecha o scanner para economizar recursos
        scanner.close();
    }

    /**
     * Verifica se a bola de boliche cabe dentro da caixa de acordo com seu diâmetro e dimensões da caixa
     *
     * @param diametro     Diâmetro da bola de boliche.
     * @param altura       Altura da caixa.
     * @param largura      Largura da caixa.
     * @param profundidade Profundidade da caixa.
     * @return "S" se a bola cabe na caixa; "N" caso contrário.
     */
    public static String verificarSeCabe(int diametro, int altura, int largura, int profundidade) {

        // Realiza comparação do diâmetro da bola com dimensões da caixa
        // Se as medidas forem menores ou iguais a bola cabe dentro da caixa
        if (diametro <= altura && diametro <= largura && diametro <= profundidade) {
            return "S"; // se a bola couber na caixa, imprime "S"
        } else {
            return "N"; // se a bola não couber na caixa, imprime "N"
        }
    }
}