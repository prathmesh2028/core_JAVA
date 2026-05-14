package StringInJava.StringBuffer;

public class StringBuffr {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("PRATHMESH");
        System.out.println(sb.capacity());
        sb.append(" BADHE");
        System.out.println(sb);

        sb.deleteCharAt(0);
        sb.insert(0,"Java");
        sb.ensureCapacity(100);
        sb.setLength(100);

        String str = sb.toString();
        System.out.println(str);
    }
}
