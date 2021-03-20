package main;

public class SingletonMain {

	public static void main(String[] args) {
		DBConn dBConn = DBConn.getInstance();
		System.out.println(dBConn.getClass());
	}
	
}