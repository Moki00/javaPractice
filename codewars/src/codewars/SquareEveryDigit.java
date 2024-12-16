public class SquareEveryDigit {

    public static void main(String args[]){
        System.out.println(squareDigits(9105));
        
        System.out.println(squareDigits(3212)); //9414
    }

    public static int squareDigits(int n) {
    
        String result="";
        
        while(n>0){
            int digit= n%10;
            result=digit*digit+result;
            System.out.print(result+".");
            n/=10;
        }
        if(result.isEmpty()){
            return 0;
        }
        return Integer.parseInt(result);
  }
}