public class Binary {

    /*
    * we count like this 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
    * binary looks like this 128, 64, 32, 16, 8, 4, 2, 1
    *
    * */
    public static void main(String[] args) {

        // example number to change
        int number = 129;

        int lengthOfBinary=0;
        int remainder=0;
        int max=0;

        // find the largest binary and work down
        for (int i = 1; i <= number; i+=i) {
            lengthOfBinary++;
            max=i;
            remainder = number-max;
        }

        // create an array of character for binary
        char[] charArr = new char[lengthOfBinary];
        charArr[0]='1'; // 10000000 == 128
        max/=2; //64

        // loop the binary by length
        for (int i = 1; i < lengthOfBinary; i++) {
            if (remainder>=max){
                charArr[i]='1';
                remainder-=max;
            } else {
                charArr[i]='0';
            }
            max/=2;
        }

        // see binary character array
        for (char e:charArr
             ) {
            System.out.print(e);
        }
    }
}
