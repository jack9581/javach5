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
			System.out.println("��Ƥw�g�g�J�ɮ�");
		}	catch(IOException e)
		{
			System.out.println("��J��X���~");
		}

	}

}
