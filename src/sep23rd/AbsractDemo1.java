package sep23rd;

public class AbsractDemo1 {

	public static void main(String[] args) {
	//  new Numbers();
		
			Numbers obj= new Addition();
			
			obj.compute(20, 10);
			obj.greet();
			
			Numbers obj2=new Subtraction();
			
			obj2.compute(20, 10);
			
			obj2.greet();
			
			obj2.bye();

	}

}
