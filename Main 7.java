import java.util.*;

class Main {
  public static int dobro(int a) {

    return (a * 2);
  }

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int numero;
    System.out.println("Digite um numero inteiro: ");
    numero = entrada.nextInt();
    System.out.println("O dobro do seu numero e: " + dobro(numero));
  }
}