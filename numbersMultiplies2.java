import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner dados = new Scanner(System.in);

    System.out.println("Escolha um número  entre 1 a 10, para exibir seus multiplos: ");
    int num = dados.nextInt();
    System.out.printf("Tabuada de %d%n",num);
    for (int i=1; i <=10; i++){
      if (i>10){
        System.out.println("Tabuada Calculada com sucesso");
      } else {
        System.out.print(num*i);
      } 
    }
  }
}