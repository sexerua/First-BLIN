package library;

public class Lib
{
	  public Book[] books;   // я люяяхбнл пюанрюел вепег мюьш лерндш
	  
	  public Lib (int librarySize){
		  this.books = new Book[librarySize];
	  }
	  
	  
	  // аюгнбши лернд днаюбхрэ ймхцс б ахакхнрейс
	  public void addBook (String bookName){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName);
				  break;
			  }
		  }
		  System.out.println("ймхцю "+bookName+" сяоеьмн днаюбкемю б ахакхнрейс");
	  }
	  
	  // оепецпсгйю аюгнбнцн лерндю днаюбхрэ ймхцс б ахакхнрейс
	  public void addBook (String bookName, int bookYear){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear);
				  break;
			  }
		  }
		  System.out.println("ймхцю "+bookName+" сяоеьмн днаюбкемю б ахакхнрейс");
	  }
	  
	  // оепецпсгйю аюгнбнцн лерндю днаюбхрэ ймхцс б ахакхнрейс
	  public void addBook (String bookName, int bookYear, String bookAuthor){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear,bookAuthor);
				  break;
			  }
		  }
		  System.out.println("ймхцю "+bookName+" сяоеьмн днаюбкемю б ахакхнрейс");
	  }
	  
	  //оепецпсгйю аюгнбнцн лерндю днаюбхрэ ймхцс б ахакхнрейс
	  public void addBook (String bookName, int bookYear, String bookAuthor, String...bookChapters){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear,bookAuthor,bookChapters);
				  break;
			  }
		  }
		  System.out.println("ймхцю "+bookName+" сяоеьмн днаюбкемю б ахакхнрейс");
	  }
}
