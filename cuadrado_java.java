import java.util.*;
class cuadrado_java{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int num;
		System.out.println("Ingresa la medida del lado que quieres ");
		num = leer.nextInt();
		for (int x = 0; x < num; x++){
			System.out.println(" ");
			for (int y = 0; y < num; y++){
				System.out.print(" * ");
			}
		}
	}
}