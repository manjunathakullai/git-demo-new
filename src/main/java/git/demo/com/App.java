package git.demo.com;

public class App {
	
	
	public void addData(String str) {
		
		System.out.println(str);
		
		if(str.equals(Constant.DATA_TYPE)) {
			System.out.println("welcome to git");
		}
	}
	public static void main(String[] args) {
		
		
		System.out.println("this is an main method");
		
		App app=new App();
		app.addData("this is an git demo of method ");
	}
	

}
