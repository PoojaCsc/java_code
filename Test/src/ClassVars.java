
class Human {
	String name;                   // instance var
	String gender;					// instance var
	static int num_of_limbs = 4;    // class var
	
	public Human(String name, String gender) {     // constructor
		this.name= name;
		this.gender = gender;
		
	}

	public static void main(String[] args) {
		Human pooja = new Human("Pooja","Female");
		Human akash = new Human("Akash","Male");
		
		System.out.println(pooja.name);                // accessing instance var
		System.out.println(akash.name);
		System.out.println(Human.num_of_limbs);           // accessing class var using class name
		System.out.println(pooja.num_of_limbs);				// accessing class var using instance(object) name coz it is available to all objects
		System.out.println(akash.num_of_limbs);
		
		

	}

}
