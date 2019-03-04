import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3 {
	/* 
	 * 2. The five objects that are created in this main class are the 3
	 * dogs, the list(dogs) and the comparator 
	 * 
	 * 3. The comarator constructir call is the line that is 
	 * 			Collections.sort(dogs, new Comparator<Animal>(){
	 * the class defintion for the compareator is int he Comparator<> imterface
	 */
	
	public static void main(String[] args){
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>(){
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
	}
}