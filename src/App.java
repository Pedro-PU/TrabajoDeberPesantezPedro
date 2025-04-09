public class App {
    public static void main(String[] args) throws Exception {
        Ejercicios ejercicios = new Ejercicios();
        System.out.println("Suma de números hasta 5: " + ejercicios.sumaConsecutivos(5));
        System.out.println("Potencia 2^3: " + ejercicios.potencia(2, 3));
        System.out.println("Suma de dígitos de 1234: " + ejercicios.sumaDigitos(1234));
    }
}

