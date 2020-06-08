import java.util.Stack;

public class StringTest {
    public static void main(String[] args) {
        System.out.println(reverse("  ustax"));
        System.out.println(reverse("ABCd"));
        System.out.println(reverse2("ABCd"));
    }

    public static String reverse(String s) {
        if (s != null) {
            return new StringBuilder(s).reverse().toString();
        }
        return null;
    }

    public static String reverse2(String s) {
        if (s != null) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                stack.push(s.charAt(i));
            }
            StringBuilder stringBuilder = new StringBuilder();
            while (!stack.empty()) {
                stringBuilder.append(stack.pop());
            }
            return stringBuilder.toString();
        }
        return null;
    }
    /**
     * xatsu
     * dCBA
     * dCBA
     *
     * Process finished with exit code 0
     * */
}