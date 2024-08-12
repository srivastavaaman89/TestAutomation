package PackageA;

class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		// System.out.println(ca.privatevar); //private variables can't be accessed from same package different class
		// different class
		System.out.println(ca.protectedvar);
		System.out.println(ca.publicvar);
		System.out.println(ca.defaultvar);
		// System.out.println(ca.privatevar); //private variables can't be accessed from same package subclass
		System.out.println(ca.protectedvar); //protected variables can be accessed from same package subclass
		System.out.println(ca.publicvar);
		System.out.println(ca.defaultvar);//default variables can be accessed from same package subclass
		// different class
		System.out.println(ca.protectedvar);
		System.out.println(ca.publicvar);
		System.out.println(ca.defaultvar);
		// ca.y(); //private methods can't be accessed from different class
		ca.z();   //protected methods can be accessed from same package subclass
		ca.x();
		ca.w();   //default methods can be accessed from same package subclass
		cb.x();
		//cb.y();private methods can't be accessed from same package subclass
		cb.z();
		cb.w();

	}

	public void nonpublicclass() {

	}

}
