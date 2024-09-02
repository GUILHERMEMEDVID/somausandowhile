import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Programa que soma numeros inteiros até que entre o numero 0");

    int x = sc.nextInt();
    int soma = 0;

    while (x != 0) {sc.close();
      soma = soma + x;
      x = sc.nextInt();

    }
    System.out.println(soma);
    sc.close();
  }

}