class abc
    {
        public static void main(String arg[]){
        int sum=0;
        //for-loop for numbers 50-250
        for(int i=50;i<251;i++){
            // condition to check if number should be divided by 3 and not divided by 9 
            if(i%5==0){
                //individual number which are selected in loop
                System.out.println(i);
                //adding values of array so that total sum can be calculated
                sum=sum+i;   
            }   
        }
        //final display output for the code 
        System.out.println("the sum of intergers from 50 to 250 that are multiples of 5 \n"+sum);
    }
}
