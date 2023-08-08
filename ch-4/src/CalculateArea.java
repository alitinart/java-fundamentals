/**
 *
 * Find the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these
 * four cities.
 *
 */
public class CalculateArea {
    public static void main(String[] args) {
        double latAtlanta = 33.7490;
        double lonAtlanta = -84.3880;

        double latOrlando = 28.5383;
        double lonOrlando = -81.3792;

        double latSavannah = 32.0809;
        double lonSavannah = -81.0912;

        double latCharlotte = 35.2271;
        double lonCharlotte = -80.8431;

        double area = calculateEstimatedArea(latAtlanta, lonAtlanta, latOrlando, lonOrlando,
                latSavannah, lonSavannah, latCharlotte, lonCharlotte);

        System.out.println("Estimated area enclosed by the four cities: " + area + " square units");
    }

    public static double calculateEstimatedArea(double lat1, double lon1,
                                                double lat2, double lon2,
                                                double lat3, double lon3,
                                                double lat4, double lon4) {
        // Convert latitude and longitude from degrees to radians
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        lat3 = Math.toRadians(lat3);
        lon3 = Math.toRadians(lon3);
        lat4 = Math.toRadians(lat4);
        lon4 = Math.toRadians(lon4);

        // Use the Shoelace formula to calculate the area
        double area = 0.5 * Math.abs((lon1 * lat2 + lon2 * lat3 + lon3 * lat4 + lon4 * lat1)
                - (lat1 * lon2 + lat2 * lon3 + lat3 * lon4 + lat4 * lon1));

        return area;
    }
}
