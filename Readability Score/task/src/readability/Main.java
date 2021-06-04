package readability;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(args[0]);
        File file = new File(String.valueOf(Path.of(args[0])));
        Scanner scanner = new Scanner(file);
        int words = 0;
        int chars = 0;
        int sentences = 0;
        int syllables = 0;
        int polysyllables = 0;
        String tmp = null;
        while (scanner.hasNext()) {
            tmp = scanner.nextLine();
            String tmp1 = tmp;
            System.out.println(tmp1);
            tmp1 = tmp.replaceAll("[e]\\b", "");
            tmp1 = tmp1.toLowerCase();
            tmp1 = tmp1.replaceAll("you", "a");
            tmp1 = tmp1.replaceAll("[aeiouy]{2}", "a");
            String[] wordAr = tmp1.split(" ");
            for (String s : wordAr) {
                if (s.replaceAll("(?i)[^aeiouy]", "").length() >= 3){
                    polysyllables++;
                }
            }
            tmp1 = tmp1.replaceAll(" th "," a ");
            tmp1 = tmp1.replaceAll("[,.]","");
            tmp1 = tmp1.replaceAll(" w "," a ");
            tmp1 = tmp1.replaceAll("[0-9]+", "a");
            tmp1 = tmp1.replaceAll("[^aeiouy]", "");
            syllables += tmp1.length();
            words += tmp.split("([\\s+])").length;
            chars += tmp.replace(" ","").length();
            sentences += tmp.split("[.!?]").length;
        }

        double scoreARI = 4.71 * (double) chars / (double) words + 0.5 * (double) words / sentences - 21.43;
        double scoreFlesh = 0.39 * (double) words / (double) sentences + 11.8 * (double) syllables / (double) words - 15.59;
        double scoreSMOG = 1.043 * Math.sqrt( (double) polysyllables * 30.0 / (double) sentences) + 3.1291;
        double L = ((double) chars / (double) words) * 100.0;
        double S = ((double) sentences / (words)) * 100.0;
        double scoreColeman = 0.0588 * L - 0.296 * S - 15.8;
        System.out.println("Words: " + words);
        System.out.println("Sentences: " +sentences);
        System.out.println("Characters: " + chars);
        System.out.println("Syllables: " + syllables);
        System.out.println("Polysyllables: " + polysyllables);
        System.out.printf("Automated Readability Index: %4.2f (about %s).\n", scoreARI, tabScore((int) Math.floor(scoreARI) - 1) );
        System.out.printf("Flesch–Kincaid readability tests: %4.2f (about %s).\n",scoreFlesh, tabScore((int) Math.floor(scoreFlesh) - 1));
        System.out.printf("Simple Measure of Gobbledygook: %4.2f (about %s).\n", scoreSMOG, tabScore((int) Math.floor(scoreSMOG) - 1));
        System.out.printf("Coleman–Liau index: %4.2f (about %s).\n", scoreColeman, tabScore((int) Math.floor(scoreColeman - 1)  ));
    }
    public static String tabScore(int score) {
        String[] tabScore = new String[14];
        tabScore[0] = "6-years-olds";
        tabScore[1] = "7-years-olds";
        tabScore[2] = "9-years-olds";
        tabScore[3] = "10-years-olds";
        tabScore[4] = "11-years-olds";
        tabScore[5] = "12-years-olds";
        tabScore[6] = "13-years-olds";
        tabScore[7] = "14-years-olds";
        tabScore[8] = "15-years-olds";
        tabScore[9] = "16-years-olds";
        tabScore[10] = "17-years-olds" ;
        tabScore[11] = "18-years-olds";
        tabScore[12] = "24-years-olds";
        tabScore[13] = "24+-years-olds";
        return tabScore[score];
    }
}
