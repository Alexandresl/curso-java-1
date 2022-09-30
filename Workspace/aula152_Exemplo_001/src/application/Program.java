package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Post p1 = new Post(
				LocalDateTime.parse("21/06/2018 13:05:44", dtf), 
				"Traveling to New zealand", 
				"I'm going to visit this wonderful contry!", 
				12);
		
		p1.addComment(new Comment("Have a nice trip"));
		p1.addComment(new Comment("Wow That's awesome!"));
		
		Post p2 = new Post(
				LocalDateTime.parse("28/07/2018 23:14:19", dtf), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		
		p2.addComment(new Comment("Good night"));
		p2.addComment(new Comment("May the force be with you"));
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
