public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Fernando", "Weskley", "Claudia", "Pedro", "Paulo"};
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - i - 1; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }
        System.out.println("Nomes ordenados em ordem alfabética:");
        imprimirVetor(nomes);
    }

    static void imprimirVetor(String[] v) {
        for (String nome : v) System.out.print(nome + " ");
        System.out.println();
    }
}