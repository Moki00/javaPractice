package simple;

public class TaxAndTip {

	public static void main(String[] args) {

		double meal_cost = 12.00;
		int tip_percent = 20;
		int tax_percent = 8;

		solve(meal_cost, tip_percent, tax_percent);

	}

	public static void solve(double meal_cost, int tip_percent, int tax_percent) {

		double tip = meal_cost / 100 * tip_percent;

		double tax = meal_cost / 100 * tax_percent;

		double total = meal_cost + tip + tax;

		System.out.println(Math.round(total));

	}

}
/*
 * Given the meal price (base cost of a meal), tip percent (the percentage of
 * the meal price being added as tip), and tax percent (the percentage of the
 * meal price being added as tax) for a meal, find and print the meal's total
 * cost. Round the result to the nearest integer.
 */