package Packagez;

import PackageA.*;

public class Classz extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ca=new ClassA();
		Classz z1=new Classz();
		// ClassB ca1=new ClassB(); //Object of ClassB can not be created as its default
		//System.out.println(ca.privatevar);  //private variables can't be accessed from different package
		//System.out.println(ca.protectedvar);//protected variables can't be accessed from different package
		System.out.println(z1.protectedvar);   //protected variables can be accessed using inheritance
		System.out.println(ca.publicvar);
		//System.out.println(ca.defaultvar);   //default variables can't be accessed from different package
		//ca.y(); //private methods can't be accessed from different package
		//ca.z(); //protected methods can't be accessed from different package
		z1.z(); //protected methods can be accessed from different package using inheritance
		ca.x();
		//ca.w();  //default methods can't be accessed from different class
		//ca1.nonpublicclass(); //Since classB is default, so we can't call methods from that class if package is different

	}

}
