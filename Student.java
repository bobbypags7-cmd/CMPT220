public class Student{
    String name;
    String year;
    double gpa;
    int id;

    public Student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    
    public String isHonors(){
        if (this.gpa > 3.6){    // Get any given student's GPA and compare it to 3.6
            return this.name + " is an honors student.";
        } else {
            return this.name + " is not an honors student.";
        }
    }

    public String freeLunch(int freeLunchID) {
        if (this.id == freeLunchID) { // Compares student IDs to the generated free lunch ID
            return "Yay! " + this.name + " gets free lunch today!";
        } else {
            return this.name + " has to pay for lunch today lmao.";
        }
    }
}