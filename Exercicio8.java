public class Main {
    public static void main(String[] args) {
        double[] v = {5.2, 1.9, 4.3, 3.7, 2.8, 6.1, 0.5};
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    double temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }

        System.out.println("Números decimais ordenados com Bubble Sort:");
        imprimirVetor(v);
    }

    static void imprimirVetor(double[] v) {
        for (double n : v) System.out.print(n + " ");
        System.out.println();
    }
}