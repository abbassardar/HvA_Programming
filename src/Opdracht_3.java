import java.util.Scanner;

public class Opdracht_3 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float fys;
            float p;
            float d;
            float ps;
            float pjs;
            float i;
            float ne;
            float fysbp;
            float pbp;
            float dbp;
            float psbp;
            float pjsbp;
            float ibp;
            float nebp;
            float bp;

            System.out.println("Voer behaalde cijfers : \n" +
                    "Fasten Your Seatbelts:");
            fys =input.nextFloat();
            System.out.println("Programming:");
            p = input.nextFloat();
            System.out.println("Databases: ");
            d = input.nextFloat();
            System.out.println("Personal Skills: ");
            ps = input.nextFloat();
            System.out.println("Project Skills: ");
            pjs = input.nextFloat();
            System.out.println("Infrastructure: ");
            i = input.nextFloat();
            System.out.println("Network Engineering 1: ");
            ne = input.nextFloat();

            if(fys >= 5.5){fysbp = 12;}else {fysbp =0;}
            if(fys >= 5.5){pbp = 3;}else {pbp =0;}
            if(fys >= 5.5){dbp = 3;}else {dbp =0;}
            if(fys >= 5.5){psbp = 2;}else {psbp =0;}
            if(fys >= 5.5){pjsbp = 2;}else {pjsbp =0;}
            if(fys >= 5.5){ibp = 3;}else {ibp =0;}
            if(fys >= 5.5){nebp = 3;}else {nebp =0;}

            bp =fysbp+pbp+dbp+psbp+pjsbp+ibp+nebp;

            System.out.println("" +
                    "Vak/project: Fasten Your Seatbelts \t\t Cijfer: " + fys + "  Behaalde punten: "+fysbp+"\n" +
                    "Vak/project: Programming \t\t\t Cijfer: " + p + "  Behaalde punten: "+pbp+"\n" +
                    "Vak/project: Databases \t\t\t\t Cijfer: " + d + "  Behaalde punten: "+dbp+"\n" +
                    "Vak/project: Personal Skills \t\t Cijfer: " + ps + "  Behaalde punten: "+psbp+"\n" +
                    "Vak/project: Project Skills \t\t Cijfer: " + pjs + "  Behaalde punten: "+pjsbp+"\n" +
                    "Vak/project: Infrastructure \t\t Cijfer: " + i + "  Behaalde punten: "+ibp+"\n" +
                    "Vak/project: Network Engineering 1 \t Cijfer: " + ne + "  Behaalde punten: "+nebp+"\n" +
                    "Totaal behaalde \t studiepunten: "+ bp +"/28\n" +
                    "PAS OP: je ligt op schema voor een negatief BSA! ");
    }
}
