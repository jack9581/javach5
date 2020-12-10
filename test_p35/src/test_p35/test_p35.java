package test_p35;
import java.io.*;
public class test_p35 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("test1.txt");
			PrintWriter pw=new PrintWriter(new BufferedWriter(fw));
			pw.println("Hellow");
			pw.println("goobye");
			pw.close();
			System.out.println("資料已經寫入檔案");
		}	catch(IOException e)
		{
			System.out.println("輸入輸出有誤");
		}

	}

}
