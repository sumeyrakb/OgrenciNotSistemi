public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Asli","7070000","TRH");
        Teacher t2 = new Teacher("Sudem", "150400000", "FZK");
        Teacher t3 = new Teacher("Ayse", "09040000","KMY");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya", "101", "KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("Harry ", "1652","4",tarih, fizik, kimya);
        s1.AddBulkExamNote(90,98,50, 85,68,90);
        s1.IsPass();

        Student s2 = new Student("Ron ", "256", "2", tarih, fizik, kimya);
        s2.AddBulkExamNote(45,70,66,90,70,100);
        s2.IsPass();

        Student s3 = new Student("Hermione ", "132", "3", tarih, fizik, kimya);
        s3.AddBulkExamNote(100,70,100,90,90,100);
        s3.IsPass();

    }
}