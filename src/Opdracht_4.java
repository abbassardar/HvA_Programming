import java.util.Scanner;

public class Opdracht_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String i;
        System.out.print("Welk karakter moet ik gebruiken voor het oog: ");
        i = input.next();

        String a = "\n  " + i + "\n";
        String b = "\t" + i + "\n\n" + i;
        String c = "\t" + i + "\n  " + i + "\n" + i;
        String d = i + "\t" + i + "\n\t\t\t\n" + i + "\t" + i;
        String e = i + "\t" + i + "\n  " + i + "\t\n" + i + "\t" + i;
        String f = i + "\t" + i + "\n" + i + "\t" + i + "\n" + i + "\t" + i;

        int x;
        while(true){
            x = (int) (Math.random() * 7);

            System.out.println("---------------------");
            if (x == 1) {
                System.out.println(a);
            }
            if (x == 2) {
                System.out.println(b);
            }
            if (x == 3) {
                System.out.println(c);
            }
            if (x == 4) {
                System.out.println(d);
            }
            if (x == 5) {
                System.out.println(e);
            }
            if (x == 6) {
                System.out.println(f);
                break;
            }
        }
    }
}
