import java.util.Scanner;

public class Opdracht_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String i;
        System.out.print("Welk karakter moet ik gebruiken voor het oog: ");
        i = input.next();

        String een = "\n  " + i + "\n";
        String twee = "\t" + i + "\n\n" + i;
        String drie = "\t" + i + "\n  " + i + "\n" + i;
        String vier = i + "\t" + i + "\n\t\t\t\n" + i + "\t" + i;
        String vijf = i + "\t" + i + "\n  " + i + "\t\n" + i + "\t" + i;
        String zes = i + "\t" + i + "\n" + i + "\t" + i + "\n" + i + "\t" + i;

        int x;
        while(true){
            x = (int) (Math.random() * 7);

            System.out.println("---------------------");
            if (x == 1) {
                System.out.println(een);
            }
            if (x == 2) {
                System.out.println(twee);
            }
            if (x == 3) {
                System.out.println(drie);
            }
            if (x == 4) {
                System.out.println(vier);
            }
            if (x == 5) {
                System.out.println(vijf);
            }
            if (x == 6) {
                System.out.println(zes);
                break;
            }
        }
    }
}
