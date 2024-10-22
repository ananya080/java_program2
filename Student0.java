public class Student0 {
    int rollNumber;
    String name;
    String mobileNumber;
    public Student0(int rollNumber, String name, String mobileNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
    public void displayDetails() {
        System.out.println("Roll Number: " +rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " +mobileNumber);
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] students = new Student[5]; 
        students[0] = new Student(1, "John", "1234567890");
        students[1] = new Student(2, "Alice", "9876543210");
        students[2] = new Student(3, "Bob", "5555555555");
        students[3] = new Student(4, "Emily", "9998887776");
        students[4] = new Student(5, "Mike", "1112223334");
            for (int i = 0; i < students.length; i++) {
            System.out.println("Student " +(i + 1)+ " Details:");
            students[i].displayDetails();
        }
    }
}
