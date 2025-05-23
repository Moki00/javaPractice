public class frogJump {
    public int solution(int X, int Y, int D) {
        // Calculate the distance to cover
        double distance = Y - X;
        // Calculate the number of jumps needed
        return (int) Math.ceil(distance / D);
    }
}
