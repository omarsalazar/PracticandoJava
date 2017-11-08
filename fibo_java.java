// creo que este codigo está kk, estoy seguro que se puede hacer de una manera más "elegante".
import java.util.*;
class fibo_java{
	public static void main(String[] args) {
		int a = 0, b = 1, c, num;
		Scanner leer = new Scanner(System.in);
		// fibo pa' los cuates uwu.
		System.out.println("Cuantos numeros quieres de la sucecion fibo ");
		num = leer.nextInt();
		if (num < 2) {
			System.out.print(a);
		}
		else {
			System.out.print(a+" "+b+" ");
			for (int i = 0; i < num - 2 ; i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.print(c+" ");
			}
		}
	}
}