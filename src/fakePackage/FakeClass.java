package fakePackage;

import javax.swing.JOptionPane;

public class FakeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		for(int i = 99; i >= 0; i--){
			System.out.println("\n===================================================");
			System.out.println(i + " bottles of beer on the wall,");
			System.out.println(i + " bottles of beer.");
			System.out.println("If one of those bottles should happen to fall,");
			System.out.println(i - 1 + " bottles of beer on the wall.");
			System.out.println("===================================================");
		}
		
		JOptionPane.showMessageDialog(null, "This project is better than nails in my eyes!");
	}

}
