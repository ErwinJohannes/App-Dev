import java.util.Scanner;

public class sample1 {
    long id;
    String name;
    int age;
    double salary;

    public static void main(String[] args) {
        sample1 person;
        Scanner scan = new Scanner(System.in);
        String strValue;

        person = new sample1();
        System.out.print("Enter ID : ");
        person.id = scan.nextLong();
        System.out.print("Enter Name : ");
        person.name = scan.next();
        System.out.print("Enter Age : ");
        person.age = scan.nextInt();
        System.out.print("Enter Salary : ");
        person.salary = scan.nextDouble();

            System.out.println("Data person : ");
            System.out.println("=================================\n ");
            System.out.println("ID : "+person.id );
            System.out.println("Name : " + person.name);
            System.out.println("Age : " + person.age);
            System.out.println("Salary : " + person.salary);

    }
}
