package library;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		// ĞÅÀËÈÇÀÖÈß ÌÅÒÎÄÀ ¹ 1 ÄËß ÏĞÎÂÅĞÊÈ ĞÀÁÎÒÎÑÏÎÑÎÁÍÎÑÒÈ ÌÅÒÎÄÀ (äîáàâèòü êíèãó â áèáëèîòåêó)
		Lib lib = new Lib(5);
		
		lib.addBook("b1");
		lib.addBook("b2",1995);
		lib.addBook("b3", 2005, "Dima");
		lib.addBook("b4", 2009, "Dmytro", "g1","g2","g3");
		
		System.out.println(lib.books[0].getName());
		System.out.println(lib.books[1].getName()+"  "+lib.books[1].getYear());
		System.out.println(lib.books[2].getName()+"  "+lib.books[2].getYear()+" "+lib.books[2].getAuthor());
		System.out.println(lib.books[3].getName()+"  "+lib.books[3].getYear()+" "+lib.books[3].getAuthor());
		
		for(String item :lib.books[3].getChapters()){
			System.out.print(item+" ");
		}
	}

}
