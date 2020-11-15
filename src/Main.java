import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(9);
		System.out.println("Компьютер загадал число от 0 до 9. Попытайтесь его угадать.");
		int answer = 1;
		while (answer == 1) {
			for (int i = 3; i > 0; i--) {
				System.out.println("Оставшееся количество попыток: " + i);
				System.out.print("Введите число: ");
				Scanner scanner = new Scanner(System.in);
				int userNum = scanner.nextInt();
				if (userNum > a)
					System.out.println("Загаданное число меньше.");
				if (userNum < a)
					System.out.println("Загаданное число больше.");
				if (userNum == a) {
					System.out.println("Вы угадали!");
					i = 0;
				}
				if (i == 1 && userNum != a) {
					System.out.println("Вы не угадали!");
					System.out.println("Загаданное число: " + a);
				}
			}
			System.out.println("Сыграете ещё раз? 0 - нет  1 - да");
			Scanner scanner1 = new Scanner(System.in);
			answer = scanner1.nextInt();
		}
	}
}
