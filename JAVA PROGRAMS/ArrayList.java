import java.util.*;
import java.io.*;
public class ArrayList
{
	public static void main(String[]args)
	{
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);
		Collection.reverse(l);
		System.out.println(l);
	}
}
