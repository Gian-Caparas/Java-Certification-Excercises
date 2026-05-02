public class Main {
    public static void main(String[] args){
        Student stu = new Student("Bob");
        Section sec = new Section("Science");

        Enrollment enroll = new Enrollment(sec, stu);

        System.out.println("Section: " + enroll.section.sectionName);
        System.out.println("Student: " + enroll.student.studentName);

        //ARRAY OF STUDENTS
        Student[] students = {
            new Student("Gian"),
            new Student("Jay"),
            new Student("Ray"),
            new Student("Melvin"),
            new Student("Bea"),
            new Student("Melody")
        };

        //ARRAY OF SECTIONS
        Section[] sections = {
            new Section("Excellent"),
            new Section("Super"),
            new Section("Obedient"),
            new Section("Kind"),
            new Section("Funny"),
            new Section("Nice")
        };

        //ARRAY OF ENROLLMENT
        //get the length of the student or section           
        Enrollment[] enrolls = new Enrollment[students.length]; 

        for(int i=0; i<students.length; i++){
            enrolls[i] = new Enrollment(sections[i], students[i]);
            //loop thru to get the data of the array
        }

        for(int i=0; i<students.length; i++){
            System.out.println(
                "Student: " +  enrolls[i].student.studentName+
                " | Section: " + enrolls[i].section.sectionName
            );
        }
    }
}