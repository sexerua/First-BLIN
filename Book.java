package library;

public class Book {
  private int size;                 //размер массива глав
  private String name;             //Название книги
  private String author;           //Автор книги
  private int year;                //Год издательства книги
  private boolean chosen = false;  //Является ли избранным
  
  public String[] chapters;        //Список глав книги
  
  public Book(){
    chapters = new chapters[size];
  }
  
  //Далее пойдут геттеры и сеттеры
}
