import java.io.*;
import java.nio.file.*;

public class FilesDemo {
	public static void main(String args[]){
		Path path = Paths.get(System.getProperty("user.home"), "sampledir");
		File file = path.toFile();
		System.out.println(file.exists() && file.isDirectory() ? "true" : "false");
		System.out.println(file.exists() && file.isFile() ? "true" : "false");
		try{
			Files.createDirectory(path);
			System.out.print(path.toString() + " を作成しました");
		}catch(FileAlreadyExistsException e){
			System.out.println(path.toString() + " が存在します");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
