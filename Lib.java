package library;

public class Lib
{
	  private boolean fullFormat = false; // ДЛЯ МЕТОДА №9  ФОРМАТ
	  public Book[] books; // С МАССИВОМ РАБОТАЕМ ЧЕРЕЗ НАШЫ МЕТОДЫ
	  
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
	  
	  
	  //МЕТОД № 2 ПРОСМОТР, который выводит инфо о книгах в библиотеке
	  
	  public void printAllBooks(){
				 
		 if (fullFormat==false){printInfo(0);}else{printInfo(1);}
	  }
	  
	  // ПОМОЩНИК МЕТОДА ПРОСМОТР, который выводит инфо о книгах в библиотеке  0--краткий формат; 1--полный формат
	  private void printInfo(int printFormat){
		  int counter=1;// СЧЕТЧИК ДЛЯ ГЛАВ (ДЕЛАЕТ НОМЕРАЦИЮ ГЛАВ)
		 
		  switch(printFormat){
		  
		  case 0:
			  for(int i=0; i<books.length; i++){
				  if(books[i]!=null){
					  System.out.println(" НАЗВАНИЕ КНИГИ : "+books[i].getName()+
							             " || ГОД КНИГИ : "+books[i].getYear()+
							             " || АВТОР КНИГИ : "+books[i].getAuthor());
				  }
			  }
			  break;
		 
		  
		  case 1:
			  for(int i=0; i<books.length; i++){
					 if(books[i]!=null){
						  System.out.println(" НАЗВАНИЕ КНИГИ : "+books[i].getName()+
								             " || ГОД КНИГИ : "+books[i].getYear()+
								             " || АВТОР КНИГИ : "+books[i].getAuthor());
						  System.out.println(" СОДЕРЖАНИЕ КНИГИ :");
						  
						  if(books[i].getChapters()!=null){
						  for(String item :books[i].getChapters()){
								System.out.println((counter++)+"."+item);
							}
						  
					 }else{System.out.println("В КНИГЕ НЕТ СОДЕРЖАНИЯ ГЛАВ");
						   System.out.println();
						  }
						  
					  }else{break;}
				  }
			  break;
		  }
	  }
	  //---------------------------------------------------------------
	  
	   // МЕТОД №9 ФОРМАТ, можно и на булевский вариант переделать , int bookFormat  можно поменять на boolean bookFormat 
	   // зависит от кода класса main
	  public void format(int bookFormat){
		  fullFormat = (bookFormat==0)? false:true;
		  
	  }
	  
	  //---------------------------------------------------------------
	  
}

