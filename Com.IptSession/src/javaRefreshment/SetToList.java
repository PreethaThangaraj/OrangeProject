package javaRefreshment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
	//create the set of string value	
		Set<String>s=new HashSet<String>();
s.add("car");
s.add("bike");
s.add("train");
s.add("ship");
s.add("flight");
//create an arraylist
List<String>l=new ArrayList<String>(s.size());
//iterate for set value
for(String x:s)
	l.add(x);
		System.out.println("Set to ArrayList:");
	//iterate for list value
		for(String x :l)
			System.out.println(x);
	}

}
