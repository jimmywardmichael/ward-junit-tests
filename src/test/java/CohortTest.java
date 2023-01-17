import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class CohortTest{
    public static void testAddStudent() {
        List<Student> students = new ArrayList<>();
        Student student = new Student(3, "Kaylee");
        Cohort.addStudent(student);
        assertTrue(students.contains("Kaylee"));
    }
}
