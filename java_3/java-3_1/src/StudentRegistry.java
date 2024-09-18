import java.util.HashMap;
import java.util.Map;

class StudentRegistry {
    private Map<String, Student> students;

    public StudentRegistry() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(String id) {
        students.remove(id);
    }

    public Student findStudentById(String id) {
        return students.get(id);
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the registry.");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }
}