import java.util.Scanner;
import java.util.Random;

public class Ahorcado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] palabras = {"PANFLETO", "ENUMERACION", "ENCICLOPEDIA", 
				"HIPERBOLE", "MATEMATICA", "HISTORIA", "FILOSOFIA",
				"PELICULA", "MARATON", "DEPORTE", "ASCENSOR",
				"ARITMETICA", "PLANCHA", "LAVARROPAS", "TELEVISION"};
		String palabra;
		char [] palabraOculta;
		int errores=0;
		char letra;
		boolean estaONo=false;
		Ahorcado A = new Ahorcado();
		boolean salir=false;
		int opcion;
		
		Random rand = new Random();
		
		do {
			
			System.out.println("Elige tu opción:");
			System.out.println("1- ¡Jugar!");
			System.out.println("2- Salir");
			opcion=sc.nextInt();
			sc.nextLine();
			if (opcion==2) {
				break;
			}			
			palabra=palabras[rand.nextInt(palabras.length)];
			
			palabraOculta=palabra.toCharArray();
			
			System.out.println("Adivina la palabra:");
			System.out.println("");
			
			for (int i=0;i<palabra.length();i++) {
				palabraOculta[i]='_';
			}
			
			while (!String.valueOf(palabraOculta).equals(palabra)) {
				estaONo=false;
				
				for (int i=0;i<palabra.length();i++) {
					System.out.print(palabraOculta[i]);
					System.out.print(" ");
				}
				System.out.println("");
				System.out.println("");
				
				System.out.println("Ingrese una letra:");
				letra=sc.next().toUpperCase().charAt(0);
				System.out.println("");
				
				for (int i=0;i<palabra.length();i++) {
					if (letra==palabra.charAt(i)) {
						palabraOculta[i]=letra;
						estaONo=true;
					}
				}
				
				if (!estaONo) {
					System.out.println("¡La letra "+letra+" no se encuentra en la palabra!");
					errores+=1;
					A.ahorcadito(errores);
					if (errores==7) {
						break;
					}
				}
			}
			if (errores==7) {
				System.out.println("¡Perdiste!");
			} else {
				for (int i=0;i<palabra.length();i++) {
					System.out.print(palabraOculta[i]);
					System.out.print(" ");
				}
				System.out.println("");
				System.out.println("¡Ganaste!");
				System.out.println("");
				System.out.println("");
			}
		} while (!salir);
		
		sc.close();
	}
	
	public void ahorcadito(int errores) {
		System.out.println("");
		switch (errores) {
		case 0:
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("-");
			break;
		case 1:
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|	O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("-");
			break;
		case 2:
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|	O");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("-");
			break;
		case 3:
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|	O");
			System.out.println("|       |");
			System.out.println("|	|");
			System.out.println("|");
			System.out.println("-");
			break;
		case 4:
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|	O");
			System.out.println("|      /|");
			System.out.println("|	|");
			System.out.println("|");
			System.out.println("-");
			break;
		case 5:
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|	O");
			System.out.println("|      /|\\");
			System.out.println("|	|");
			System.out.println("|");
			System.out.println("-");
			break;
		case 6:
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|	O");
			System.out.println("|      /|\\");
			System.out.println("|	|");
			System.out.println("|      /");
			System.out.println("-");
			break;
		case 7:
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|	O");
			System.out.println("|      /|\\");
			System.out.println("|	|");
			System.out.println("|      / \\");
			System.out.println("-");
			break;
		}
	}
	
	

}
