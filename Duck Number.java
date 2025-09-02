public class DuckNumber {
    public static void main(String[] args) {
        String num = "1023";
        if (num.charAt(0) == '0') {
            System.out.println("Not a Duck Number");
            return;
        }
        if (num.contains("0")) System.out.println("Duck Number");
        else System.out.println("Not a Duck Number");
    }
}
