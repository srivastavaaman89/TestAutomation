package PackageA;

import Learningjava.Methods;

public class ClassA {
	public int publicvar=5;
	private int privatevar=6;
	protected int protectedvar=7;
	int defaultvar=8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ca=new ClassA();
		ClassB ca1=new ClassB();
		System.out.println(ca.privatevar);
		System.out.println(ca.protectedvar);
		ca.y();
		ca.z();
		ca1.nonpublicclass(); //Inside same package, we can call methods from default class
		}
	public void x() {
		System.out.println("Public Method");
	}
	private void y() {
		System.out.println("Private Method");
	}
	protected void z() {
		System.out.println("Protected Method");
	}
	void w() {
		System.out.println("Default Method");
	}
	}


