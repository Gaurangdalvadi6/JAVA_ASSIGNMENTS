package random;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be within 15 and 21 years.");
        }
        if (!name.matches("^[a-zA-Z]+$")) {
            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John", 20, "Computer Science");
            System.out.println("Student 1 created successfully.");
            Student student2 = new Student(2, "Mary12", 18, "Mathematics");
            System.out.println("Student 2 created successfully.");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception in thread main " + e);
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

