package library;

import java.util.Iterator;

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
	  public void addBook (String bookName, int bookYear, String bookAuthor, String[] bookChapters){
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
	  
	  //Метод № 3 ПРОСМОТР по заданному автору
          
          public void findByAuthor(String findAuthor){
        	  
        	  int counter = 0; 
        	  int chapter = 1;
        	  
        	  System.out.println(" РЕЗУЛЬТАТЫ ПОИСКА:");
              for (Book item: books){
                      
               if (item == null) 		// Если добрались до пустого элемента, то дальше в библиотеке книг нет
                        break;
               if (item.getAuthor().toLowerCase().contains(findAuthor.trim().toLowerCase())){
                   
                   counter++;
                   
                System.out.println("--------------- КНИГА № " + counter + ": ---------------");
                
                switch((fullFormat)? 1:0){
          
                  case 0:
                                System.out.println(" || АВТОР КНИГИ : "+item.getAuthor()+"\n" +
                                		" || НАЗВАНИЕ КНИГИ : "+item.getName()+"\n" +
                                		" || ГОД КНИГИ : "+item.getYear()+"\n"                                		
                                         );
                                  
                  
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
	  
	  //Метод № 5  ПОИСК КНИГИ В БИБЛИОТЕКЕ ПО НАЗВАНИЮ
	  public void findBook(String findName){
	  	
	  	int counter = 0;	// Счётчик найденных книг
	  	int chapter = 1;	// Индекс главы
	  	
	  	System.out.println(" РЕЗУЛЬТАТЫ ПОИСКА:");
	  	for (Book item: books){ // Цикл по всем книгам в библиотеке
	  		
	  	 if (item == null) // Если добрались до пустого элемента, то дальше в библиотеке книг нет
	  	  	break;
	  	 
	  	 // УСЛОВИЕ НАХОЖДЕНИЯ ПОДСТРОКИ В СТРОКЕ ПРОВЕРЕНО.  
	  	 if (item.getName().toLowerCase().contains(findName.trim().toLowerCase())){
	  	 
	  	 	counter++;  // Увеличиваем счётчик найденных книг
	  	 	
			System.out.println("--------------- КНИГА № " + counter + ": ---------------");
			
			// Проверка установленного формата
			switch((fullFormat)? 1:0){  
					  
		  	case 0:		// Вывод в консоль информации в кратком формате
				        System.out.println(" НАЗВАНИЕ КНИГИ : "+item.getName()+
							             " || ГОД КНИГИ : "+item.getYear()+
							             " || АВТОР КНИГИ : "+item.getAuthor());
				  	
			  
			  		break;
		 
		  	default:	// Вывод в консоль информации в полном формате
					System.out.println(" НАЗВАНИЕ КНИГИ : "+item.getName()+
							             " || ГОД КНИГИ : "+item.getYear()+
							             " || АВТОР КНИГИ : "+item.getAuthor());
					System.out.println(" СОДЕРЖАНИЕ КНИГИ :");
						  // Если содержание книги не пустое
						  if(item.getChapters()!=null){
						  	// Выводим содержание глав книги
						  	for(String chapName :item.getChapters()){
								System.out.println((chapter++)+"."+chapName);
							}
						  
					 	  } 
					 	  else{ // Сообщаем об отсутствии содержания.
					 	  	System.out.println("В КНИГЕ НЕТ СОДЕРЖАНИЯ ГЛАВ");
						  }
					
	
	  		} //switch-case
		System.out.println();	  		
	  	} // if
	      } // for
	  
	    // Если счётчик книг равен нулю - то ничего не найдено.	  
	    if (counter == 0)
	  	System.out.println("НИЧЕГО НЕ НАЙДЕНО!\n");
	  	
	  }
	  
	  //---------------------------------------------------------------
	  
	  // МЕТОД №6 СОДЕРЖАНИЕ (выполняет поиск по названию книги и выводит её название + главы)
	public void bookContent(String bookName) {

		int counter = 1; // номер книжки
		int chapter = 1; // номер главы

		for (Book item : books) {

			if (item == null)
				break;

			if (item.getName().toLowerCase().equals(bookName.trim().toLowerCase())) {
				System.out.println("\t    Книга № " + counter++);
			}

			switch ((fullFormat) ? 1 : 0) {

			case 0:

				System.out.println("\t Название книги: " + item.getName());
				break;
				
			case 1:
				
				System.out.println("\t Название книги: " + item.getName());

				if (item.getChapters() != null) {
					System.out.println("Содержание: ");

					for (String chaps : item.getChapters()) {
						System.out.println((chapter++) + "." + " Глава: " + chaps);	
					}
					break;

				} else {
					System.out.println("В этой книге нету глав");
					break;
				}
			}
			break;

		}

	}
	  //---------------------------------------------------------------
	  
	  //Метод №7 ЗАКЛАДКА ---------------------------------------------
	  
	  public void makeFavorite(String bookName) {
		  int counter = 0;
		  
	      for (Book element : books)
	      {
	    	if(element == null)
	    		break;
	    	
			if (bookName.equals(element.getName()))
			{
				counter++;
				element.setChosen(true);
				System.out.println("Книга '" + bookName + "' успешно добавлена в закладки");
			}
	      }
	      if (counter == 0)
	  	  	System.out.println("Данная книга не найде в библиотеке");
	  }
	  
	//---------------------------------------------------------------
	  
	  //Метод №8 ИЗБРАННОЕ
	  
	  public void allFavorites() {
		  System.out.println("Избранные книжечки:");
		  for (Book element : books)
		{
			if (element == null) 
				break;
			
			if(element.isChosen()) {
				System.out.println(element.getName());
			}
		}
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
	  
	       // МЕТОД ВЫВОДА КОЛИЧЕСТВА КНИГ В БИБЛИОТЕКЕ   
        public void myNumber(){
        	int k=0,i=0; //к - используется для хранения количества книг
        				//i - для подсчета статистики елементов
            //ОПРЕДЕЛЯЕМ КОЛИЧЕСТВО КНИГ
        	for(int j=0; j<books.length; j++){
            if(books[k]!=null) k++;
            }
        	System.out.println("КОЛИЧЕСТВО КНИГ В БЫБЛИОТЕКЕ = "+k);
        	try{											//ну вы поняли что это  (:
        	
        	if (fullFormat=true){ //ДЛЯ ВИВОДА ДЕТАЛЬНОЙ СТАТИСТИКИ ЕСЛИ ВКЛЮЧУН ФОРМАТ
        		
        		System.out.println(" ИЗ НИХ");
        		
        		//ПЕРЕБОР КОЛИЧЕСТВА КНИГ С УКАЗАНЫМ ГОДОМ
        		for(int j=0; j<k; j++){
                  if(books[j].getYear() != 0) i++; 
        		}
        		System.out.println("С УКАЗАНЫМ ГОДОМ НАПИСАНИЯ "+i);
        		
        		//ПЕРЕБОР КОЛИЧЕСТВА КНИГ С УКАЗАНЫМ АВТОРОМ
        		i=0;										//обнуляем для нового подсчета
        		for(int j=0; j<k; j++){
                    if(books[j].getAuthor()!= null) i++;
        		}
        		System.out.println("С УКАЗАНЫМ АВТОРОМ "+i);
        		
        		//ПЕРЕБОР КОЛИЧЕСТВА КНИГ С УКАЗАНЫМИ Главами
        		i=0;
        		for(int j=0; j<k; j++){
                    if(books[j].getChapters()!= null) i++; 
        		}
        		System.out.println("С НАЛИЧИЕМ ГЛАВ "+i);
        	}
        	}
        	catch (Exception e){
        		System.out.println("olo lo");
        	}
        }
}

