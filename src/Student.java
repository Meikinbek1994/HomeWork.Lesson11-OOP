public class Student {
    String name;
    String surname;
    int age;


    public void getInfo(){
        System.out.println(name+"\n"+surname+"\n"+age);

        }
    public void addStudent(){
        System.out.println(name+" new student successfully added");
    }
    public void deleteStudent(){
        System.out.println(name+" old student successfully deleted");
    }
}
