import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.printf("oi mano bao?\n quem é voc?");
    String nome = leitor.nextLine();

    System.out.printf("obrigado por ajudar o meu teste " + nome);
	}
}
