public class Main {
    public static void main(String[] args) {
        int[] v = {38, 25, 9, 14, 47, 3, 61, 17, 32, 6};
        int trocas = 0;

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    trocas++;
                }
            }
        }

        System.out.println("Vetor ordenado com Bubble Sort:");
        imprimirVetor(v);
        System.out.println("Número de trocas realizadas: " + trocas);
    }

    static void imprimirVetor(int[] v) {
        for (int i : v) System.out.print(i + " ");
        System.out.println();
    }
}