import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCountDemo {
	public static void main(String args[]) {
		if (args.length < 1) {
			return;
		}
		int x, letterCount = 0, lineCount = 1;
		try (FileReader fw = new FileReader(new File(args[0]))) {
			while ((x = fw.read()) != -1) {
				if ((char) x == '\n') {
					lineCount++;
				} else {
					letterCount++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.printf("行数: %d行\n文字数: %d文字\n", lineCount, letterCount);

	}
}
