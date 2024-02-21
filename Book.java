public class Book {
    String title;
    String author;
    int publicationYear;

    public static void main(String[] args) {
        Book book1= new Book();
        book1.title="El Gallo de Oro";
        book1.author="Juan Rulfo";
        book1.publicationYear=1980;

        System.out.println("Book 1:");
        System.out.println("Title: "+book1.title);
        System.out.println("Author: "+book1.author);
        System.out.println("Publication Year: "+book1.publicationYear);

        Book book2= new Book();
        book2.title="Harry Potter y la Piedra Filosofal";
        book2.author="J.K. Rowling";
        book2.publicationYear=1997;

        System.out.println("Book 2:");
        System.out.println("Title: "+book2.title);
        System.out.println("Author: "+book2.author);
        System.out.println("Publication Year: "+book2.publicationYear);

        Book book3= new Book();
        book3.title="El Principito";
        book3.author="Antoine de Saint-Exupéry";
        book3.publicationYear=1943;

        System.out.println("Book 3:");
        System.out.println("Title: "+book3.title);
        System.out.println("Author: "+book3.author);
        System.out.println("Publication Year: "+book3.publicationYear);

        Book book4= new Book();
        book4.title="Cien Años de Soledad";
        book4.author="Gabriel García Marquez";
        book4.publicationYear=1967;

        System.out.println("Book 4:");
        System.out.println("Title: "+book4.title);
        System.out.println("Author: "+book4.author);
        System.out.println("Publication Year: "+book4.publicationYear);

        Book book5= new Book();
        book5.title="La Divina Comedia";
        book5.author="Dante Alighieri";
        book5.publicationYear=1314;

        System.out.println("Book 5:");
        System.out.println("Title: "+book5.title);
        System.out.println("Author: "+book5.author);
        System.out.println("Publication Year: "+book5.publicationYear);

        Book book6= new Book();
        book6.title="Don Quijote de la Mancha";
        book6.author="Miguel de Cervantes";
        book6.publicationYear=1605;

        System.out.println("Book 6:");
        System.out.println("Title: "+book6.title);
        System.out.println("Author: "+book6.author);
        System.out.println("Publication Year: "+book6.publicationYear);
    }
}
