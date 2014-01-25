package library;

import java.util.Scanner;

public class Main
{
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
		String command = new Scanner(System.in).nextLine().toLowerCase().trim();
		runCommand(command);
	}
	
	private static void runCommand(String command) {   //МЕТОД ЗАПУСТИТЬ КОМАНДУ
		
			Lib lib = new Lib(20);
			
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
				System.out.println("Введите название книги, год, автора и список глав, разделяя все запятыми:");
				String[] str = new Scanner(System.in).nextLine().trim().split(","); //РАЗБИВАЕМ СТРОКУ НА МАССИВ
				String[] mas = new String[str.length];                              //МАССИВ РАЗДЕЛЬНЫХ ЭЛЕМЕНТОВ
				String[] chapters = new String[str.length-3];                       //ДОП МАССИВ ДЛЯ ГЛАВ
				
				for (int i = 0; i < str.length; i++)       //ПЕРЕБИРАЕМ ЭЛЕМЕНТЫ СТРОКИ
				{
					mas[i] = str[i].trim();                //ИЗБАВЛЯЕМСЯ ОТ ЛИШНИХ ПРОБЕЛОВ
				}
				if(mas.length > 3)                         //ЕСЛИ ЭЛЕМЕНТОВ БОЛЬШЕ 3, ТО...
				{
					for (int i = 3; i < mas.length; i++)
					{
						chapters[i-3] = mas[i];            //...ПОМЕЩАЕМ ГЛАВЫ В ДОП МАССИВ
					}
				}

				switch (mas.length)                        //ТУТ ОПРЕДЕЛЯЕМ КАКОЙ МЕТОД ВЫЗЫВАТЬ
				{                                          //В ЗАВИСИМОСТИ ОТ ТОГО СКОЛЬКО ЭЛЕМЕНТОВ
				case 1:
					lib.addBook(mas[0]);                   //ТОЛЬКО НАЗВАНИЕ
					break;
				case 2:
					lib.addBook(mas[0], Integer.parseInt(mas[1])); //ТОЛЬКО НАЗВАНИЕ И ГОД
					break;
				case 3:
					lib.addBook(mas[0],Integer.parseInt(mas[1]), mas[2]); //ТОЛЬКО НАЗВАНИЕ, ГОД И АВТОР
					break;
				default:
					lib.addBook(mas[0],Integer.parseInt(mas[1]), mas[2], chapters); //НАЗВАНИЕ, ГОД, АВТОР И ГЛАВЫ
					break;
				}
				//ТУТ НИЖЕ ПРОВЕРКА НА ТО КАК ДОБАВИЛОСЬ, МОЖНО И УДАЛИТЬ
				lib.format(1);
				lib.printAllBooks();
				break;
			}
		}
}
