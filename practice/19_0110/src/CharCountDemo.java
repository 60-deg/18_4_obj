import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharCountDemo {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("ファイル名を実行時の引数として1つ指定してください");
			System.exit(0);
		}
		try(FileReader fw = new FileReader(new File(args[0]))){
			int x, count=0;
			while((x = fw.read())!=-1){
				char c = (char) x;
				if (Character.isUpperCase(c)){
					count++;
				}
				System.out.print(c);
			}
			System.out.println("count = " + count);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
