package library;

public class Lib
{
	  public Book[] books;   // � �������� �������� ����� ���� ������
	  
	  public Lib (int librarySize){
		  this.books = new Book[librarySize];
	  }
	  
	  
	  // ������� ����� �������� ����� � ����������
	  public void addBook (String bookName){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName);
				  break;
			  }
		  }
		  System.out.println("����� "+bookName+" ������� ��������� � ����������");
	  }
	  
	  // ���������� �������� ������ �������� ����� � ����������
	  public void addBook (String bookName, int bookYear){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear);
				  break;
			  }
		  }
		  System.out.println("����� "+bookName+" ������� ��������� � ����������");
	  }
	  
	  // ���������� �������� ������ �������� ����� � ����������
	  public void addBook (String bookName, int bookYear, String bookAuthor){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear,bookAuthor);
				  break;
			  }
		  }
		  System.out.println("����� "+bookName+" ������� ��������� � ����������");
	  }
	  
	  //���������� �������� ������ �������� ����� � ����������
	  public void addBook (String bookName, int bookYear, String bookAuthor, String...bookChapters){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear,bookAuthor,bookChapters);
				  break;
			  }
		  }
		  System.out.println("����� "+bookName+" ������� ��������� � ����������");
	  }
}
