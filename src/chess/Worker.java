package chess;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Worker {
	private FileOutputStream file;
	private OutputStreamWriter output;
	private BufferedWriter buffer;

	public Worker(String fileName) throws FileNotFoundException  {
		this.file = new FileOutputStream(fileName);
		this.output = new OutputStreamWriter(this.file);
		this.buffer = new BufferedWriter(this.output);
	}

	public boolean process(String[] lines) {
		try {
			this.write(lines);
			this.close();
		} catch (IOException e) {
			return false;
		}

		return true;
	}

	private void write(String[] lines) throws IOException {
		for (String line : lines) {
			this.buffer.write(line);
			this.buffer.newLine();
		}
	}

	private void close() throws IOException {
		this.buffer.close();
	}

}
