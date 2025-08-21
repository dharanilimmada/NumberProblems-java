import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sq = num * num;
        String n = String.valueOf(num);
        String s = String.valueOf(sq);
        if (s.endsWith(n)) {
            System.out.println(num + " Automorphic number ");
        } else {
            System.out.println(num + " Not an Automorphic number ");
        }
        sc.close();
    }
}
