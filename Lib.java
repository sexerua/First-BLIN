package library;

public class Lib
{
	  private Book[] books; // С МАССИВОМ РАБОТАЕМ ЧЕРЕЗ НАШЫ МЕТОДЫ
	  
	  public Lib (int librarySize){
		  this.books = new Book[librarySize];
	  }
	  
	  // ДАЛЕЕ ВСТАВЛЯЙТЕ СВОИ МЕТОДЫ И ПРОБУЙТЕ ЗАПУСТИТЬ СВОЙ МЕТОД ЧЕРЕЗ Main СОЗДАВ ЭКЗЕМПЛЯР КЛАССА Lib
	  
	  
	  
	  
	  
	  // БАЗОВЫЙ МЕТОД ДОБАВИТЬ КНИГУ В БИБЛИОТЕКУ
	  public void addBook (String bookName){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName);
				  break;
			  }
		  }
		  System.out.println("КНИГА "+bookName+" УСПЕШНО ДОБАВЛЕНА В БИБЛИОТЕКУ");
	  }
	  
	  // ПЕРЕГРУЗКА БАЗОВОГО МЕТОДА ДОБАВИТЬ КНИГУ В БИБЛИОТЕКУ
	  public void addBook (String bookName, int bookYear){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear);
				  break;
			  }
		  }
		  System.out.println("КНИГА "+bookName+" УСПЕШНО ДОБАВЛЕНА В БИБЛИОТЕКУ");
	  }
	  
	  // ПЕРЕГРУЗКА БАЗОВОГО МЕТОДА ДОБАВИТЬ КНИГУ В БИБЛИОТЕКУ
	  public void addBook (String bookName, int bookYear, String bookAuthor){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear,bookAuthor);
				  break;
			  }
		  }
		  System.out.println("КНИГА "+bookName+" УСПЕШНО ДОБАВЛЕНА В БИБЛИОТЕКУ");
	  }
	  
	  //ПЕРЕГРУЗКА БАЗОВОГО МЕТОДА ДОБАВИТЬ КНИГУ В БИБЛИОТЕКУ
	  public void addBook (String bookName, int bookYear, String bookAuthor, String...bookChapters){
		  for(int i=0; i<books.length; i++){
			  if(books[i]==null){
				  books[i] = new Book(bookName,bookYear,bookAuthor,bookChapters);
				  break;
			  }
		  }
		  System.out.println("КНИГА "+bookName+" УСПЕШНО ДОБАВЛЕНА В БИБЛИОТЕКУ");
	  }
}

