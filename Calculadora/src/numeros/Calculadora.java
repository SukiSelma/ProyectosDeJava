package numeros;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int a=0, b=0, res=0;// dos variabres para hacer la operaci�n y el resulado.
		String sel=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("Selecciona una opci�n\n");
		System.out.println("+: Suma"+ "\n-: Resta"+"\n*: Multiplicaci�n"+ "\n/:Divisi�n");
		sel=tec.next();
		
		switch(sel) {
		case "+":
			System.out.println("ha seleccionado suma\n Introduce los valores");
			System.out.println("Introduce el primer n�mero");
			a=tec.nextInt();
			System.out.println("Introduce el segundo n�mero");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a + "+" + b+ "="+ res);
			break;
		case "-":
			System.out.println("ha seleccionado resta\n Introduce los valores");
			System.out.println("Introduce el primer n�mero");
			a=tec.nextInt();
			System.out.println("Introduce el segundo n�mero");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a + "-" + b+ "="+ res);
			break;
		case "*":
			System.out.println("ha seleccionado multiplica�n\n Introduce los valores");
			System.out.println("Introduce el primer n�mero");
			a=tec.nextInt();
			System.out.println("Introduce el segundo n�mero");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a + "*" + b+ "="+ res);
			break;
		case "/":
			System.out.println("ha seleccionado divisi�n\n Introduce los valores");
			System.out.println("Introduce el primer n�mero");
			a=tec.nextInt();
			System.out.println("Introduce el segundo n�mero");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a + "/" + b+ "="+ res);
			break;
			
		
		}

	}

}
