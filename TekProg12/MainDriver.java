public class MainDriver {
    public static void main(String[] args) {
        Customer customer = new Customer("Jake Hashmap");
        
        Movie movie1 = new Movie("The Matrix", Movie.NEW_RELEASE);
        Movie movie2 = new Movie("The Godfather", Movie.REGULAR);
        Movie movie3 = new Movie("The Dark Knight", Movie.CHILDREN);

        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 4);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println("Statement Output:\n");
        System.out.println(customer.statement());
        System.out.println("\n\nHTML Statement Output:\n");
        System.out.println(customer.htmlStatement());
    }
}
