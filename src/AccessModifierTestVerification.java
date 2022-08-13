
public class AccessModifierTestVerification {
	
	
	public static void main(String[] args) {
		AccessModifiersTest testObject =new AccessModifiersTest();
		testObject.setWeight(75);
		System.out.println(testObject.getWeight());
		testObject.adress="CK House Hospital Hill";
		testObject.age=23;
		System.out.println(testObject.adress);
		System.out.println(testObject.age);
				

	}
	

}
