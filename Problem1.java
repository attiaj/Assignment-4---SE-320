import java.util.LinkedHashSet;

public class Problem1{
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
		
		lhs1.add("George");
		lhs1.add("Jim");
		lhs1.add("John");
		lhs1.add("Blake");
		lhs1.add("Kevin");
		lhs1.add("Michael");
		
		lhs2.add("George");
		lhs2.add("Katie");
		lhs2.add("Kevin");
		lhs2.add("Michelle");
		lhs2.add("Ryan");
		
		setOperations(lhs1, lhs2);
	}
	
	public static void setOperations(LinkedHashSet<String> lhs1, LinkedHashSet<String> lhs2) {
		
		LinkedHashSet<String> unionSet = new LinkedHashSet<>();
		LinkedHashSet<String> diffSet = new LinkedHashSet<>();
		LinkedHashSet<String> intersectionSet = new LinkedHashSet<>();
		
		System.out.println("For the reader's purposes, lhs1 is: " + lhs1 + ", and lhs2 is: " + lhs2 + "\n");
		
		System.out.println("Union of two sets is defined as the set of all elements that are in at least one of the 2 sets:");
		unionSet.addAll(lhs1);															
		unionSet.addAll(lhs2);														//The set property automatically will not add duplicate elements
		System.out.println("Union of lhs1 and lhs2 is: " + unionSet + "\n");
		
		System.out.println("The difference of two sets (A-B) is defined as the set of all elements that are in A but not in B");
		for (String element : lhs1) {
			
			if (!(lhs2.contains(element))) {							//Loop finds all elements in lhs1 but not in lhs2
					
				diffSet.add(element);
			}
		}
		System.out.println("The difference lhs1-lhs2 is: " + diffSet + "\n");
		
		System.out.println("The intersection of two sets is defined as the set of all elements that are present in both sets");
		for (String element : lhs1) {
			
			if (lhs2.contains(element)) {								//Loop finds all elements in lhs1 and lhs2
				
				intersectionSet.add(element);
			}
		}
		System.out.println("The intersection of lhs1 and lhs2 is: " + intersectionSet + "\n");
		
	}
	
	
}