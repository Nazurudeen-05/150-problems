/**Given a String, the task is to insert another string in between the given String
at a particular specified index in Java. **/
public class p122 {

	public static void main(String[] args) {
		String s ="Welcomejava";
		String insert = "to";
		int index=7;
		for(int i=0;i<s.length();i++) {
			if(i==index)
				System.out.print(insert);
			System.out.print(s.charAt(i));
		}

	}

}
