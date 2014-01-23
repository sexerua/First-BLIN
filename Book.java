package library;

public class Book {
  private String name;             //Название книги
  private String author;           //Автор книги
  private int year;                //Год издательства книги
  private boolean chosen = false;  //Является ли избранным
  
  public String[] chapters;        //Список глав книги
  
  Book(){
    
  }
  
  //Далее пойдут геттеры и сеттеры
  String getName(){            // получить название книги
    return name;
  }
  
  void setName(String name){   // записать название книги
    this.name = name;
  }  
}
