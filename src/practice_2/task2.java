import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    int n = scanner.nextInt();

    while (Math.abs(x) >= 1){
        System.out.println("x должно быть по модулю меньше 1!");
        x = scanner.nextInt();
    }

    while (n <= 0){
        System.out.println("n должно быть больше 0!");
        n = scanner.nextInt();
    }

    double sum = 0.0;
    int sign = 1;
    double curr_x = x;

    for (int i = 1; i <= n; i++){
        sum += curr_x/i * sign;
        curr_x *= x;
        sign *= -1;
    }

    System.out.print(sum);

    scanner.close();


}
