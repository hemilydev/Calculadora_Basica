public class Main {
    public static void main(String[] args) {

        int a, b;
        int soma, subtracao, multiplicacao, divisao;
        int potenciaQuadradoA, potenciaQuadradoB;
        int potenciaCuboA, potenciaCuboB;
        double mediaSimples, diferencaPercentual;

        a = 24;
        b = 6;

        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = a / b;

        potenciaQuadradoA = a * a;
        potenciaQuadradoB = b * b;

        potenciaCuboA = a * a * a;
        potenciaCuboB = b * b * b;

        mediaSimples = (a + b) / 2.0;
        diferencaPercentual = ((double) (a - b) / b) * 100;

        System.out.println("Soma: " + soma);
        System.out.println();
        System.out.println("Subtração: " + subtracao);
        System.out.println();
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println();
        System.out.println("Divisão: " + divisao);
        System.out.println();
        System.out.println("Potência ao quadrado de a: " + potenciaQuadradoA);
        System.out.println();
        System.out.println("Potência ao quadrado de b: " + potenciaQuadradoB);
        System.out.println();
        System.out.println("Potência ao cubo de a: " + potenciaCuboA);
        System.out.println();
        System.out.println("Potência ao cubo de b: " + potenciaCuboB);
        System.out.println();
        System.out.println("Média simples: " + mediaSimples);
        System.out.println();
        System.out.println("Diferença percentual de a em relação a b: " + diferencaPercentual);
    }
}
