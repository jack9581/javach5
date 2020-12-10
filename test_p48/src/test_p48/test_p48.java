package test_p48;
public class test_p48 {
	public static void main(String[] args) {
		car car1=new car("1號車");
		car1.start();
			try
			{
				car1.join();
			}catch(InterruptedException e)
			{}
			System.out.println("結束main()的處理工作");
	}
static  class car extends Thread
{
	private String name;
	public car(String nm)
	{
		name=nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
	}
}
