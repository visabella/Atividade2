import java.util.*;

class Main {
  public static int maior(int a, int b) {
    if (a < b) {
      return (b);
    } else {
      return (a);
    }

  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Insira o numero: ");
    int a = entrada.nextInt();

    System.out.println("Insira o numero: ");
    int b = entrada.nextInt();

    System.out.println("O maior numero é: " + maior(a, b));

  }
}