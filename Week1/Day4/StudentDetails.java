import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks in subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in subject 3: ");
        int m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
