package string;

import java.util.StringTokenizer;

public class StringTokenizerexample {

	public static void main(String[] args) {
		
		//string tokenizer helps to break strings in to words.
		
		String s = "javaismystrongestlanguage";
		
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.hasMoreTokens());
		}

	}

}
