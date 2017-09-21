package gametheory;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TypingOfWords {

	public static int typingOfWords(int input1,int[] input2)
	{
		int words = 1;
		for(int i =0; i < input2.length-1; i++){
			if(input2[i+1]-input2[i]<=5){
				words = words +1;
			} else{
				words = 1;
			}
		}
		return words;
	}

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1 = Integer.parseInt(in.nextLine().trim());
		int ip2_size = 0;
		ip2_size = Integer.parseInt(in.nextLine().trim());
		int[] ip2 = new int[ip2_size];
		int ip2_item;
		for(int ip2_i = 0; ip2_i < ip2_size; ip2_i++) {
			ip2_item = Integer.parseInt(in.nextLine().trim());
			ip2[ip2_i] = ip2_item;
		}
		output = typingOfWords(ip1,ip2);
		System.out.println(String.valueOf(output));
	}
}
