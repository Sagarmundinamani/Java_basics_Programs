package Oops;

class BookDriver {
    public static void main(String[] args) {
        Book b1=new Book("sagar ","j gosling",1299);
        System.out.println(b1);
        Book b2=new Book("sagar ","j gosling",1259);
        System.out.println(b1.equals(b2));
    }
}
