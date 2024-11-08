import club.Club;
import player.*;
import stadium.Stadium;
import staff.*;
import team.Team;

public class Main {
    public static void main(String[] args) {

        Stadium stadium = new Stadium("Khulna stadium.Stadium", 50000, "City Center");

        Club club = new Club("Champions FC", stadium, "Khulna");

        Coach coach = new Coach("Ancelotti", 10, "Offensive", 80000);

        Team seniorTeam = new Team("Senior team.Team", coach, "4-4-2", "Red and White");
        Team juniorTeam = new Team("Junior team.Team", coach, "4-3-3", "Blue and White");

        Player seniorPlayer1 = new SeniorPlayer("Rahul", 28, "Forward", 50000, "Female", 5, 90, 25);
        Player seniorPlayer2 = new SeniorPlayer("Durjay", 30, "Midfielder", 55000, "Male", 4, 80, 20);
        Player juniorPlayer1 = new JuniorPlayer("Karim", 18, "Defender", 20000, "Male", 2, "St Josephs High School", false);
        Player juniorPlayer2 = new JuniorPlayer("Rahim", 18, "Goalkeeper", 25000, "Male", 1, "Khulna Zilla School", true);

        // Add players to teams
        seniorTeam.addPlayer(seniorPlayer1);
        seniorTeam.addPlayer(seniorPlayer2);
        juniorTeam.addPlayer(juniorPlayer1);
        juniorTeam.addPlayer(juniorPlayer2);

        // Add teams to the club
        club.addTeam(seniorTeam);
        club.addTeam(juniorTeam);

        // Check initial balance
        System.out.println("Initial Balance: " + club.getBalance());

        // Add revenue to the club
        club.addRevenue(2600000);
        System.out.println("Balance after revenue: " + club.getBalance());


        club.paySalaries();
        System.out.println("Balance after paying salaries: " + club.getBalance());

        // Record match results for teams
        seniorTeam.recordMatchResult(true); 
        juniorTeam.recordMatchResult(false);

        // Output team performance
        System.out.println(seniorTeam.getTeamPerformance());
        System.out.println(juniorTeam.getTeamPerformance());

        // Remove a player from the senior team
        seniorTeam.removePlayer(seniorPlayer1);
        System.out.println("Players in Senior team.Team after removal: " + seniorTeam.getPlayerList().size());
    }
}
