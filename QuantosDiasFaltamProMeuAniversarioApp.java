import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.printf("Em que mês estamos? (apenas números)");
      int matual = leitor.nextInt();
   int mesA = matual * 30;
        System.out.printf("Que dia é hoje? (apenas números)");
    int datual = leitor.nextInt();
    int total = mesA + datual;
    System.out.printf("Qual o em que você faz aniversário? (apenas números)");
     int mdepois = leitor.nextInt();
    int mesB = mdepois * 30;
    System.out.printf("Qual o dia exato do seu aniversário? (apenas números)");
     int ddepois = leitor.nextInt();
    int total2 = mesB + ddepois;
    int ultima = total2 - total;
      System.out.printf("Faltam " + ultima + " para o seu aniversário!");
    System.out.printf("Agora é só apertar enter para fechar o programa!")
      int fim = nextInt()
    
  }

}
