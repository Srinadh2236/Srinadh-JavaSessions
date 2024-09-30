package Assignments;

public class Book {

		String title;
		String autor;
		int pageCount;
		//int totalBooks;
		
		
	public static void main(String[] args) {
		//Create three Book objects and initialize their properties with different values.
		int totalBooks=0;
		Book b1=new Book();
		b1.title="The Hobbit";
		b1.autor="J. R. R. Tolkien";
		b1.pageCount=200;
			totalBooks++;
		
		Book b2=new Book();
		b2.title="The Name of the Rose ";
		b2.autor="Umberto Eco";
		b2.pageCount=180;
		totalBooks++;
		
		Book b3=new Book();
		b3.title="A Tale of Two Cities ";
		b3.autor="Charles Dickens";
		b3.pageCount=250;
		totalBooks++;
		
		//Print the details of each book and the total number of books.
		
		System.out.println("Book title:"+b1.title+" , "+"Book autor:"+b1.autor+" , "+"Book pagecount:"+b1.pageCount);
		System.out.println("Book title:"+b2.title+" , "+"Book autor:"+b2.autor+" , "+"Book pagecount:"+b2.pageCount);
		System.out.println("Book title:"+b3.title+" , "+"Book autor:"+b3.autor+" , "+"Book pagecount:"+b3.pageCount);
		
		System.out.println("Totol no of Books count:"+ totalBooks);
		
		//Modify the pageCount attribute of one book and print the updated details.
		System.out.println("Updated page count of book2");
		b2.pageCount=280;
		
		System.out.println("Book title:"+b2.title+" , "+"Book autor:"+b2.autor+" , "+"Book updated pagecount:"+b2.pageCount);
		
		//Create another Book object and update the total number of books.
		Book b4=new Book();
		b4.title="The Little Prince ";
		b4.autor="Antoine de Saint-Exupéry";
		b4.pageCount=290;
		totalBooks++;
		
		//Print the details of the new book and the updated total number of books.
		System.out.println("Book title:"+b1.title+" , "+"Book autor:"+b1.autor+" , "+"Book pagecount:"+b1.pageCount);
		System.out.println("Book title:"+b2.title+" , "+"Book autor:"+b2.autor+" , "+"Book pagecount:"+b2.pageCount);
		System.out.println("Book title:"+b3.title+" , "+"Book autor:"+b3.autor+" , "+"Book pagecount:"+b3.pageCount);
		System.out.println("Book title:"+b4.title+" , "+"Book autor:"+b4.autor+" , "+"Book pagecount:"+b4.pageCount);

		System.out.println("Totol no of Books count:"+ totalBooks);
		
		

		
	}

}
