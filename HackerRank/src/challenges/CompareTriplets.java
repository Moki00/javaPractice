package challenges;

import java.util.List;

public class CompareTriplets {

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int pointsAlice = ((a.get(0) > b.get(0)) ? 1 : 0) + ((a.get(1) > b.get(1)) ? 1 : 0) + ((a.get(2) > b.get(2)) ? 1 : 0);
		int pointsBob = ((a.get(0) < b.get(0)) ? 1 : 0) + ((a.get(1) < b.get(1)) ? 1 : 0) + ((a.get(2) < b.get(2)) ? 1 : 0);
		return List.of(pointsAlice, pointsBob);
	}
}

//return pointsAlice + " " + pointsBob;
//System.out.println(pointsAlice + " " + pointsBob);