import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    while (n <= 1) {
        System.out.println("N должно быть строго больше 1.");
        n = scanner.nextInt();
    }

    boolean isPrime = true;
    double b = Math.sqrt(n);

    for (int i = 2; i <= b; i++) {
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }
    System.out.print(isPrime);

    scanner.close();
}