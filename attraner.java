
//Escreva um algoritmo que recebe um valor e imprima a sua tabuada
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Bem-Vindo(a) ao multiplex :)");
    Scanner dados = new Scanner(System.in);
    System.out.println("Escolha um número entre 1 a 10 para exibir seus multiplos: \nNúmero:");
    int num = dados.nextInt();

    if (num == 1) {
      System.out.println("0,1,2,3,4,5,6,7,8,9,10,...");
    }

    else if (num == 2) {
      System.out.println("0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,...");
    }

    else if (num == 3) {
      System.out.println("0,3,6,9,12,15,18,21,24,27,30,...");
    }

    else if (num == 4) {
      System.out.println("0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40,...");
    }

    else if (num == 5) {
      System.out.println("0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50,...");
    }

    else if (num == 6) {
      System.out.println("0, 6, 12, 18, 24, 30, 36, 42, 48, 54, 60,...");
    }

    else if (num == 7) {
      System.out.println("0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70,...");
    }

    else if (num == 8) {
      System.out.println("0, 8, 16, 24, 32, 40, 48, 56, 64, 72, 80,...");
    }

    else if (num == 9) {
      System.out.println("0, 9, 18, 27, 36, 45, 54, 63, 72, 81, 90,");
    }

    else if (num == 10) {
      System.out.println(", 10, 20, 30, 40, 50, 60, 70, 80, 90, 100,...");
    }

  }
}