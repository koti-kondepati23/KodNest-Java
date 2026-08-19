public class SimpleInterest {
    public static void main(String[] args) {

        double Principal=10000.0;
        float rate=6.5f;
        float time=2.0f;
        double Weight=72.0;
        double height=1.8;
        int sub1=78;
        int sub2=84;
        int sub3=69;
        int sub4=91;
        int sub5=88;
        int totalMarks=sub1+sub2+sub3+sub4+sub5;

        double simpleInterest=Principal*rate*time/100.0;
        double totalAmount=Principal+simpleInterest;
        double bmi=(double)Weight/(height*height);
        double percentage=totalMarks*100.0/500;
        
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);

    }
}