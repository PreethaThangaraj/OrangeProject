package javaRefreshment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FavMovie {

	public static void main(String[] args) {
		MovieName m1=new MovieName("Varisu","Rs.200","15.06.23");
		MovieName m2=new MovieName("PS1","Rs.250","16.06.23");
		MovieName m3=new MovieName("Avator","Rs.300","17.06.23");
		MovieName m4=new MovieName("PS2","Rs.250","18.06.23");
		MovieName m5=new MovieName("Thunivu","Rs.200","19.06.23");
		MovieName m6=new MovieName("Veeran","Rs.180","20.06.23");
		List<MovieName> movlist = new ArrayList<>();
		movlist.add(m1);
		movlist.add(m2);
		movlist.add(m3);
		movlist.add(m4);
        movlist.add(m5);
        movlist.add(m6);
        for(MovieName mn:movlist) {
        System.out.println(mn);
	}
        Set<MovieName> s = new HashSet<>(movlist);
        s.addAll(movlist);
        System.out.println("set value is:" +s);
        
	}
}
