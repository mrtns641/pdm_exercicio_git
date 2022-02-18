public class TesteCalculadora {
    public static void main (String[] agrs) {
        Calculadora adicao = new Calculadora();
        Calculadora subtracao = new Calculadora();

        System.out.println(adicao.soma(15, 8));
        System.out.println(subtracao.subtrair(10, 5));
    }
}
