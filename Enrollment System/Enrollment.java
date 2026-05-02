public class Enrollment{
    public Section section;
    public Student student;

    public Enrollment(){
        this.section = null;
        this.student = null;
        System.out.println("Empty enrollment");
    }
    public Enrollment(Section section, Student student){
        this.section = section;
        this.student = student;
    }
}