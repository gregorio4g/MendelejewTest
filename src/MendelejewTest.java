import java.util.Random;
import java.util.Scanner;

public class MendelejewTest {
    private static final String[][] PT = {
            {"wodor", "H"}, {"hel", "He"},

            {"lit", "Li"}, {"beryl", "Be"}, {"bor", "B"}, {"wegiel", "C"}, {"azot", "N"},
            {"tlen", "O"}, {"fluor", "F"}, {"neon", "Ne"},

            {"sod", "Na"}, {"magnez", "Mg"}, {"glin", "Al"}, {"krzem", "Si"}, {"fosfor", "P"},
            {"siarka", "S"}, {"chlor", "Cl"}, {"argon", "Ar"},

            {"potas", "K"}, {"wapn", "Ca"}, {"skand", "Sc"}, {"tytan", "Ti"}, {"wanad", "V"},
            {"chrom", "Cr"}, {"mangan", "Mn"}, {"zelazo", "Fe"}, {"kobalt", "Co"}, {"nikiel", "Ni"},
            {"miedz", "Cu"}, {"cynk", "Zn"}, {"gal", "Ga"}, {"german", "Ge"}, {"arsen", "As"},
            {"selen", "Se"}, {"brom", "Br"}, {"krypton", "Kr"},

            {"rubid", "Rb"}, {"stront", "Sr"}, {"itr", "Y"}, {"cyrkon", "Zr"}, {"niob", "Nb"},
            {"molibden", "Mo"}, {"technet", "Tc"}, {"ruten", "Ru"}, {"rod", "Rh"}, {"pallad", "Pd"},
            {"srebro", "Ag"}, {"kadm", "Cd"}, {"ind", "In"}, {"cyna", "Sn"}, {"antymon", "Sb"},
            {"tellur", "Te"}, {"jod", "I"}, {"ksenon", "Xe"},
    };

    static Random rand = new Random();

    static final int numQuestions = 20;

    public static void main(String[] args) {
        System.out.println(PT.length);
        Scanner sc = new Scanner(System.in);
        int points = 0;
        for (int i = 0; i < numQuestions; i++) {
            int element = rand.nextInt(PT.length);
            int question = rand.nextInt(2);
            int answer = (question + 1) % 2;
            System.out.print(PT[element][question] + " -> ");
            String ans = sc.next();
            if (PT[element][answer].equalsIgnoreCase(ans)) {
                System.out.println("Tak " + PT[element][answer]);
                points++;
            } else {
                System.out.println("Nie " + PT[element][question] + " -> " + PT[element][answer]);
            }
        }
        System.out.printf("punkty: %d / %d. %n", points, numQuestions );
    }
}