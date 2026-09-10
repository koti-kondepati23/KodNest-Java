
public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb);

        sb.append("Program");
        System.out.println(sb);

        sb.insert(0, "Maths");
        System.out.println(sb);

        sb.setCharAt(8, 'k');
        System.out.println(sb);

        sb.deleteCharAt(8);
        System.out.println(sb);

        sb.delete(4, 9);
        System.out.println(sb);

        sb.replace(3, 8, "KOti");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }

}
