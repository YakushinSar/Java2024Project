package lesson6;

public class Library {


    public static void main(String[] args) {

        //тут ссылаемся на класс Book, создаем новый объект класса Book
        /*тоесть, по чертежу класса Бук(общего) мы создадим
        новый экземпляр (конкретный), которым мы будем
        пользоваться в данный момент
         */
        Book onegin = new Book();
        onegin.title = "Пушкин Имя Девы";
        onegin.author = "Федор Достоевский";
        onegin.language = "русский";
        onegin.page = 1828;

        Book ivangoe = new Book();
        ivangoe.title = "Ивано-Грозненская повесть";
        ivangoe.author = "Лев Толстой";
        ivangoe.language = "русский";
        ivangoe.page = 1821;

        /*вызываем статический метод, который создает
        новый экземпляр Book, то есть по шаблону
        описанному в Бук
         */
        Book gore = sozdatKnigu("Горе от ума", "Грибоедов", "русский", 300);

        /*создаем массив из двух экземпляров класса Book,
        инициализируем их полями, то есть логика идет как и при
        int sum = 1 + 2
         */
        Book[] books = {onegin, ivangoe, gore};

        System.out.println(books[0].author);
        System.out.println(books[2].page);
        System.out.println();

        for (Book book : books) {
            System.out.println(book.makeCard());
            System.out.println("----------");
        }
    }

    //статический метод, который создает новый экземпляр Book
        static Book sozdatKnigu(String title, String autor,                        String language, int page) {
        Book book = new Book();
        book.title = title;
        book.author = autor;
        book.language = language;
        book.page = page;
        return book;


    }
}





