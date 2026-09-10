
public class StringBuilder2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append("Program");
        System.out.println(sb);
    }
}
