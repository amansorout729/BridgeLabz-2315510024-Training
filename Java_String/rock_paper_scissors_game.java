package Bridge_Labz;
import java.util.*;

public class rock_paper_scissors_game {
		    public static String getComputerChoice() {
		        int choice = (int) (Math.random() * 3); 
		        switch (choice) {
		            case 0: return "Rock";
		            case 1: return "Paper";
		            default: return "Scissors";
		        }
		    }
		    public static String findWinner(String user, String computer) {
		        if (user.equals(computer)) {
		            return "Tie";
		        } else if ((user.equals("Rock") && computer.equals("Scissors")) ||
		                   (user.equals("Paper") && computer.equals("Rock")) ||
		                   (user.equals("Scissors") && computer.equals("Paper"))) {
		            return "User";
		        } else {
		            return "Computer";
		        }
		    }
		    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
		        String[][] stats = new String[2][3]; 
		        double userPercent = ((double) userWins / totalGames) * 100;
		        double compPercent = ((double) compWins / totalGames) * 100;
		        stats[0][0] = "User";
		        stats[0][1] = String.valueOf(userWins);
		        stats[0][2] = String.format("%.2f%%", userPercent);
		        stats[1][0] = "Computer";
		        stats[1][1] = String.valueOf(compWins);
		        stats[1][2] = String.format("%.2f%%", compPercent);
		        return stats;
		    }
		    public static void displayResults(List<String[]> gameResults, String[][] stats) {
		        System.out.println("\n--- Game Results ---");
		        System.out.printf("%-10s %-15s %-15s %-10s%n", "Game", "User Choice", "Computer Choice", "Winner");
		        for (int i = 0; i < gameResults.size(); i++) {
		            String[] res = gameResults.get(i);
		            System.out.printf("%-10d %-15s %-15s %-10s%n", (i + 1), res[0], res[1], res[2]);
		        }

		        System.out.println("\n Stats ");
		        System.out.printf("%-10s %-10s %-15s%n", "Player", "Wins", "Win %");
		        for (String[] row : stats) {
		            System.out.printf("%-10s %-10s %-15s%n", row[0], row[1], row[2]);
		        }
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of games: ");
		        int n = sc.nextInt();
		        sc.nextLine(); 
		        int userWins = 0, compWins = 0;
		        List<String[]> gameResults = new ArrayList<>();
		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
		            String userChoice = sc.nextLine().trim();
		            String computerChoice = getComputerChoice();
		            String winner = findWinner(userChoice, computerChoice);
		            if (winner.equals("User")) userWins++;
		            else if (winner.equals("Computer")) compWins++;
		            gameResults.add(new String[]{userChoice, computerChoice, winner});
		        }		      
		        String[][] stats = calculateStats(userWins, compWins, n);
		        displayResults(gameResults, stats);
		        sc.close();
		    }
		


	}


