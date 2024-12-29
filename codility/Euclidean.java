public class Euclidean {
    public int circleOfChoco(int numOfChoco, int skip) {
        
        // how many unique chocos eaten?
        return numOfChoco / gcd(numOfChoco,skip);

    }

    // Euclidean Algorithm of finding GCD=greatest common divisor
    private int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    /* 
This is an less efficient solution that uses a loop to simulate the process of eating chocolates.
       how many unique chocos eaten?
        int numEaten = 0;

        are they eaten? all false at first
        boolean[] eaten = new boolean[numOfChoco];

        where i am now
        int currentChocoPos = 0;

        how many to skip
        skip = skip % numOfChoco; // to handle cases where skip >= numOfChoco
        if skip is 0, we can eat all chocos
        if (skip == 0) {
            return numOfChoco;
        }
        we can eat chocos in a circular manner, so we can use modulo
        to wrap around the array of chocolates  
        loop until we have eaten all unique chocos
        while(true){
            if (eaten[currentChocoPos]){
                break;
            } else {
                eaten[currentChocoPos]=true;
                numEaten++;
                currentChocoPos=(currentChocoPos+skip)%numOfChoco;
            }
        }
        return numEaten; */


}