public class StringTest {
    public static void main(String[] args) {
        System.out.println(reverse("  ustax"));
        System.out.println(reverse("ABCd"));
    }

    public static String reverse(String s) {
        if (s != null) {
            return new StringBuilder(s).reverse().toString();
        }
        return null;
    }
}