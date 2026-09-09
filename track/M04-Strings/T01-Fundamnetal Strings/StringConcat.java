
public class StringConcat {

    public static void main(String[] args) {
        String s1 = "Anil";
        String s2 = "Kumar";
        String res1 = s1 + s2;
        System.out.println(res1);

        String s3 = new String("koti");
        String s4 = new String("kumar");
        String res2 = s3.concat(s4);
        System.out.println(res2);
    }
}
