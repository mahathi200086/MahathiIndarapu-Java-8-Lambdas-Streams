package com.epam.Lambdas_Streams;
import java.util.*;
import java.util.stream.IntStream;
interface Hello{
	void is(List<String> l);
}
public class Palindrome{
	public static void check(List<String> l) {
		boolean isPalindrome;
		List<String> finallist=new ArrayList<String>();
		for(int k=0;k<l.size();k++) {
			String g=l.get(k);
			isPalindrome=IntStream
					.range(0,g.length()/2)
					.noneMatch(i->g.charAt(i)!=g
					.charAt(g.length()-i-1));
			if(isPalindrome) {
				finallist.add(g);
			}
		}
		System.out.println("Palindromes from the given list are:"+finallist);
		
	}
	public static void main(String []args) {
		List<String> list=new ArrayList<String>();
		list.add("mom");
		list.add("dad");
		list.add("book");
		list.add("pen");
		list.add("radar");
		list.add("rotator");
		list.add("chair");
		System.out.println("Original list:"+list);
		Hello h=Palindrome::check;
		h.is(list);
		
		
	}
}

