import java.util.ArrayList;
public class StudentGroup {
    String nazwa;
    ArrayList<Student> students = new ArrayList<>();
    public StudentGroup(String nazwa){this.nazwa  = nazwa;}
    public void addStudent(Student student) {
        if (this.students.size() == 15) {
            throw new IllegalStateException("Group is too big.");
        }
        for (Student st : students) {
            if(st.indexNumber == student.indexNumber) {
                throw new IllegalStateException("Student is already in the group");
            }}
        this.students.add(student);
    }}