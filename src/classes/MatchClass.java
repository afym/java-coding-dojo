package classes;

public class MatchClass {

	public String minOutput() {
		int num1 = 1;
		int num2 = 2;

		int min = Math.min(num1, num2);

		return new StringBuffer().append("The min value between ").append(num1)
				.append(" and ").append(num2).append(" is ").append(min)
				.toString();
	}

	public String maxOutput() {
		int num1 = 1;
		int num2 = 2;

		int max = Math.max(num1, num2);

		return new StringBuffer().append("The max value between ").append(num1)
				.append(" and ").append(num2).append(" is ").append(max)
				.toString();
	}

	public String powANumber() {
		double indicator = 2.0d;
		double powResult = Math.pow(indicator, 2.0);

		return new StringBuffer().append(indicator).append(" squared is : ")
				.append(powResult).toString();
	}

	public String squaredRoot() {
		double base = 4d;
		double squared = Math.sqrt(base);

		return new StringBuffer().append(" squared root of ").append(base)
				.append(" is ").append(squared).toString();
	}
}
