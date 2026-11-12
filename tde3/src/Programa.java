public class Programa {
    public static void main(String[] args) {
        CalculadoraAreas calculadora = new CalculadoraAreas();

        System.out.println("Área do quadrado: " + calculadora.calcularArea(5));

        System.out.println("Área do retângulo: " + calculadora.calcularArea(5.0, 3.0));

        System.out.println("Área do círculo: " + calculadora.calcularArea(3.0));
    }
}
