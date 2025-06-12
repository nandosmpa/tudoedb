public class Main {
    public static void main(String[] args) {
        int[] v = {29, 18, 46, 12, 33, 4, 55, 9, 40, 21};
        boolean trocou;
        for (int i = 0; i < v.length - 1; i++) {
            trocou = false;
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
        System.out.println("Vetor ordenado com Bubble Sort otimizado:");
        imprimirVetor(v);
    }

    static void imprimirVetor(int[] v) {
        for (int i : v) System.out.print(i + " ");
        System.out.println();
    }
}