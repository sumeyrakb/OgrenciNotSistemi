public class Teacher {
    String name;
    String mobile_no;
    String branch;

    Teacher(String name, String mobno, String branch){
        this.name = name;
        this.mobile_no = mobno;
        this.branch = branch;
    }

    void print(){
        System.out.println("..............................");
        System.out.println("Adı:  " + this.name);
        System.out.println("Telefonu:  "+ this.mobile_no);
        System.out.println("Bölümü:  " + this.branch);

    }
}
