package test_p36;
import java.io.*;
public class test_p36 {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("test1.txt"));
			String str=br.readLine();
			String str2=br.readLine();
			System.out.println("�g�J���ɮפ�����Ӧr��O");
			System.out.println(str);
			System.out.println(str2);
		}
		catch(IOException e)
		{
			System.out.println("��J��X���~");
		}
	}

}
