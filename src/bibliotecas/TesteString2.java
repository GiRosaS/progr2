package bibliotecas;

public class TesteString2 {

	public static void main(String[] args) {
		
		String a = "Java ADS na veia";
		String b[] = a.split(" "); //Express�o regular
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		
		String c = "java ads na veia";
		
		int i =a.compareTo(c);
		System.out.println(i);//deu -32
		
		int k =a.compareToIgnoreCase(c);
		System.out.println(k);// deu 0
		

	}

}
