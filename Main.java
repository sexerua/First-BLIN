public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		// РЕАЛИЗАЦИЯ МЕТОДА № 1 ДЛЯ ПРОВЕРКИ РАБОТОСПОСОБНОСТИ МЕТОДА (добавить книгу в библиотеку)
		Lib lib = new Lib(5);
		
	        lib.addBook("b1");
		lib.addBook("b2",1995);
		lib.addBook("b3", 2005, "Dima");
		lib.addBook("b4", 2009, "Dmytro", "g1","g2","g3");
		
		lib.printAllBooks();
		lib.format(1);
		lib.printAllBooks();
	}

}


// У МЕНЯ ВРОДЕ ВСЕ РАБОТАЕТ, свои методы проверяйте похожим образом и выкладивайте в класс Lib
