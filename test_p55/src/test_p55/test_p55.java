package test_p55;
public class test_p55 {
	public static void main(String[] args) {
		company cmp =new company();
		driver drv1=new driver(cmp);
		drv1.start();
		driver drv2=new driver(cmp);
		drv2.start();
		}
	    static class company
	    {
	    	private int sum=0;
	    	public synchronized void add (int a) {
	    		int tmp=sum;
	    		System.out.println("�ثe���X�p���B�O"+tmp+"��");
	    		System.out.println("�Ȩ�F"+a+"��");
	    		tmp=tmp+a;
	    		System.out.println("�X�p���B�O"+tmp+"��");
	    		sum=tmp;
	    	}
	    }
	    static class driver extends Thread
	    {
	    	private company comp;
	    	public driver(company c) {
	    		comp =c;
	    	}
	    	public void run()
	    	{
	    		for(int i=0;i<3;i++)
				{
	    			comp.add(50);
				}
	    	}
	    }
}
