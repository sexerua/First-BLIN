package library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.io.PrintWriter;

public class Lib
{
	  public Book[] books = new Book[1]; // С МАССИВОМ РАБОТАЕМ ЧЕРЕЗ НАШЫ МЕТОДЫ
	  private boolean fullFormat = false; // ДЛЯ МЕТОДА №9  ФОРМАТ
	  public Lib (){
		  
	  }
	  
	  // ДАЛЕЕ ВСТАВЛЯЙТЕ СВОИ МЕТОДЫ И ПРОБУЙТЕ ЗАПУСТИТЬ СВОЙ МЕТОД ЧЕРЕЗ Main СОЗДАВ ЭКЗЕМПЛЯР КЛАССА Lib
	  
	  
	  
	  
	  
	  
	  // БАЗОВЫЙ МЕТОД ДОБАВИТЬ КНИГУ В БИБЛИОТЕКУ 
	  public void addBook(String...arguments) {
		  if(books[0]!=null){//ЕСЛИ ПЕРВЫЙ ЭЛЕМЕНТ МАССИВА НЕ ПУСТОЙ (добавлена хоть одна книга) ТОГДА УВЕЛИЧИВАЕМ МАССИВ НА ОДНУ ЯЧЕЙКУ
			    Book[] copyArray = (Book[]) books.clone();
			    books = new Book[copyArray.length+1];
			    System.arraycopy(copyArray, 0, books, 0, copyArray.length);
			    }
		  for(int i=0; i<books.length; i++)
		  {
			  if(books[i]==null){
				  switch (arguments.length)
					{
					case 1:
						books[i] = new Book(arguments[0]);
						break;
						
					case 2:
						books[i] = new Book(arguments[0], arguments[1]);
						break;
						
					case 3:
						books[i] = new Book(arguments[0], arguments[1], arguments[2]);
						break;
						
					default:
						String[] chapters = new String[arguments.length-3];
						for (int j = 0; j < arguments.length-3; j++) {
							chapters[j] = arguments[j+3];
						}
						books[i] = new Book(arguments[0], arguments[1], arguments[2], chapters);
						break;
					}
			  }
		  }
		  System.out.println("КНИГА "+arguments[0]+" УСПЕШНО ДОБАВЛЕНА В БИБЛИОТЕКУ");
	  }
	  
	  
	  //МЕТОД № 2 ПРОСМОТР, который выводит инфо о книгах в библиотеке
	  
	  public void printAllBooks(){
				 
		 if (fullFormat==false){printInfo(0);}else{printInfo(1);}
	  }
	  
	//---------------------------------------------------------------	   
	  
	// Метод печати книг по заданному формату
	  
	private void printBook(int index, Book book){
	  		 
		 int chapter = 1; // Индекс главы
	  		 
         System.out.println("--------------- КНИГА № " + index + ": ---------------");
             
         switch((fullFormat)? 1:0){
       
           case 0:
                   System.out.println(" || АВТОР КНИГИ : "+book.getAuthor()+"\n" +
                		   			" || НАЗВАНИЕ КНИГИ : "+book.getName()+"\n" +
                             		" || ГОД КНИГИ : "+book.getYear()+"\n");
                               
               
                   break;
      
          default:
                   System.out.println( " || АВТОР КНИГИ : "+book.getAuthor()+
                   		 			 " || НАЗВАНИЕ КНИГИ : "+book.getName()+
                   		 			 " || ГОД КНИГИ : "+book.getYear());
                   System.out.println(" СОДЕРЖАНИЕ КНИГИ :");
                                       
                   if(book.getChapters()!=null){
                                       
                           for(String chapName :book.getChapters()){
                                     System.out.println((chapter++)+"."+chapName);
                           }
                                       
                   } 
                   else{
                           System.out.println("В КНИГЕ НЕТ СОДЕРЖАНИЯ ГЛАВ");
                       }
                             

         } //switch-case
        System.out.println();                          	 	 
	}	
	
	//---------------------------------------------------------------	   
	   
