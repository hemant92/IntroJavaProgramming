package ChapterOne;

public class Population {
    public static void main(String[] args) {
        int total = 312032486;
        int seconds = 365 * 24 * 60 * 60;
        double birth = (seconds/7);
        double death =  (seconds/13);
        double immigrant = (seconds/45);
        double changeInPopulation = (birth - death  + immigrant);
        double firstYear  = total + changeInPopulation;
        double secondYear = firstYear + (changeInPopulation);
        double thirdYear = secondYear + changeInPopulation;
        double fourthYear = thirdYear + changeInPopulation;
        double fifthYear = fourthYear + changeInPopulation;
        System.out.println(fifthYear + "  " + "fifthYear");
    }
}