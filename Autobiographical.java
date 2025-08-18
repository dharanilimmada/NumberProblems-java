public class Main {
    public static void main(String[] args) {
        String s = "1210";
        int n = s.length();
        int[] cnt = new int[10];
        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            cnt[d]++;
        }
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) - '0' != cnt[i]) {
                ok = false;
                break;
            }
        }
        for (int i = n; i < 10; i++) {
            if (cnt[i] != 0) {
                ok = false;
                break;
            }
        }
        if (ok) System.out.println("Autobiographical");
        else System.out.println("Not Autobiographical");
    }
}
