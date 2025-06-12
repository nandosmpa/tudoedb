public class Main {
    public static void main(String[] args) {
        int[] v = {34, 12, 57, 8, 49, 21, 73, 16, 42, 5};
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado com Bubble Sort:");
        imprimirVetor(v);
    }

    static void imprimirVetor(int[] v) {
        for (int i : v) System.out.print(i + " ");
        System.out.println();
    }
}