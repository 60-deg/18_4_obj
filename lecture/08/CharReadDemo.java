import java.io.*;

class CharReadDemo {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java CharReadDemo ファイル");
			System.exit(0);
		}
		String filename = args[0];
		FileReader fr = null;
		try {
			fr = new FileReader(filename);
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println(filename + "がありません");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (fr != null)
					fr.close(); // 必ずメソッド中でcloseする (忘れない)
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}