import java.util.Scanner;
public class Tulo{
  public static void main(String[] args){
        System.out.println("Kuinka monta kertaa kerrotaan: ");
        int kertojenMaara = Integer.parseInt(args[0]);
        Scanner skanneri = new Scanner(System.in);
        System.out.println("Anna toinen luku: ");
        int kerrottava = skanneri.nextInt();
        System.out.println("Tulo: " + kerrottava);
          for (int i = 0; i < kertojenMaara-1; i++){
            System.out.println("Anna toinen luku: ");
            int kertoja = skanneri.nextInt();
            kerrottava = kerrottava * kertoja;
            System.out.println("Tulo: " + kerrottava);
          }
      }
}
