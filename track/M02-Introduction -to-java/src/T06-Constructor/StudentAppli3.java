public class StudentAppli3 {
    String name;
    int age;
    double height;

    public StudentAppli3() {

    }

    public StudentAppli3(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    public StudentAppli3 (String name){
        this.name = name;
    }
    void display1(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    } 
    
}
