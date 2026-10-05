import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter age: ");
    int age = input.nextInt();

    if (age >= 21) {
        System.out.println("You get a paper wrist band.");
    }
}
