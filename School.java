import java.util.Random; // For random ID
public class School {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("John", "Junior", 3.9, 1);
        Student s2 = new Student("Jane", "Freshman", 3.5, 2);
        Student s3 = new Student("Anthony", "Senior", 2.3, 3);
        Student s4 = new Student("Ava", "Sophmore", 3.7, 4);
        Student s5 = new Student("Dave", "Junior", 3.0, 5);

        System.out.println(s1.isHonors()); // Print student's honor status
        System.out.println(s2.isHonors());
        System.out.println(s3.isHonors());
        System.out.println(s4.isHonors());
        System.out.println(s5.isHonors());

        System.out.println("");

        Random r = new Random(); // Generated a random free lunch ID
            int freeLunchID = r.nextInt(5) + 1; // Random number between 1 and 5
            System.out.println("Free lunch ID: " + freeLunchID);

        System.out.println(s1.freeLunch(freeLunchID)); // Print student's free lunch status
        System.out.println(s2.freeLunch(freeLunchID));
        System.out.println(s3.freeLunch(freeLunchID));
        System.out.println(s4.freeLunch(freeLunchID));
        System.out.println(s5.freeLunch(freeLunchID));
    }
}
/*
In this assignment, I learned how to use the random class to generate numbers and use them in my code. I learned this by looking it up.
I also learned that I need to be aware of what my functions are returning, and if they need to return anything at all.
*/