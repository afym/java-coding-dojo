package test;


import org.junit.Test;

import chess.Table;
import chess.Worker;
import chess.Point;

public class ChessTest {

	@Test
	public void createChess1() {
		try {
			Worker worker = new Worker("D:/chess2.txt");
			Point point = new Point();
			Table table = new Table(worker, point);
			table.setDimension(10);
			boolean created = table.create();
			System.out.println(created ? "Table was created correctly" : "Table can not be created");
		}catch(Exception e){
			System.out.println("An exception was detected in : " + e.getMessage());
			System.out.println(e.getClass());
		}
	}
}
