import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Map<String,Student> students = new HashMap<>();
        Student s1 = new Student("Amal", 95);
        Student s2 = new Student("Alaa", 80);
        Student s3 = new Student("Manar", 75);
        Student s4 = new Student("Nuha", 90);
        Student s5 = new Student("Tumadhir", 92);

        students.put(s1.getName(),s1);
        students.put(s2.getName(),s2);
        students.put(s3.getName(),s3);
        students.put(s4.getName(),s4);
        students.put(s5.getName(),s5);
        System.out.println(students);
        System.out.println(increaseGrades(students));

    }
    public static Map<String,Student> increaseGrades(Map<String,Student>students){
        for (Student student : students.values()) {
            student.setGrade((int) (student.getGrade() * 1.1));
        }
    return students;
}
   }