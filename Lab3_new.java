import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/* 1429 % 3 = 1 => C3 = 1 => Тип змінних - StringBuffer
   1429 % 17 = 1 => C17 = 1 => Дія з рядком - Вивести всі речення заданого тексту в порядку зростання кількості слів у них.
 */

public class Lab3_new {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text.Then press Enter.Then press Ctrl+D.");
        StringBuffer text = new StringBuffer(scan.nextLine());

        while (scan.hasNext()) {
            StringBuffer a = new StringBuffer(scan.nextLine());
            text.append(a);
        }
        String[] sentences = text.toString().split("(?<=[.?!]{1,3}) +");
        String[][] splittedSentences = new String[sentences.length][];
        for (int i = 0; i < sentences.length; i++) {
            splittedSentences[i] = sentences[i].split("(( - )| +)");
        }
        Arrays.sort(splittedSentences, Comparator.comparingInt(o -> o.length));
        StringBuffer finalText = new StringBuffer();
        for (String[] splittedSentence : splittedSentences) {
            for (String s : splittedSentence) {
                finalText.append(s).append(" ");
            }
        }
        System.out.println(finalText);
    }
}
