class Student extends Person {
    private static int idCounter = 1;
    private final int studentID;
    private int[] grades;
    private int gradeCount;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = new int[100];
        this.gradeCount = 0;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            if (gradeCount < grades.length) {
                grades[gradeCount++] = grade;
            } else {
                System.out.println("Grade list is full. Cannot add more grades.");
            }
        } else {
            System.out.println("Invalid grade. Must be between 0 and 100.");
        }
    }

    public double calculateGPA() {
        if (gradeCount == 0) return 0.0;
        int total = 0;
        for (int i = 0; i < gradeCount; i++) {
            total += grades[i];
        }
        return total / (double) gradeCount;
    }

    public String toString() {
        return super.toString() + " I am a student with ID [" + studentID + "].";
    }
}

class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.salary += (int) (salary * percentage / 100.0);
        } else {
            System.out.println("Percentage must be positive.");
        }
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student("Luna", "Lovegood", 20, false);
        student.addGrade(46);
        student.addGrade(87);
        student.addGrade(67);
        student.addGrade(79);
        student.addGrade(96);
        student.addGrade(58);
        student.addGrade(83);
        System.out.println(student.toString());
        System.out.println("GPA: " + student.calculateGPA());

        Teacher teacher = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        System.out.println(teacher.toString());
        teacher.giveRaise(10); // 10% raise
        System.out.println("New Salary: $" + teacher.getSalary());
    }
}

