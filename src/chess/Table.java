package chess;

import chess.Point;
import chess.Worker;

/**
 * Represents the table
 * @author afym
 */
public class Table {
	private Worker worker;
	private int dimension;
	private int lineLenght;
	private int pointLenght;
	private char pointSymbol;

	public Table(Worker worker, Point point) {
		this.worker = worker;
		this.pointLenght = 4;
		this.dimension = 8;
		this.pointSymbol = point.getSymbol();
		this.setLineLength();
	}

	public void setPointLenght(int pointLength) {
		this.pointLenght = pointLength;
		this.setLineLength();
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean create() {
		String[] lines = this.getTableStructure();
		return this.worker.process(lines);
	}

	private void setLineLength() {
		this.lineLenght = this.dimension * this.pointLenght;
	}

	private String[] getTableStructure() {
		String[] lines = new String[this.lineLenght];
		String blackBlock = this.getLineByStart('b');
		String whiteBlock = this.getLineByStart('w');
		int counter = 1;

		for (int index = 0; index < this.lineLenght; index++) {
			lines[index] = counter % 2 != 0 ? blackBlock : whiteBlock;

			if ((index + 1) % 4 == 0) {
				counter++;
			}
		}

		return lines;
	}

	private String getLineByStart(char start) {
		StringBuffer line = new StringBuffer();
		char beginSymbol = start == 'b' ? this.pointSymbol : ' ';
		char endSymbol = start == 'w' ? this.pointSymbol : ' ';
		String begin = new String(this.getPointsBySymbol(beginSymbol));
		String end = new String(this.getPointsBySymbol(endSymbol));

		for (int index = 1; index <= this.dimension; index++) {
			if (index % 2 != 0) {
				line.append(begin);
			} else {
				line.append(end);
			}
		}

		return line.toString();
	}

	private char[] getPointsBySymbol(char symbol) {
		char[] points = this.getPoints();

		for (int index = 0; index < points.length; index++) {
			points[index] = symbol;
		}

		return points;
	}

	private char[] getPoints() {
		return new char[this.pointLenght];
	}
}
