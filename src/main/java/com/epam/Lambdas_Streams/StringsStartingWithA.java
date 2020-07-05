package com.epam.Lambdas_Streams;
import java.util.*;
import java.util.stream.Collectors;
public class StringsStartingWithA{
        static void   check(List<String> l){
           
          List<String> result=l.stream() 
                        .filter(s->s.startsWith("a"))
                        .filter(s->s.length()==3)
                        .collect(Collectors.toList());
         System.out.print("List of Strings having exactly 3 letters and starting with a: "+result);
       }
    
     public static void main(String []args){
    	 List<String> list=new ArrayList<String>();
 		list.add("any");
 		list.add("hello");
 		list.add("remote");
 		list.add("ant");
 		list.add("an");
 		list.add("ancient");
 		list.add("pencil");
 		System.out.println("Original list: "+list);
        check(list);
     }
}