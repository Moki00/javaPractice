package challenges;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

//	public static void main(String[] args) {
//
//		double payment = 12324.134;
//
//		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
//
//		String str = "\u20B9";
//
//		String indiaRS = india.replace("\u20B9", "testing");
//
//		System.out.println(indiaRS);
//	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double payment = input.nextDouble();
		input.close();

		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		String indiaRS = india.replace("\u20B9", "Rs.");
		String chinaY = china.replace("\u00A5", "\uFFE5");
		
		System.out.println("US: " + us);
		System.out.println("India: " + indiaRS);
		System.out.println("China: " + chinaY);
		System.out.println("France: " + france);
	}

}

//		india = india.replace("Rs",getResources().getString(R.string.RS));
// 		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
//NumberFormat india = NumberFormat.getIntegerInstance(new Locale("en", "IN"));
//NumberFormat china = NumberFormat.getNumberInstance(Locale.CHINA);
//Locale[] china2 = NumberFormat.getAvailableLocales();
//NumberFormat france = NumberFormat.getNumberInstance(Locale.FRANCE);