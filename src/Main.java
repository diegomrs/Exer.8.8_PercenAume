import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int m = 0, n = 0;

          do {

              try {
                  System.out.println("Digite um número positivo");
                  m = imput.nextInt();

                  System.out.println("Digite um segundo  número positivo");
                  n = imput.nextInt();

              } catch (NumberFormatException e) {
                  System.out.println("Número invalido");
              }
              String formato = String.format("%.2f", percentage_Increase(m,n));

              if (m < n) {
                  System.out.println("Percentual de aumento " + formato);
              } else {
                  System.out.println("Percentagem de redução " + formato);
              }
              imput.nextLine();

          } while (n < 0 && m < 0) ;

        }

    public static double percentage_Increase(int m, int n) {

        return (double) (n - m)/ m  * 100;

    }

}
