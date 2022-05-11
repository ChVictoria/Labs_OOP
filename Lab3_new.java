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
        String[] sentences = text.toString().split("(?<=[.?!]{1,3}) "); //"(?<=([.?!]+)) " ?? подумай
        String[][] splitted_sentences = new String[sentences.length][];
        for (int i = 0; i < sentences.length; i++) {
            splitted_sentences[i] = sentences[i].split("([ -]+)");
        }
        Arrays.sort(splitted_sentences, Comparator.comparingInt(o -> o.length));
        StringBuffer final_text = new StringBuffer();
        for (String[] splitted_sentence : splitted_sentences) {
            for (String s : splitted_sentence) {
                final_text.append(s).append(" ");
            }
        }
        System.out.println(final_text);
    }
}
