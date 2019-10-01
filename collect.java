import java.util.Scanner;

public class collect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilha;
        int qtde;
        try {
            System.out.println("Quatnas inf. quer colocar");
            qtde = scanner.nextInt();
            for (int i = 0; i < qtde; i++) {
                pilha = scanner.nextInt();
                System.out.println(pilha);
            }
        } catch (Exception e) {
            System.out.println("Erro deu aqui: " + e);
        }
        scanner.close();

    }
}