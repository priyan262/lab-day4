class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=8;i++){
            if(i%2==0){
                evensum+=i;
            }else{
                oddsum+=i;
            }
    }
        System.out.println("sum of even numbers="+evensum);
        System.out.println("sum of odd numbers="+oddsum);
        sc.close();
}
}