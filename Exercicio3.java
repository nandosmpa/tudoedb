public class Main {
    public static void main(String[] args) {
        int[] v = {14, 62, 31, 5, 48, 20, 39, 10, 24, 8};
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] < v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado em ordem decrescente com Bubble Sort:");
        imprimirVetor(v);
    }

    static void imprimirVetor(int[] v) {
        for (int i : v) System.out.print(i + " ");
        System.out.println();
    }
}