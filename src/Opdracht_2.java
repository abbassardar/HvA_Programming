import java.util.Scanner;

public class Opdracht_2 {
    public static void main(String[] args) {

             Scanner input = new Scanner(System.in);


                System.out.println("Inkoopprijs: ");
                float inkoopPrijs = input.nextFloat();

                System.out.println("Winstmarge (in %): ");
                int winstmarge = input.nextInt() / 100;

                float verkoopPrijs = inkoopPrijs + (inkoopPrijs * winstmarge);

                System.out.println("Verkoopprijs exclusief BTW : "+ verkoopPrijs +"\n" +
                        "Verkoopprijs inclusief 6% BTW: "+ verkoopPrijs *1.06+"\n" +
                        "Verkoopprijs inclusief 21% BTW: "+verkoopPrijs *1.21 +"\n");
            }
        }