public class Main {
    public static void main(String[] args) {
        int[] v = {5, 12, 18, 23, 29, 33, 41, 46, 50, 57};
        int comparacoes = 0;

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                comparacoes++;
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor já estava ordenado:");
        imprimirVetor(v);
        System.out.println("Número de comparações: " + comparacoes);
    }

    static void imprimirVetor(int[] v) {
        for (int i : v) System.out.print(i + " ");
        System.out.println();
    }
}