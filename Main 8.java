import java.util.*;

class Main {
  public static double media(double a, double b, double c) {
    return ((a + b + c) / 3);

  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Insira o 1 numero: ");
    int a = entrada.nextInt();

    System.out.println("Insira o 2 numero: ");
    int b = entrada.nextInt();

    System.out.println("Insira o 3 numero: ");
    int c = entrada.nextInt();

    System.out.println("A media entre eles é: " + media(a, b, c));

  }
}