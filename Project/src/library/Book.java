package library;

public class Book
{

	private String name;                 //РќР°Р·РІР°РЅРёРµ РєРЅРёРіРё
	private String author;              //РђРІС‚РѕСЂ РєРЅРёРіРё
	private String [] chapters;        //РЎРїРёСЃРѕРє РіР»Р°РІ РєРЅРёРіРё
	private int year;                 //Р“РѕРґ РёР·РґР°С‚РµР»СЊСЃС‚РІР° РєРЅРёРіРё
	private boolean chosen = false;  //РЇРІР»СЏРµС‚СЃСЏ Р»Рё РёР·Р±СЂР°РЅРЅС‹Рј
	
	
	// РљРћРќРЎРўР РЈРљРўРћР Р« РќРђ Р’Р«Р‘РћР 
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
	public Book(String name, int year, String author, String[] chapters){
		this.name = name;
		this.chapters = chapters;
		this.author = author;
		this.year = year;
		this.chosen = false;
	}
	
	//РњР•РўРћР”Р« : РЎР•РўРўР•Р Р« Р� Р“Р•РўРўР•Р Р«
	public String getName()             // РїРѕР»СѓС‡РёС‚СЊ РЅР°Р·РІР°РЅРёРµ РєРЅРёРіРё
	{
		return name;
	}
	public void setName(String name)   // Р·Р°РїРёСЃР°С‚СЊ РЅР°Р·РІР°РЅРёРµ РєРЅРёРіРё
	{
		this.name = name;
	}
	public String getAuthor()         // РїРѕР»СѓС‡РёС‚СЊ РЅР°Р·РІР°РЅРёРµ
	{
		return author;
	}
	public void setAuthor(String author)   // Р·Р°РїРёСЃР°С‚СЊ РЅР°Р·РІР°РЅРёРµ
	{
		this.author = author;
	}
	public String[] getChapters()    // РїРѕР»СѓС‡РёС‚СЊ РЅР°Р·РІР°РЅРёРµ
	{
		return chapters;
	}
	public void setChapters(String[] chapters)    // Р·Р°РїРёСЃР°С‚СЊ РЅР°Р·РІР°РЅРёРµ
	{
		this.chapters = chapters;
	}
	public int getYear()            // РїРѕР»СѓС‡РёС‚СЊ РЅР°Р·РІР°РЅРёРµ
	{
		return year;
	}
	public void setYear(int year)    // Р·Р°РїРёСЃР°С‚СЊ РЅР°Р·РІР°РЅРёРµ
	{
		this.year = year;
	}
	public boolean isChosen()      // РїРѕР»СѓС‡РёС‚СЊ РЅР°Р·РІР°РЅРёРµ
	{
		return chosen;
	}
	public void setChosen(boolean chosen)   // Р·Р°РїРёСЃР°С‚СЊ РЅР°Р·РІР°РЅРёРµ
	{
		this.chosen = chosen;
	}
	
}
