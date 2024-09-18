//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        Student student1 = new Student("1", "Eduard", 18);
        Student student2 = new Student("2", "Alek", 52);

        registry.addStudent(student1);
        registry.addStudent(student2);
        System.out.println("All students:");
        registry.displayAllStudents();

        System.out.println("\nSearching student with id: 1");
        System.out.println(registry.findStudentById("1"));

        registry.removeStudent("1");

        System.out.println("\nAll students after removing id 1:");
        registry.displayAllStudents();
    }
}