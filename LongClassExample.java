import java.util.*;

class Course {
    private String courseId;
    private String courseName;
    private String creditHours;

    public Course(String courseId, String courseName, String creditHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCreditHours() {
        return creditHours;
    }
}

class Student {
    private String studentId;
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public String getStudentId() {
        return studentId;
    }

    public void showInfo() {
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("  - " + c.getCourseId() + " | " + c.getCourseName() + " (" + c.getCreditHours() + " CH)");
        }
    }
}

class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addCourse(String id, String name, String ch) {
        courses.add(new Course(id, name, ch));
        System.out.println("Course added successfully!");
    }

    public void addStudent(String id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    public void enrollStudent(String studentId, String courseId) {
        Student s = null;
        Course c = null;

        for (Student st : students) {
            if (st.getStudentId().equals(studentId)) {
                s = st;
                break;
            }
        }

        for (Course cs : courses) {
            if (cs.getCourseId().equals(courseId)) {
                c = cs;
                break;
            }
        }

        if (s != null && c != null) {
            s.enrollCourse(c);
            System.out.println("Enrollment successful!");
        } else {
            System.out.println("Student or Course not found!");
        }
    }

    public void showAllStudents() {
        System.out.println("\n===== ALL STUDENTS =====");
        for (Student s : students) {
            s.showInfo();
        }
    }
}

public class LongClassExample {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Course");
            System.out.println("2. Add Student");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. Show All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.print("Course ID: ");
                String id = sc.nextLine();
                System.out.print("Course Name: ");
                String name = sc.nextLine();
                System.out.print("Credit Hours: ");
                String ch = sc.nextLine();
                sms.addCourse(id, name, ch);

            } else if (choice.equals("2")) {
                System.out.print("Student ID: ");
                String id = sc.nextLine();
                System.out.print("Student Name: ");
                String name = sc.nextLine();
                sms.addStudent(id, name);

            } else if (choice.equals("3")) {
                System.out.print("Student ID: ");
                String sid = sc.nextLine();
                System.out.print("Course ID: ");
                String cid = sc.nextLine();
                sms.enrollStudent(sid, cid);

            } else if (choice.equals("4")) {
                sms.showAllStudents();

            } else if (choice.equals("5")) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid Input!");
            }
        }

        sc.close();
    }
}
