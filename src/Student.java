public class Student {
    Course tarih;
    Course fizik;
    Course kimya;

    String name;
    String student_no;
    String subjects;
    double average;
    boolean IsPass;

    Student(String name, String student_no, String subjects, Course tarih, Course fizik, Course kimya){
        this.name = name;
        this.student_no = student_no;
        this.subjects = subjects;
        this.tarih = tarih;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0.0;
        boolean IsPass = false;
    }

    void AddBulkExamNote(int tarihen, int fiziken, int kimyaen, double tarihpn, double fizikpn, double kimyapn){
        this.tarih.average(tarihpn, tarihen);
        this.fizik.average(fizikpn, fiziken);
        this.kimya.average(kimyapn, kimyaen);
    }

    void print_note(){
        System.out.println("___________________________");
        System.out.println("Ogrenci Adi :  " + this.name);
        System.out.println("Ogrenci No:  " + this.student_no);
        System.out.println("Ders: " + this.tarih.name + " \tNot: " + this.tarih.note);
        System.out.println("Ders: " + this.fizik.name + " \tNot: " + this.fizik.note);
        System.out.println("Ders: " + this.kimya.name + " \tNot: " + this.kimya.note);
        System.out.println("Ortalamaniz: " + this.average);
    }

    void IsPass(){
        this.IsPass = IsCheckPass();
        print_note();
        this.average = (this.tarih.note + this.fizik.note + this.kimya.note) / 3.0;
        if (this.IsPass){
            System.out.println(this.name + " Sinifi Gectin !");
        }else{
            System.out.println(this.name + "Sinifta Kaldin !");
        }

    }

    void CalcAverage(){
        this.average = (this.tarih.note + this.fizik.note + this.kimya.note) / 3.0;
    }

    boolean IsCheckPass(){
        CalcAverage();
        return this.average > 55;

    }
}
