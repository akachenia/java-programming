package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        Audiobook audiobook = new Audiobook();
        audiobook.author = "Unmesh";
        audiobook.length = 60;
        audiobook.narrator = "Irina";
        audiobook.price = 44.99;
        audiobook.title = "Selenium CookBook";
        audiobook.type = "Automation";
        audiobook.listen();

        EBook eBook = new EBook();
        eBook.title = "Java data structure";
        eBook.author = "Ssvitch";
        eBook.price = 89.00;
        eBook.type = "Manual";



    }
}
