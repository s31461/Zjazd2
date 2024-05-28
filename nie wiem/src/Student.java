public class Student {
    String fname;
    String lname;
    String indexNumber;
    String email;
    String address;
    double[] grades;

    public Student(String fname, String lname, String indexNumber, String email, String address, double[] grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }
    public static double getMean(double[] grades){
        if (grades.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        if (grades.length > 20) {
            throw new IllegalArgumentException("Array is too long.");
        }
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double mean = sum / grades.length;
        return roundGrade(mean);
    }
    public static double roundGrade(double grade) {
        if (grade < 2.0) {
            return 2.0;
        } else if (grade >= 2.0 && grade < 2.5) {
            return 2.5;
        } else if (grade >= 2.5 && grade < 3.0) {
            return 3.0;
        } else if (grade >= 3.0 && grade < 3.5) {
            return 3.5;
        } else if (grade >= 3.5 && grade < 4.0) {
            return 4.0;
        } else if (grade >= 4.0 && grade < 4.5) {
            return 4.5;
        } else {
            return 5.0;
        }}}
