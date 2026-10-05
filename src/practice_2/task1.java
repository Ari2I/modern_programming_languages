import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);
    double y = 0.0;
    int n = scanner.nextInt();

    while (n < 1) {
        System.out.println("N должно быть больше 0!");
        n = scanner.nextInt();
    }

    for (int i = 1; i <= n; i++) {
        y += 1.0 / Math.sqrt(i);
    }
    System.out.print(y);

    scanner.close();
}
