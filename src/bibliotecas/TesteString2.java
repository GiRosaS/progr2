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
		
		//toLowerCase - caixa baixa
		a.toLowerCase();
		System.out.println(a);// d� errado
		
		System.out.println(a.toLowerCase()); //d� certo. aplica direto na sa�da ou cria uma variavel
		String e =a.toLowerCase();
		System.out.println(e);
		
		//toUpperCase	- caixa alta	
		a.toUpperCase();
		System.out.println(a);// d� errado
		
		System.out.println(a.toUpperCase()); //d� certo. aplica direto na sa�da ou cria uma variavel
		String f =a.toUpperCase();
		System.out.println(f);
		
	}

}
