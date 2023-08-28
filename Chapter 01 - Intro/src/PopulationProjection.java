/*

    *1.11 The U.S. Census Bureau projects population based on the following assumptions: ‘
          * One birth every 7 seconds
          * One death every 13 seconds
          * One new immigrant every 45 seconds
     Write a program to display the population for each of the next five years. Assume the

     current population is 312,032,486 and one year has 365 days.

*/

public class PopulationProjection {
    public static void main(String[] args) {
        //   Save all given information into variables for later use
        int currentPopulation = 312_032_486;
        int natality = 7;
        int mortality = 13;
        int immigrants = 45;
        int secondsInYear = 31_536_000;

        //  Perform calculations based on the information given
        int birthsInYear = (secondsInYear / natality);
        int deathsInYear = (secondsInYear / mortality);
        int immigrantsInYear = (secondsInYear / immigrants);

        //  Calculate the population for the next 5 years
        int populationNextFiveYears = currentPopulation + (birthsInYear + deathsInYear + immigrantsInYear);
        System.out.println("The number of people in USA after 5 Years: " + populationNextFiveYears);
    }
}
