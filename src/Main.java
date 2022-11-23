public class Main {
    public static void main(String[] args) {
        Author king = new Author("Стивен", "Кинг");
        Book shining = new Book ("Сияние", king, 1977);
        Author fowles = new Author("Джон", "Фаулз");
        Book collector = new Book ("Коллекционер", fowles, 1963);
        System.out.println(shining);
        System.out.println(collector);
        System.out.println(king.equals(fowles));
        System.out.println(shining.equals(collector));
    }
}