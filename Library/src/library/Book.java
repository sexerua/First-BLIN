package library;

public class Book
{

	private String name;                 //�������� �����
	private String author;              //����� �����
	private String [] chapters;        //������ ���� �����
	private int year;                 //��� ������������ �����
	private boolean chosen = false;  //�������� �� ���������
	
	
	// ������������ �� �����
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
	
	//������ : ������� � �������
	public String getName()             // �������� �������� �����
	{
		return name;
	}
	public void setName(String name)   // �������� �������� �����
	{
		this.name = name;
	}
	public String getAuthor()         // �������� ��������
	{
		return author;
	}
	public void setAuthor(String author)   // �������� ��������
	{
		this.author = author;
	}
	public String[] getChapters()    // �������� ��������
	{
		return chapters;
	}
	public void setChapters(String[] chapters)    // �������� ��������
	{
		this.chapters = chapters;
	}
	public int getYear()            // �������� ��������
	{
		return year;
	}
	public void setYear(int year)    // �������� ��������
	{
		this.year = year;
	}
	public boolean isChosen()      // �������� ��������
	{
		return chosen;
	}
	public void setChosen(boolean chosen)   // �������� ��������
	{
		this.chosen = chosen;
	}
	
}
