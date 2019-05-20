import java.util.Scanner;
public class TablicaImion {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Podaj imie");
        names[0] = input.nextLine();
        System.out.println("Podaj imie");
        names[1] = input.nextLine();
        System.out.println("Podaj imie");
        names[2] = input.nextLine();
        System.out.println(names[0] + " " + names[1] + " " + names[2]);

    }
}