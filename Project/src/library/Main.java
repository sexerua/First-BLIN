package library;

//proverka!

import java.util.Scanner;

public class Main
{
	static String line;                   //СТРОКА КОТОРУЮ МЫ СЧИТЫВАЕМ ВМЕСТЕ С КОМАНДОЙ
	static int position;                  //ПЕРЕМЕННАЯ ДЛЯ ОТРЕЗКИ КОМАНДЫ ОТ ВСЕЙ СТРОКИ
	static String command;
	static String arguments;
	static Lib lib = new Lib();
	
	private static String[] commands = {  //СПИСОК КОМАНД
			"добавить",
			"просмотр",
			"найти",
			"содержание",
			"закладка",
			"избранное",
			"формат",
			"экспорт",
			"количество",
			"сброс",
			"выход"
	};
	
	
	public static void main(String[] args) {   //МЕТОД Main	
		while(true)
		{
			askCommand();
		}
	}
	
	private static void askCommand() {        //МЕТОД СПРОСИТЬ КОМАНДУ
		System.out.println("Введите комманду: ");
		line = new Scanner(System.in).nextLine().trim();
		if(line.contains(" "))
		{
			position = line.indexOf(" ");
			command = line.substring(0, position).toLowerCase();
			arguments = line.substring(position).trim();
			
		}
		else
		{
			command = line.toLowerCase();
			arguments = "";
		}
		runCommand(command);
	}
	
	private static void runCommand(String command) {   //МЕТОД ЗАПУСТИТЬ КОМАНДУ
			
			String commandToRun = null;
			
			for (String item : commands)
			{
				if(item.equals(command)) commandToRun = command;
			}
			
			if(commandToRun == null) {
				System.out.println("Команда не найдена");
				return;
			}
			
			switch (commandToRun)
			{
			case "добавить":
				if(!arguments.isEmpty()) {
					String[] str = arguments.split(";");       //РАЗБИВАЕМ СТРОКУ НА МАССИВ
					String[] mas = new String[str.length];     //МАССИВ РАЗДЕЛЬНЫХ ЭЛЕМЕНТОВ
					
					for (int i = 0; i < str.length; i++) {     //ПЕРЕБИРАЕМ ЭЛЕМЕНТЫ СТРОКИ
						mas[i] = str[i].trim();                //ИЗБАВЛЯЕМСЯ ОТ ЛИШНИХ ПРОБЕЛОВ
					}
					lib.addBook(mas);
				} else 
					System.out.println("Ведите хотя бы название книги.");
				
				break;
				
			case "просмотр":
				if(arguments.isEmpty())
					lib.printAllBooks();
				else if(!lib.proverka(arguments))
					lib.findByAuthor(arguments);
				else if(lib.proverka(arguments))
					lib.findByYear(arguments);				
				break;
				
			case "найти":
				lib.findBook(arguments);
				break;
				
			case "содержание":
				lib.bookContent(arguments);
				break;
				
			case "формат":
				if(arguments.equals("краткий"))
					lib.format(0);
				else if(arguments.equals("полный"))
					lib.format(1);
				break;
				
			case "закладка":
				lib.makeFavorite(arguments);
				break;
				
			case "избранное":
				lib.allFavorites();
				break;
				
			case "количество":
				lib.myNumber();
				break;
				
			case "экспорт":
				lib.export();
				break;
				
			case "выход":
				System.exit(0);
				break;
			}
		}
}
