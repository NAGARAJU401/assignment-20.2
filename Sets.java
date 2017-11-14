package set;
import java.util.HashSet;
import java.util.Set;
public class Sets {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		Set set1=new HashSet();
		//As it implements the Set Interface, duplicate values are not allowed.
		//Objects that you insert in HashSet are not guaranteed to be inserted
		//in same order. Objects are inserted based on their hash code. 
		//NULL elements are allowed in HashSet. HashSet also implements 
		//Serializable and Cloneable interfaces.
		//creating the object
				set1.add("nag");//add the values
				set1.add("ravi");
				set1.add("Rajdeep");
				set1.add("Ramesh");
				
				Set set2=new HashSet();
				//creating the objects
				set2.add("Goswami");//adding the values
				set2.add("prasi");
				set2.add("Sravan");
				set2.add("Kumar");
				
				System.out.println("Set1 elements:"+set1);//print set1
				System.out.println("Set2 elements:"+set2);//print set2
				set1.addAll(set2);//add all the values of set2 to set1
				System.out.println("After adding set2 elements into set1:");
				System.out.println(set1);//print set1
				//system is final class
			      //out is a static member of system class and type printStream
			      //println is method of printStream class.ln means nextline

			    
	}

}
