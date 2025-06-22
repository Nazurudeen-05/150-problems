/** validation of an identifier**/
public class p97 {
	static String[] keywords = {
	        "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", 
	        "class", "const", "continue", "default", "do", "double", "else", "enum", 
	        "extends", "final", "finally", "float", "for", "goto", "if", "implements", 
	        "import", "instanceof", "int", "interface", "long", "native", "new", 
	        "package", "private", "protected", "public", "return", "short", "static", 
	        "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", 
	        "transient", "try", "void", "volatile", "while"
	    };
	public static boolean valid(String s) {
		if(s.isEmpty())
			return false;
		for(String k : keywords) {
			if(s.equals(k))
				return false;
		}if(Character.isDigit(s.charAt(0)))
			return false;
		for(int i=1;i<s.length();i++) {
			if(!Character.isLetter(s.charAt(i))&&s.charAt(i)!='_'&&s.charAt(i)!='$'&&!Character.isDigit(s.charAt(i)))
				return false;
		}return true;
	}
	public static void main(String[] args) {
		String s = "gi-i";
		if(valid(s))
			System.out.println("it is an valid identifier");
		else
			System.out.print("Not an valid identifier");

	}

}
