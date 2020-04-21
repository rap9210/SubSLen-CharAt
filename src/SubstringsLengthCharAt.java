import java.util.Scanner;

public class SubstringsLengthCharAt {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //take user input, prompt for a word and an index
        System.out.println("Enter any word.");
        String ans_word = scn.nextLine();
        int ans_word_length = ans_word.length();
        System.out.println("Now enter a number between 0 and "+ans_word_length);
        int ans_index = scn.nextInt();
        if (ans_index > ans_word_length){
            System.out.println("Index is larger than length.");
        }
        else{
            String ans_word_substring = ans_word.substring(0, ans_index);
            System.out.println("The length of "+ans_word+" is: "+ans_word_length);
            System.out.println("The substring from 0 to "+ans_index+" is: "+ans_word_substring);
        }
    }
}
