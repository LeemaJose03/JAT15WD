package additional;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Session";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		// trim() 
		
		String trimmed= s.trim();  //Session
		
		// startsWith() endsWith()
		
		System.out.println(trimmed.startsWith("Se"));
		System.out.println(trimmed.endsWith("on"));
		
		// chatAt()
		
		System.out.println(trimmed.charAt(1));
		
		// length()
		
		System.out.println(trimmed.length());
		
		String s1="This is my first python ";
		
		//String s2 =s1.replace("python", "java");
		
		//System.out.println(s2.contains("java"));
		
		//concat()   -- join two strings
		
		System.out.println(s1.concat(trimmed));
		
		// compare
		
		String name ="session";
		String name1 ="SESSION";
		
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		
		
	}

}
