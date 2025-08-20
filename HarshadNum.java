class main{
    public static void main(String [] args){
        int num = 156;
        int temp = num;
        int sum = 0;
        while(temp >0){
            sum = sum+(temp%10);
            temp = temp/10;
        }
            if(num % sum == 0){
                System.out.println(" Harshad number");
            }
            else{
                 System.out.println("not a Harshad number");
            }
        
        
        
    }
    
}