package lists;

public class CharList {

	public static void main(String[] args) {

		System.out.println(isValid( //true
				new char[] {'n','s','n','s','n','s','n','s','n','s'}));

		System.out.println(isValid( //false, ,short
				new char[] {'n','s','n','s','n','s','n','s'}));

		System.out.println(isValid( //false, not returned
				new char[] {'n','s','n','s','n','s','n','s','w','w'}));
	}

	public static boolean isValid(char[] walk) {
		if(walk.length!=10){
			return false;
		}

		int numN = 0, numS=0, numE=0, numW=0;

		for(char e:walk) {
			if (e=='n') {
				numN++;
			}
			if (e=='s') {
				numS++;
			}
			if (e=='e') {
				numE++;
			}
			if (e=='w') {
				numW++;
			}
		}

		if(numN!=numS){
			return false;
		}
		if(numE!=numW){
			return false;
		}
		return true;
	}
}
