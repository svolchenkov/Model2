/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Sergey
 */
public class UtilityDistrict {

//    public static String nameSmud = "smud";
//    public static double tire1currentSmud = 0.1;
//    public static double tire2currentSmud = 0.19;
//    public static double tire3currentSmud = 0.19;
//    public static double tire4currentSmud = 0.19;
//    public static double tire5currentSmud = 0.19;
//    public static double tire1rateSmud = 0.1;
//    public static double tire2rateSmud = 0.21;
//    public static double tire3rateSmud = 0.21;
//    public static double tire4rateSmud = 0.21;
//    public static double tire5rateSmud = 0.21;
//
//    public static String nameRoseville = "roseville";
//    public static double tire1currentRoseville = 0.11;
//    public static double tire2currentRoseville = 0.15;
//    public static double tire3currentRoseville = 0.17;
//    public static double tire4currentRoseville = 0.17;
//    public static double tire5currentRoseville = 0.17;
//    public static double tire1rateRoseville = 0.11;
//    public static double tire2rateRoseville = 0.16;
//    public static double tire3rateRoseville = 0.19;
//    public static double tire4rateRoseville = 0.19;
//    public static double tire5rateRoseville = 0.19;
//
//    public static String nameEdison = "edison";
//    public static double tire1currentEdison = 0.13;
//    public static double tire2currentEdison = 0.16;
//    public static double tire3currentEdison = 0.27;
//    public static double tire4currentEdison = 0.31;
//    public static double tire5currentEdison = 0.31;
//    public static double tire1rateEdison = 0.13;
//    public static double tire2rateEdison = 0.16;
//    public static double tire3rateEdison = 0.29;
//    public static double tire4rateEdison = 0.35;
//    public static double tire5rateEdison = 0.35;
//
//    public static String nameLAPowerZone1 = "LAPowerZone1";
//    public static double tire1currentLAPowerZone1 = 0.14;
//    public static double tire2currentLAPowerZone1 = 0.18;
//    public static double tire3currentLAPowerZone1 = 0.2;
//    public static double tire4currentLAPowerZone1 = 0.2;
//    public static double tire5currentLAPowerZone1 = 0.2;
//    public static double tire1rateLAPowerZone1 = 0.15;
//    public static double tire2rateLAPowerZone1 = 0.18;
//    public static double tire3rateLAPowerZone1 = 0.22;
//    public static double tire4rateLAPowerZone1 = 0.22;
//    public static double tire5rateLAPowerZone1 = 0.22;
//
//    public static String nameLAPowerZone2 = "LAPowerZone2";
//    public static double tire1currentLAPowerZone2 = 0.14;
//    public static double tire2currentLAPowerZone2 = 0.18;
//    public static double tire3currentLAPowerZone2 = 0.2;
//    public static double tire4currentLAPowerZone2 = 0.2;
//    public static double tire5currentLAPowerZone2 = 0.2;
//    public static double tire1rateLAPowerZone2 = 0.15;
//    public static double tire2rateLAPowerZone2 = 0.18;
//    public static double tire3rateLAPowerZone2 = 0.22;
//    public static double tire4rateLAPowerZone2 = 0.22;
//    public static double tire5rateLAPowerZone2 = 0.22;
//
//    public static String nameRiverside = "Riverside";
//    public static double tire1currentRiverside = 0.14;
//    public static double tire2currentRiverside = 0.21;
//    public static double tire3currentRiverside = 0.21;
//    public static double tire4currentRiverside = 0.21;
//    public static double tire5currentRiverside = 0.21;
//    public static double tire1rateRiverside = 0.14;
//    public static double tire2rateRiverside = 0.22;
//    public static double tire3rateRiverside = 0.22;
//    public static double tire4rateRiverside = 0.23;
//    public static double tire5rateRiverside = 0.23;
//
//    public static String nameSanFranciscoPub = "SanFranciscoPub";
//    public static double tire1currentSanFranciscoPub = 0.11;
//    public static double tire2currentSanFranciscoPub = 0.13;
//    public static double tire3currentSanFranciscoPub = 0.27;
//    public static double tire4currentSanFranciscoPub = 0.27;
//    public static double tire5currentSanFranciscoPub = 0.27;
//    public static double tire1rateSanFranciscoPub = 0.12;
//    public static double tire2rateSanFranciscoPub = 0.13;
//    public static double tire3rateSanFranciscoPub = 0.27;
//    public static double tire4rateSanFranciscoPub = 0.27;
//    public static double tire5rateSanFranciscoPub = 0.27;
//
//    public static String nameSanDiego = "SanDiego";
//    public static double tire1currentSanDiego = 0.17;
//    public static double tire2currentSanDiego = 0.20;
//    public static double tire3currentSanDiego = 0.38;
//    public static double tire4currentSanDiego = 0.40;
//    public static double tire5currentSanDiego = 0.42;
//    public static double tire1rateSanDiego = 0.18;
//    public static double tire2rateSanDiego = 0.21;
//    public static double tire3rateSanDiego = 0.40;
//    public static double tire4rateSanDiego = 0.43;
//    public static double tire5rateSanDiego = 0.47;
    public DataUtilityDistrict getUtilityDistrict(String dist) {
        DataUtilityDistrict dud = new DataUtilityDistrict();
        switch (dist) {
            case "SMUD":
                dud.name = "Smud";
                dud.tire1current = 0.1;
                dud.tire2current = 0.19;
                dud.tire3current = 0.19;
                dud.tire4current = 0.19;
                dud.tire5current = 0.19;
                dud.tire1rate = 0.1;
                dud.tire2rate = 0.21;
                dud.tire3rate = 0.21;
                dud.tire4rate = 0.21;
                dud.tire5rate = 0.21;
                break;

            case "Roseville":
                dud.name = "Roseville";
                dud.tire1current = 0.11;
                dud.tire2current = 0.15;
                dud.tire3current = 0.17;
                dud.tire4current = 0.17;
                dud.tire5current = 0.17;
                dud.tire1rate = 0.11;
                dud.tire2rate = 0.16;
                dud.tire3rate = 0.19;
                dud.tire4rate = 0.19;
                dud.tire5rate = 0.19;
                break;

            case "Edison":
                dud.name = "Edison";
                dud.tire1current = 0.13;
                dud.tire2current = 0.16;
                dud.tire3current = 0.27;
                dud.tire4current = 0.31;
                dud.tire5current = 0.31;
                dud.tire1rate = 0.13;
                dud.tire2rate = 0.16;
                dud.tire3rate = 0.29;
                dud.tire4rate = 0.35;
                dud.tire5rate = 0.35;
                break;

            case "LA Power - Zone 1":
                dud.name = "LA Power - Zone 1";
                dud.tire1current = 0.14;
                dud.tire2current = 0.18;
                dud.tire3current = 0.20;
                dud.tire4current = 0.20;
                dud.tire5current = 0.20;
                dud.tire1rate = 0.15;
                dud.tire2rate = 0.18;
                dud.tire3rate = 0.22;
                dud.tire4rate = 0.22;
                dud.tire5rate = 0.22;
                break;

            case "LA Power - Zone 2":
                dud.name = "LA Power - Zone 2";
                dud.tire1current = 0.14;
                dud.tire2current = 0.18;
                dud.tire3current = 0.20;
                dud.tire4current = 0.20;
                dud.tire5current = 0.20;
                dud.tire1rate = 0.15;
                dud.tire2rate = 0.18;
                dud.tire3rate = 0.22;
                dud.tire4rate = 0.22;
                dud.tire5rate = 0.22;
                break;

            case "Riverside":
                dud.name = "Riverside";
                dud.tire1current = 0.14;
                dud.tire2current = 0.21;
                dud.tire3current = 0.21;
                dud.tire4current = 0.21;
                dud.tire5current = 0.21;
                dud.tire1rate = 0.14;
                dud.tire2rate = 0.22;
                dud.tire3rate = 0.22;
                dud.tire4rate = 0.23;
                dud.tire5rate = 0.23;
                break;

            case "San Francisco Pub.":
                dud.name = "San Francisco Pub.";
                dud.tire1current = 0.11;
                dud.tire2current = 0.13;
                dud.tire3current = 0.27;
                dud.tire4current = 0.27;
                dud.tire5current = 0.27;
                dud.tire1rate = 0.12;
                dud.tire2rate = 0.14;
                dud.tire3rate = 0.28;
                dud.tire4rate = 0.29;
                dud.tire5rate = 0.29;
                break;

            case "San Diego":
                dud.name = "San Diego";
                dud.tire1current = 0.17;
                dud.tire2current = 0.20;
                dud.tire3current = 0.38;
                dud.tire4current = 0.40;
                dud.tire5current = 0.42;
                dud.tire1rate = 0.18;
                dud.tire2rate = 0.21;
                dud.tire3rate = 0.40;
                dud.tire4rate = 0.43;
                dud.tire5rate = 0.47;
                break;
        }

        return dud;
    }

    private class DataUtilityDistrict {

        public String name = "";
        public double tire1current = 0;
        public double tire2current = 0;
        public double tire3current = 0;
        public double tire4current = 0;
        public double tire5current = 0;
        public double tire1rate = 0;
        public double tire2rate = 0;
        public double tire3rate = 0;
        public double tire4rate = 0;
        public double tire5rate = 0;

    }

}
