import java.util.Locale;
import java.util.Scanner;

import static java.awt.PageAttributes.MediaType.C1;
public class Vowels {
    static void main(String[] args) {
        int v=0;
        int d=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s1=sc.nextLine();

        for(char C1:s1.toCharArray()){


            if("aeiou".indexOf(C1)!=-1){
                v++;
            }else{
                d++;
            }
        }
        System.out.println("Vowels="+v + " consonants= " +d);
    }
}
