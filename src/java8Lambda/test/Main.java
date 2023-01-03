package java8Lambda.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static <T> void main(String[] args) {

		/*
		 * Set<String> set = new TreeSet<>(new Comparator<String>() { public int
		 * compare(String o1, String o2) { return o1.length() - o2.length(); } });
		 * 
		 * System.out.println(set);
		 */
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();
		Book b5 = new Book();
		Book b6 = new Book();
		
		b1.setName("test1");
		b1.setRating(1);
		
		b2.setName("test12");
		b2.setRating(2);
		
		b3.setName("test123");
		b3.setRating(3);
		
		b4.setName("test1234");
		b4.setRating(4);
		
		
		b5.setName("test12345");
		b5.setRating(5);
		
		b6.setName("test123456");
		b6.setRating(6);
		
		
       List<Book> booksList = new ArrayList<>();
       booksList.add(b2);
       booksList.add(b1);
       booksList.add(b4);
       booksList.add(b3);
       booksList.add(b6);
       booksList.add(b5);
       
      booksList.forEach((b)->{System.out.println("book name is : "+ b.getName() + " and rating is : "+b.getRating());});
      
      List<Book>filterdList=booksList.parallelStream().filter((b)-> b.getRating()>=2).collect(Collectors.toList());
      System.out.println("***************************** filterd *********************************");
      filterdList.forEach((b)->{System.out.println("book name is : "+ b.getName() + " and rating is : "+b.getRating());});
	
      
      System.out.println("**************************** sorted **********************************");

     // booksList.stream().sorted();
      
      booksList.forEach((b)->{System.out.println("book name is : "+ b.getName() + " and rating is : "+b.getRating());});

      

	}

	
}
