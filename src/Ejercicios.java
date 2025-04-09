public class Ejercicios {

    public int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaConsecutivos(n - 1);
        }
    }

    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }
}
