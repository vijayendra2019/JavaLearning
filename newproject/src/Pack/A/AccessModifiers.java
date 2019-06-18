package Pack.A;

public class AccessModifiers {

	
	 public int publicInt = 10;
	 private float privatefloat = 20;
	 protected String protectedName = "Vijay";
	 long defaultAge = 25;
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers am = new AccessModifiers();
		System.out.println(am.publicInt);
		System.out.println(am.privatefloat);
		System.out.println(am.protectedName);
		System.out.println(am.defaultAge);
	}

}
