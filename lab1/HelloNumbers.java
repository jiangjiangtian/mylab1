public class HelloNumbers {
    public static void main(String[] args)
    {
        int x = 0;
        int i;
        int sum;
        while(x<10){
            sum = 0;
            for(i = 0;i <= x; i++)
            {
                sum = sum + i;
            }
            System.out.print(sum + " ");
            x++;
        }
    }
}
