public class AngleBrackets {


    public static void main(String[] args) {
        String angles = "<<>>>>><<<>>";

        System.out.println(solution(angles));


    }

    public static String solution(String angles) {

        if (angles.length() == 0) {
            return "";
        }

        int center = 0;
        String result = "";

        for (int i = 0; i < angles.length(); i++) {
            if (angles.charAt(i) == '<') {
                center--;
            }
            if (angles.charAt(i) == '>') {
                center++;
            }
        }
        System.out.println(center + " direction");

        while (center > 0) {
            result += "<";
            center--;
        }
        System.out.println(result + " add left");

        if (angles.charAt(0) == '>' && result.isEmpty()) {
            result += "<";
            result += angles;
            center--;
        } else {
            result += angles;
        }

        System.out.println(result + " input main string");

        if (angles.charAt(angles.length() - 1) == '<') {
            result += ">";
            center++;
        }
        while (center < 0) {
            result += ">";
            center++;
        }

        System.out.println(center);

        return result;

    }

}