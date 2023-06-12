package org.arrayrevision;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
	
			int c[]= {10,20,30};
			System.out.println("integer1 is :" +c[1] );
				
			
	
			int a1;
		
			
				
				int a[]=new int[2];
				
				a[0] = 100;
				a[1] = 200;
				
				System.out.println("integer2 is :" +a[1]);
				
				System.out.println("\nnormal for loop");
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}
				
				System.out.println("\nenchanced loop");
			for (int x : c) {
				
				
				System.out.println(x);
			}	
			
			String d[] = new String[2];
			
			d[0]="Dinesh";
			System.out.println("\n"+d[1]);
			
			String e[]= {"D","I","N","E","S","H"};
			System.out.println(e[4]);

			
			System.out.println("\nlength of c:" +c.length);
			System.out.println("length of a:" +a.length);
}
				
		
	}
		
	

