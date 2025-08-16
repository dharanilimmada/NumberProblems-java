1. Print numbers from 1 to 10
public class Numbers {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) System.out.print(i+" ");
    }
}

2. Print even numbers between 1 and 50
public class EvenNumbers {
    public static void main(String[] args) {
        for(int i=2;i<=50;i+=2) System.out.print(i+" ");
    }
}

3. Print odd numbers from 1 to 30
public class OddNumbers {
    public static void main(String[] args) {
        for(int i=1;i<=30;i+=2) System.out.print(i+" ");
    }
}

4. Print table of 5
public class Table {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=10;i++) System.out.println(n+" x "+i+" = "+(n*i));
    }
}

5. Print numbers from 10 to 1 in reverse
public class Reverse10to1 {
    public static void main(String[] args) {
        for(int i=10;i>=1;i--) System.out.print(i+" ");
    }
}

6. Print first 10 natural numbers
public class NaturalNumbers {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) System.out.print(i+" ");
    }
}

7. Find sum of first 20 natural numbers
public class Sum {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=20;i++) sum+=i;
        System.out.println(sum);
    }
}

8. Find factorial of a number
public class Factorial {
    public static void main(String[] args) {
        int n=5,f=1;
        for(int i=1;i<=n;i++) f*=i;
        System.out.println(f);
    }
}

9. Find sum of even numbers up to N
public class SumEven {
    public static void main(String[] args) {
        int N=10,sum=0;
        for(int i=2;i<=N;i+=2) sum+=i;
        System.out.println(sum);
    }
}

10. Count digits in a number
public class CountDigits {
    public static void main(String[] args) {
        int n=12345,count=0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}