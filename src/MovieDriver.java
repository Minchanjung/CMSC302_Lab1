import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Movie userMovie = new Movie();
		String playAgain = "";
		
		do {
			
			System.out.print("Enter the title of a movie: ");
			String movie = keyboard.nextLine();
			userMovie.setTitle(movie);
			
			System.out.print("Enter the movie's rating: ");
			String movieRating = keyboard.next();
			userMovie.setRating(movieRating);
	
			System.out.print("Enter the number of tickets sold at the theater: ");
			int ticketsSold = keyboard.nextInt();
			userMovie.setSoldTickets(ticketsSold);
			
			System.out.println(userMovie.toString());
			
			keyboard.nextLine();
			System.out.print("\nWould you like to enter another (y or n): " );
			playAgain = keyboard.nextLine();
		
		} while (playAgain.equals("y"));
		keyboard.close();
	}

}
