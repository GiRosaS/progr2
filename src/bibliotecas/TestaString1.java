package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		//String a = new String("Java ADS a veia");
		String a = "Java ADS a veia";
		String b = "Java ADS a veia";
		//int a = 2;//primitivo
		//int b = 2;
				
		if (a == b) {
			System.out.println("a e b são iguais");
		}else {
			System.out.println("a e b são objetos diferentes");
		}
	
		//o meu deu igual mesmo com String
		
		//SE eu quero comparar o conteudo de um obje String:
		
		if (a.equals(b)) {
			System.out.println("a e b são iguais");
		}else {
			System.out.println("a e b são objetos diferentes");

		}
			
	}	
	
}
