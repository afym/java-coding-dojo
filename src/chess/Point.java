package chess;

/**
 * Represents the symbol in the table
 * @author afym
 */
public class Point {
	private char symbol;

	public Point() {
		this.symbol = '*';
	}

	/**
	 * Get the current symbol of the point.
	 * @return char symbol
	 */
	public char getSymbol() {
		return symbol;
	}

	/**
	 * Set a new symbol.
	 */
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}
