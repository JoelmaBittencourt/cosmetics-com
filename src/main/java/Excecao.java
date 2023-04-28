public class Excecao {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        System.out.println("Antes da exception");
        vetor[10] = 10;
        System.out.println("Depois da exception");


        try {
            System.out.println("Antes da exception");
            vetor[10] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Depois da exception");
        }


        try {
            System.out.println("Antes da exception");
            vetor[10] = 10;
        } catch (Exception e) {
            System.out.println("Depois da exception");
            e.printStackTrace();
        }


        try {
            System.out.println("Antes da exception");
            vetor[10] = 10;
        } catch (ExceptionInInitializerError e) {
            System.out.println("Primeira exception");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Segunda exception");
        }


        try {
            System.out.println("Antes da exception");
            vetor[10] = 10;
        } catch (ExceptionInInitializerError e) {
            System.out.println("Primeira exception");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Segunda exception");
        } finally {
            System.out.println("finalização do bloco");
        }

    }
}
