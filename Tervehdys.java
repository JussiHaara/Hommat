import java.util.Scanner;

public class Tervehdys{

  public static void main(String[] args){
    Scanner skanneri = new Scanner(args[0]);
    String nimi = skanneri.nextLine();
    System.out.println("Hei, " + nimi);
  }
}
