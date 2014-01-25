package library;

public class Lib
{
	  public Book[] books; // С МАССИВОМ РАБОТАЕМ ЧЕРЕЗ НАШЫ МЕТОДЫ
	  private boolean fullFormat = false; // ДЛЯ МЕТОДА №9  ФОРМАТ
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
	  
	  
	  //---------------------------------------------------------------
	  
	  //Метод № 5  ПОИСК КНИГИ В БИБЛИОТЕКЕ ПО НАЗВАНИЮ
	  public void findBook(String findName){
	  	
	  	int counter = 0;	// Счётчик найденных книг
	  	int chapter = 1;	// Индекс главы
	  	
	  	System.out.println(" РЕЗУЛЬТАТЫ ПОИСКА:");
	  	for (Book item: books){
	  		
	  	 if (item == null) // Если добрались до пустого элемента, то дальше в библиотеке книг нет
	  	  	break;
	  	  // это выражение НЕ ВЕРНО (bookName -- не существует, есть name  возможно надо getName)
	  	 if (item.bookName.toLowerCase().contains(findName.trim().toLowerCase())){
	  	 // -------НАДО ПРОВЕРИТЬ РАБОТОСПОСОБНОСТЬ---------------------
	  	 	counter++;
	  	 	
			System.out.println("--------------- КНИГА № " + counter + ": ---------------");
			
			switch((fullFormat)? 1:0){
		  
		  	case 0:
				        System.out.println(" НАЗВАНИЕ КНИГИ : "+item.getName()+
							             " || ГОД КНИГИ : "+item.getYear()+
							             " || АВТОР КНИГИ : "+item.getAuthor());
				  	
			  
			  		break;
		 
		  	default:
					System.out.println(" НАЗВАНИЕ КНИГИ : "+item.getName()+
							             " || ГОД КНИГИ : "+item.getYear()+
							             " || АВТОР КНИГИ : "+item.getAuthor());
					System.out.println(" СОДЕРЖАНИЕ КНИГИ :");
						  
						  if(item.getChapters()!=null){
						  
						  	for(String chapName :item.getChapters()){
								System.out.println((chapter++)+"."+chapName);
							}
						  
					 	  } 
					 	  else{
					 	  	System.out.println("В КНИГЕ НЕТ СОДЕРЖАНИЯ ГЛАВ");
						  }
					
	
	  		} //switch-case
		System.out.println();	  		
	  	} // if
	      } // for
	  
	    if (counter == 0)
	  	System.out.println("НИЧЕГО НЕ НАЙДЕНО!\n");
	  	
	  }
	  
	  //---------------------------------------------------------------
	  
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

