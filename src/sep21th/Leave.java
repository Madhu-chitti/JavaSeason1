package sep21th;

public class Leave extends Marks {
	
	int s1,c1;
	
	public void setLeave(int s1, int c1)
	{
		this.s1=s1;
		this.c1=c1;
	}
	
	public void getLeaves()
	{
		System.out.println("Total no of leaves taken" +(s1+c1));
	}
}
