
interface Animal {
	public int getLegs() ;
}


public class Dog implements Animal{
	String name;
	int numLegs;
	
	Dog(String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
		
	}
	
	public int getLegs() {
		return numLegs;
	}
	
}