	//Метод № 3 ПРОСМОТР по заданному автору         
    public void findByAuthor(String author){
        	  
       	  int counter = 0; 
        	  
       	  System.out.println(" РЕЗУЛЬТАТЫ ПОИСКА:");
          for (Book item: books){
                      
               if (item == null) 		// Если добрались до пустого элемента, то дальше в библиотеке книг нет
                        break;
               
               if (item.getAuthor() == null)
            	   continue;
               
               if (item.getAuthor().toLowerCase().equals(author.trim().toLowerCase())){
                   
                   counter++;
                   // Выводим на печать
                   printBook(counter,item);
               } // if
          } // for
  
          if (counter == 0)
            System.out.println("НИЧЕГО НЕ НАЙДЕНО!\n");
          
    }

	//---------------------------------------------------------------
            
    // Метод № 4 ПОИСК КНИГИ В БИБЛИОТЕКЕ ПО ГОДУ ИЗДАНИЯ
    public void findByYear(String year){

          int counter = 0;
             
          System.out.println(" РЕЗУЛЬТАТЫ ПОИСКА:");
          for (Book item: books){
                   
          	 if (item == null)                 // Если добрались до пустого элемента, то дальше в библиотеке книг нет
          		 break;
         	 	 
          	 if (item.getYear().equals(year)){
                
          		 counter++;
                 // Выводим на печать
                 printBook(counter,item);
                 
       	 	 } // if
          } // for

          if (counter == 0)
         	 System.out.println("НИЧЕГО НЕ НАЙДЕНО!\n");
       
      }

	  //---------------------------------------------------------------
	  
	  //Метод № 5  ПОИСК КНИГИ В БИБЛИОТЕКЕ ПО НАЗВАНИЮ
	  public void findBook(String name){
	  	
	  	int counter = 0;	// Счётчик найденных книг
	  	
	  	System.out.println(" РЕЗУЛЬТАТЫ ПОИСКА:");
	  	for (Book item: books){ // Цикл по всем книгам в библиотеке
	  		
	  		if (item == null) // Если добрались до пустого элемента, то дальше в библиотеке книг нет
	  			break;
	  	 
	  		// УСЛОВИЕ НАХОЖДЕНИЯ ПОДСТРОКИ В СТРОКЕ ПРОВЕРЕНО.  
	  		if (item.getName().toLowerCase().equals(name.trim().toLowerCase())){
	  	 
	  			counter++;  // Увеличиваем счётчик найденных книг
	  	 	
	  			// Выводим на печать
	  			printBook(counter,item);

		  	} // if
	    } // for
	  
	    // Если счётчик книг равен нулю - то ничего не найдено.	  
	  	if (counter == 0)
		  	System.out.println("НИЧЕГО НЕ НАЙДЕНО!\n");
	   	
	  }
	  
	  //---------------------------------------------------------------
	  
