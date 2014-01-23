package library;

public class Book
{

	private String name;                 //Название книги
	private String author;              //Автор книги
	private String [] chapters;        //Список глав книги
	private int year;                 //Год издательства книги
	private boolean chosen = false;  //Является ли избранным
	
	
	// КОНСТРУКТОРЫ НА ВЫБОР
	public Book(String name){
		this.name = name;
		this.chosen = false;
	}
	public Book(String name, int year){
		this.name = name;
		this.year = year;
		this.chosen = false;
	}
	public Book(String name, int year, String author){
		this.name = name;
		this.author = author;
		this.year = year;
		this.chosen = false;
	}
	public Book(String name, int year, String author, String...chapters){
		this.name = name;
		this.chapters = chapters;
		this.author = author;
		this.year = year;
		this.chosen = false;
	}
	
	//МЕТОДЫ : СЕТТЕРЫ И ГЕТТЕРЫ
	public String getName()             // получить название книги
	{
		return name;
	}
	public void setName(String name)   // записать название книги
	{
		this.name = name;
	}
	public String getAuthor()         // получить название
	{
		return author;
	}
	public void setAuthor(String author)   // записать название
	{
		this.author = author;
	}
	public String[] getChapters()    // получить название
	{
		return chapters;
	}
	public void setChapters(String[] chapters)    // записать название
	{
		this.chapters = chapters;
	}
	public int getYear()            // получить название
	{
		return year;
	}
	public void setYear(int year)    // записать название
	{
		this.year = year;
	}
	public boolean isChosen()      // получить название
	{
		return chosen;
	}
	public void setChosen(boolean chosen)   // записать название
	{
		this.chosen = chosen;
	}
	
}
