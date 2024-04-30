import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		List<Integer> options_list = new ArrayList<>();
		options_list.add(1);
        options_list.add(2);
        options_list.add(3);
        options_list.add(4);

		String options = "Opciones\n[1] Sumar\n[2] Restar\n[3] Multiplicar\n[4] Dividir";
		System.out.println(options);
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una opcion: ");
		Integer option = scanner.nextInt();

		if (!options_list.contains(option)) {
            System.out.println("Opcion no valida.");
        } else {
			System.out.println("Ingrese el primer numero: ");
			Integer number1 = scanner.nextInt();
	
			System.out.println("Ingrese el segundo numero: ");
			Integer number2 = scanner.nextInt();
	
			if (option == 1) {
				Sumar(number1, number2);
			} else if (option == 2) {
				Restar(number1, number2);
			} else if (option == 3) {
				Multiplicar(number1, number2);
			} else if (option == 4) {
				Dividir(number1, number2);
			} else {
				System.out.println("Opcion no valida.");
			}
		}

		scanner.close();
	}

	static void Sumar(Integer num1, Integer num2) {
		System.out.println("La suma de " + Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + (num1 + num2));
	}

	static void Restar(Integer num1, Integer num2) {
		System.out.println("La resta de " + Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + (num1 - num2));
	}

	static void Multiplicar(Integer num1, Integer num2) {
		System.out.println("La multiplicacion de " + Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + (num1 * num2));
	}

	static void Dividir(Integer num1, Integer num2) {
		System.out.println("La division de " + Integer.toString(num1) + " / " + Integer.toString(num2) + " = " + (num1 / num2));
	}
}