	   // МЕТОД №6 СОДЕРЖАНИЕ (выполняет поиск по названию книги и выводит её
	// название + главы)
	public void bookContent(String bookName) {

		int counter = 0; // номер книжки
		int chapter = 1; // номер главы

		for (Book item : books) {
			counter++;
			if (item == null)
				break;

			if (item.getName().equals(bookName)) {
				System.out.println("\t    Книга № " + counter);

				switch ((fullFormat) ? 1 : 0) {

				case 0:

					System.out.println("\t Название книги: " + item.getName());
					break;

				default:

					System.out.println("\t Название книги: " + item.getName());

					if (item.getChapters() != null) {
						System.out.println("Содержание: ");

						for (String chaps : item.getChapters()) {
							System.out.println((chapter++) + "." + " Глава: "
									+ chaps);
						}

					} else {
						System.out.println("В этой книге нету глав");
					}
				}
				break;
			}
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
	  
	  // МЕТОД №11 ВЫВОДА КОЛИЧЕСТВА КНИГ В БИБЛИОТЕКЕ   
        public void myNumber(){
        	int i=0;     //i - для подсчета статистики елементов
            //ОПРЕДЕЛЯЕМ КОЛИЧЕСТВО КНИГ
        
            if(books[0]==null) System.out.println("КОЛИЧЕСТВО КНИГ В БЫБЛИОТЕКЕ = 0");
            System.out.println("КОЛИЧЕСТВО КНИГ В БЫБЛИОТЕКЕ = "+books.length);
        	
        	try{											//ну вы поняли что это  (:
        	
        	if (fullFormat=true){ //ДЛЯ ВИВОДА ДЕТАЛЬНОЙ СТАТИСТИКИ ЕСЛИ ВКЛЮЧУН ФОРМАТ
        		
        		System.out.println(" ИЗ НИХ");
        		
        		//ПЕРЕБОР КОЛИЧЕСТВА КНИГ С УКАЗАНЫМ ГОДОМ
        		for(int j=0; j<books.length; j++){
                  if(!books[j].getYear().equals("0")) i++; 
        		}
        		System.out.println("С УКАЗАНЫМ ГОДОМ НАПИСАНИЯ "+i);
        		
        		//ПЕРЕБОР КОЛИЧЕСТВА КНИГ С УКАЗАНЫМ АВТОРОМ
        		i=0;										//обнуляем для нового подсчета
        		for(int j=0; j<books.length; j++){
                    if(books[j].getAuthor()!= null) i++;
        		}
        		System.out.println("С УКАЗАНЫМ АВТОРОМ "+i);
        		
        		//ПЕРЕБОР КОЛИЧЕСТВА КНИГ С УКАЗАНЫМИ Главами
        		i=0;
        		for(int j=0; j<books.length; j++){
                    if(books[j].getChapters()!= null) i++; 
        		}
        		System.out.println("С НАЛИЧИЕМ ГЛАВ "+i);
        	}
        	}
        	catch (Exception e){
        		System.out.println("olo lo");
        	}
        }
        
                //ПОМОЩНИК МЕТОДА ДОБАВИТЬ, ПРОВЕРЯЕТ ЧТО ВВЕЛ ПОЛЬЗОВАТЕЛЬ ЧИСЛО ИЛИ ТЕКСТ 
	public boolean proverka(String str)
	{

		try
		{
			str.trim();
			char[] charArray = str.toCharArray(); // ПРОВЕРКА СКОЛЬКО ЦИФР ВВЕЛ ПОЛЬЗОВАТЕЬ В ПЕРЕМЕННУЮ ГОД КНИГИ
			String[] strArray = new String[4];
			if (charArray.length == 4) {
				for (int i = 0; i < 4; i++) {
					strArray[i] = String.valueOf(charArray[i]); // ПЕРЕВОД КАЖДОГО СИМВОЛА В СТРОКУ
					int value = Integer.parseInt(strArray[i]);// ПРОВЕРКА ЯВЛЯЕТСЯ ЛИ ЦИФРОЙ ЭЛЕМЕНТ МАССИВА ДЛЯ ТОГО ЧТОбЫ ПОНЯТЬ ЦИФРА ЭТО ИЛИ СИМВОЛ
				}
				return true;
			} else {
				return false;
			}

		} catch (NumberFormatException e) {
			return false;
		}
	}
        //---------------------------------------------------------------------------------
        
        public void export() {
            try 
            {
                File bookPath = new File("D:/Library.txt"); // объект путь файлa
                FileWriter str = new FileWriter(bookPath);  //  вывод информации
                PrintWriter w = new PrintWriter(str); // запись
                       int counter=1;// СЧЕТЧИК ДЛЯ ГЛАВ (ДЕЛАЕТ НОМЕРАЦИЮ ГЛАВ
                               for(int i=0; i<books.length; i++){
                            	   if(books[i]!=null){
                            		   w.println(" НАЗВАНИЕ КНИГИ : "+books[i].getName()+
                            				   " || ГОД КНИГИ : "+books[i].getYear()+
                                               " || АВТОР КНИГИ : "+books[i].getAuthor());
                            		   w.println(" СОДЕРЖАНИЕ КНИГИ :");
                                           
                            		   if(books[i].getChapters()!=null){
                            			   for(String item :books[i].getChapters()){
                            				   w.println((counter++)+"."+item);
                            			   }
                                                       
                            		   }
                            		   else {
                                        	w.println("В КНИГЕ НЕТ СОДЕРЖАНИЯ ГЛАВ");
                                       }
                            		   w.println();
                            	   }
                               }
                
                w.close(); // завершить запись и закрыть трай - обязательно!
            } 
            catch (IOException e) //исключить ошибки
            {
                System.err.println("проблема с записью файла Library.txt"); 
            }
        }
}

