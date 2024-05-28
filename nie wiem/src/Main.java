public class Main {
    public static void main(String[] args) {
        double[] grades = new double[]{2,2,2,3,3,3};
        Student student1=new Student("Łukasz", "Benedyczak", "31461", "s31461@pjwstk.edu.pl", "Legionowo", grades);
        Student student2 = new Student("A", "B", "123456", "s123456@pjwstk.edu.pl", "Warszawa", grades);
        student1.getMean(student1.grades);
        StudentGroup grupa1 =new StudentGroup("Grupa 1");
        grupa1.addStudent(student1);
        grupa1.addStudent(student2);
    }}