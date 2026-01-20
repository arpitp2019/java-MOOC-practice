import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
	    String file = scan.nextLine();
	    System.out.println("Team:");
	    String inputTeam = scan.nextLine();
	    try (Scanner scanFile = new Scanner(Paths.get(file))){
		    int gameCount = 0;
		    int wins = 0;
		    while(scanFile.hasNextLine()){
			    String [] inputData = scanFile.nextLine().split(",");
			    String homeTeam = inputData[0];
			    String visitingTeam = inputData[1];
			    int homeTeamPoint  = Integer.parseInt(inputData[2]);
			    int visitingTeamPoint = Integer.parseInt(inputData[3]);
			    if (inputTeam.equals(homeTeam) || (inputTeam.equals(visitingTeam))){
				    if(inputTeam.equals(homeTeam) && homeTeamPoint > visitingTeamPoint){
					    wins++;
				    }else if (inputTeam.equals(visitingTeam) && visitingTeamPoint > homeTeamPoint){
					    wins++;
				    }
				    gameCount++;
			    }
		    }
        System.out.println("Games: " + gameCount);
	    System.out.println("Wins: " + wins);
	    System.out.println("Losses: " + (gameCount - wins));
	    }catch(Exception e){
		    System.out.println(e.getMessage());
	    }
	    scan.close();
    }
}