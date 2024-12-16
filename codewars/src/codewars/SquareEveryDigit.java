public class SquareEveryDigit {

    public static void main(String args[]){
        System.out.println(squareDigits(9119));
        
    }

    public static int squareDigits(int n) {
    
        String result="";
        
        while(n>0){
            int digit= n%10;
            digit*=digit;
            result=result+digit;
            // System.out.print(result+".");
            n/=10;
        }
        if(result.isEmpty()){
            return 0;
        }
        return Integer.parseInt(result);
  }
}