package test_p50;
public class test_p50 {
	public static void main(String[] args) {
		car car1=new car("1����");
		Thread th1=new Thread(car1);
		th1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
	static  class car implements Runnable
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
				System.out.println("���b�i��"+name+"���B�z�u�@");
			}
		}
		}
}
