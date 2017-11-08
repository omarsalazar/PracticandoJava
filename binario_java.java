import java.util.*;
class binario_java{
	public static void main(String[] args) {
		int num, coci;
		Scanner leer = new Scanner(System.in);
		System.out.println("Que numero quieres convertir a binario?");
		num = leer.nextInt();
		System.out.println("NOTA: el numero en binario esta al reves xD");
		do{
			coci = num % 2;
			num = num / 2;
			System.out.print(coci);
		}
		while (num != 0);
	}
}