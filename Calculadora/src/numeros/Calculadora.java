package numeros;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int a=0, b=0, res=0;// dos variabres para hacer la operación y el resulado.
		String sel=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("Selecciona una opción\n");
		System.out.println("+: Suma"+ "\n-: Resta"+"\n*: Multiplicación"+ "\n/:División");
		sel=tec.next();
		
		switch(sel) {
		case "+":
			System.out.println("ha seleccionado suma\n Introduce los valores");
			System.out.println("Introduce el primer número");
			a=tec.nextInt();
			System.out.println("Introduce el segundo número");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a + "+" + b+ "="+ res);
			break;
		case "-":
			System.out.println("ha seleccionado resta\n Introduce los valores");
			System.out.println("Introduce el primer número");
			a=tec.nextInt();
			System.out.println("Introduce el segundo número");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a + "-" + b+ "="+ res);
			break;
		case "*":
			System.out.println("ha seleccionado multiplicaón\n Introduce los valores");
			System.out.println("Introduce el primer número");
			a=tec.nextInt();
			System.out.println("Introduce el segundo número");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a + "*" + b+ "="+ res);
			break;
		case "/":
			System.out.println("ha seleccionado división\n Introduce los valores");
			System.out.println("Introduce el primer número");
			a=tec.nextInt();
			System.out.println("Introduce el segundo número");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a + "/" + b+ "="+ res);
			break;
			
		
		}

	}

}
