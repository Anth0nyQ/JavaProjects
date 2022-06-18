import java.util.*;

public class assignment02_q22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true)
        {
            //initializing number of candidates
            System.out.println("Enter number of people: ");
            n = sc.nextInt();
            if (n <= 5)
                break;
            else
                System.out.println("Number must be less than 5");
        }

        sc.nextLine();

        String names[] = new String[n];

        int votes[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            //storing candidate name and votes
            System.out.println("Enter candidate's name :");
            names[i] = sc.nextLine();
            System.out.println("Enter votes received :");
            votes[i] = sc.nextInt();
            sc.nextLine();
        }
        displayElectionResultsTable(names, votes);

    }

    private static void displayElectionResultsTable(String[] names, int[] votes) {
        double sum = 0;
        int winner = -1;
        String winnerName = "";
        for (int i = 0; i < names.length; i++)
        {
            sum += votes[i];
            if (winner < votes[i]) {
                winner = votes[i];
                winnerName = names[i];
            }
        }
        //table formatting for output like image shown
        System.out.println("Candidate\t\tVotes Received\t\t% of Total Votes");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s\t\t%d\t\t\t%.2f\n",names[i], votes[i] , (votes[i] / sum * 100));
        }
        System.out.println("Total\t\t\t"+sum);
        System.out.println("The Winner of the Election is " + winnerName+".");
    }
}
