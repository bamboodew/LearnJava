public class Program
{
    public static void main(String[] args) {
        int m = 2;
        int d = 0;
        int y = 2012;
        //you can alter tha date above to calaculate number of days in month
        // dont change the number of days d=0
        if(m == 4 || m == 6 || m == 9 || m==11){
            d = 30;
        }else if(m == 2){
            d = 28;
        }else{
            d = 31;
        }
        if(m == 2 && ((y %4 == 0 && y %100 !=0) || (y % 100 == 0 && y % 400 == 0))){
            d = 29;
        }
        System.out.println("In "+y+", the month "+m+" has "+d+" days");

    }
}
