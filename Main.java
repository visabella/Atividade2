import java.util.*;
class Main {
  public static int fatorial(int a) {
    int fato=1, i;
    for (i=1; i<=a; i++){
      fato *= i;
    }
    return (fato);
  }
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Digite o numero em que gostaria de saber o fatorial: ");
  int a = input.nextInt();
  System.out.println(a + " ! = " + fatorial(a));



}
}

