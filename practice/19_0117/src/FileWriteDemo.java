import java.io.*;

public class FileWriteDemo {
	public static void main(String args[]){
		final String filePath = args[0];
		try(FileWriter fw = new FileWriter(new File(filePath))){
			fw.write("Hello World\nI am Taro\n");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
