import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        menu:
        while(true){
            System.out.println("Menú");
            System.out.println("-".repeat(30));
            System.out.println("1) opcion 1\n2) opcion 2\n3) opcion 3");

            int res = in.nextInt();

            switch (res){
                case 1 -> {
                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("Elejiste la opcion 1");
                }
                case 2 -> {
                    System.out.println("Elejiste la opcion 2");
                }
                case 3 -> {
                    System.out.println("Elejiste la opcion 3");
                }
                case 4 -> {
                    System.out.println("Adios");
                    break menu;
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
        }
        System.out.println("fuera del menu");
    }
}