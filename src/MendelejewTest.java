import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MendelejewTest {
	private static final int numQuestions = 20;
	private static final String[][] PT = { // PT = Period Table
			// gr 1
			{"wodor", "H"}, {"hel", "He"},
			// gr 2
			{"lit", "Li"}, {"beryl", "Be"}, {"bor", "B"}, {"wegiel", "C"}, {"azot", "N"},
			{"tlen", "O"}, {"fluor", "F"}, {"neon", "Ne"},
			// gr 3
			{"sod", "Na"}, {"magnez", "Mg"}, {"glin", "Al"}, {"krzem", "Si"}, {"fosfor", "P"},
			{"siarka", "S"}, {"chlor", "Cl"}, {"argon", "Ar"},
			// gr 4
			{"potas", "K"}, {"wapn", "Ca"}, {"skand", "Sc"}, {"tytan", "Ti"}, {"wanad", "V"},
			{"chrom", "Cr"}, {"mangan", "Mn"}, {"zelazo", "Fe"}, {"kobalt", "Co"}, {"nikiel", "Ni"},
			{"miedz", "Cu"}, {"cynk", "Zn"}, {"gal", "Ga"}, {"german", "Ge"}, {"arsen", "As"},
			{"selen", "Se"}, {"brom", "Br"}, {"krypton", "Kr"},
			// gr 5
			{"rubid", "Rb"}, {"stront", "Sr"}, {"itr", "Y"}, {"cyrkon", "Zr"}, {"niob", "Nb"},
			{"molibden", "Mo"}, {"technet", "Tc"}, {"ruten", "Ru"}, {"rod", "Rh"}, {"pallad", "Pd"},
			{"srebro", "Ag"}, {"kadm", "Cd"}, {"ind", "In"}, {"cyna", "Sn"}, {"antymon", "Sb"},
			{"tellur", "Te"}, {"jod", "I"}, {"ksenon", "Xe"},
			// gr 6
			{"cez", "Cs"}, {"bar", "Ba"}, {"lantan", "La"},
			// Lantanowce
			{"cer", "Ce"}, {"prazeodym", "Pr"}, {"neodym", "Nd"}, {"promet", "Pm"}, {"samar", "Sm"},
			{"europ", "Eu"}, {"gadolin", "Gd"}, {"terb", "Tb"}, {"dysproz", "Dy"}, {"holm", "Ho"},
			{"erb", "Er"}, {"tul", "Tm"}, {"iterb", "Yb"}, {"lutet", "Lu"},
			// gr 6 cd
			{"hafn", "Hf"}, {"tantal", "Ta"},
			{"wolfram", "W"}, {"ren", "Re"}, {"osm", "Os"}, {"iryd", "Ir"}, {"platyna", "Pt"},
			{"zloto", "Au"}, {"rtec", "Hg"}, {"Tal", "Tl"}, {"olow", "Pb"}, {"bizmut", "Bi"},
			{"polon", "Po"}, {"astat", "At"}, {"radon", "Rn"},
			// gr 7
			{"frans", "Fr"}, {"rad", "Ra"}, {"aktyn", "Ac"},
			// Aktynowce
			{"tor", "Th"}, {"protaktyn", "Pa"}, {"uran", "U"}, {"neptun", "Np"}, {"pluton", "Pu"},
			{"ameryk", "Am"}, {"kiur", "Cm"}, {"berkel", "Bk"}, {"kaliforn", "Cf"}, {"einstein", "Es"},
			{"ferm", "Fm"}, {"mendelew", "Md"}, {"nobel", "No"}, {"lorens", "Lr"},
			// gr 7 cd
			{"rutherford", "Rf"}, {"dubn", "Db"},
			{"seaborg", "Sg"}, {"bohr", "Bh"}, {"has", "Hs"}, {"meitner", "Mt"}, {"darmsztadt", "Dt"},
			{"roentgen", "Rg"}, {"kopernik", "Cn"}, {"nihon", "Nh"}, {"flerov", "Fl"}, {"moscow", "Mc"},
			{"liwermor", "Lv"}, {"tenes", "Ts"}, {"oganeson", "Og"}
	};
	private static final boolean[] checkArray = new boolean[PT.length];
	static Random rand = new Random();

	static {
//		Arrays.fill(checkArray, false);
		Arrays.fill(checkArray, 0, PT.length-1, true);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int points = 0;

		for (int i = 0; i < numQuestions; i++) {
			int element = rand.nextInt(PT.length);
			while (!checkArray[element]) {
				element = rand.nextInt(PT.length);
			}
			int question = rand.nextInt(2);
			int answer = (question + 1) % 2;
			System.out.print(PT[element][question] + " -> ");
			String ans = sc.next();
			if ("x".equalsIgnoreCase(ans)) {
				System.out.println("Pominięty: " + PT[element][question] + " -> " + PT[element][answer]);
				i--;
			} else {
				if (PT[element][answer].equalsIgnoreCase(ans)) {
					System.out.println("Tak " + PT[element][answer]);
					points++;
				} else {
					System.out.println("Nie " + PT[element][question] + " -> " + PT[element][answer]);
				}
			}

		}
		System.out.printf("punkty: %d / %d. %n", points, numQuestions);
	}
}