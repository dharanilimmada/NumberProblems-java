1) Reverse a Number
public class ReverseNumber {
    public static void main(String[] args) {
        int n=1234,rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}

2) Number to Word (0–9)
public class NumberToWord {
    public static void main(String[] args) {
        int n=5;
        String[] words={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println(words[n]);
    }
}

3) Automorphic Number
public class Automorphic {
    public static void main(String[] args) {
        int n=25;
        int sq=n*n;
        String s=String.valueOf(sq);
        if(s.endsWith(String.valueOf(n))) System.out.println("Automorphic");
        else System.out.println("Not Automorphic");
    }
}

4) Peterson Number
public class Peterson {
    public static void main(String[] args) {
        int n=145,temp=n,sum=0;
        while(n>0){
            int d=n%10,f=1;
            for(int i=1;i<=d;i++) f*=i;
            sum+=f;
            n/=10;
        }
        if(sum==temp) System.out.println("Peterson");
        else System.out.println("Not Peterson");
    }
}

5) Sunny Number
public class Sunny {
    public static void main(String[] args) {
        int n=8;
        int x=n+1;
        int s=(int)Math.sqrt(x);
        if(s*s==x) System.out.println("Sunny");
        else System.out.println("Not Sunny");
    }
}

6) Tech Number
public class Tech {
    public static void main(String[] args) {
        int n=2025,len=0,temp=n;
        while(temp>0){ len++; temp/=10; }
        if(len%2==0){
            int div=(int)Math.pow(10,len/2);
            int first=n/div;
            int second=n%div;
            int sum=first+second;
            if(sum*sum==n) System.out.println("Tech");
            else System.out.println("Not Tech");
        } else System.out.println("Not Tech");
    }
}

7) Fascinating Number
public class Fascinating {
    public static void main(String[] args) {
        int n=192;
        String s=n+""+(n*2)+(n*3);
        boolean f=true;
        for(char c='1';c<='9';c++){
            if(!s.contains(c+"")) f=false;
        }
        if(f) System.out.println("Fascinating");
        else System.out.println("Not Fascinating");
    }
}

8) Keith Number
public class Keith {
    public static void main(String[] args) {
        int n=197,temp=n;
        String s=String.valueOf(n);
        int d=s.length();
        int[] arr=new int[20];
        for(int i=0;i<d;i++) arr[i]=Integer.parseInt(s.charAt(i)+"");
        int i=d;
        while(true){
            int sum=0;
            for(int j=1;j<=d;j++) sum+=arr[i-j];
            if(sum==n){ System.out.println("Keith"); break; }
            if(sum>n){ System.out.println("Not Keith"); break; }
            arr[i]=sum;
            i++;
        }
    }
}

9) Neon Number
public class Neon {
    public static void main(String[] args) {
        int n=9;
        int sq=n*n,sum=0;
        while(sq>0){
            sum+=sq%10;
            sq/=10;
        }
        if(sum==n) System.out.println("Neon");
        else System.out.println("Not Neon");
    }
}

10) Spy Number
public class Spy {
    public static void main(String[] args) {
        int n=1124,sum=0,prod=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        if(sum==prod) System.out.println("Spy");
        else System.out.println("Not Spy");
    }
}