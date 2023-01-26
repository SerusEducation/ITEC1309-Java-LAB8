package order1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			boolean isExit = false;
			do {
			
				System.out.print("Enter OEM factory for create: ");
				Scanner sc = new Scanner(System.in);
				String className = sc.nextLine();
				
				if(className.equals("exit")) {
					isExit = true;
				}else {
					className = "order1."+className;
					
					Class<?> c = Class.forName(className);
					OEMFactory oemFactory = (OEMFactory)c.newInstance();
					
					Factory factory = new Factory(oemFactory);
					factory.getProductType();
				}
			
			}while(!isExit);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
