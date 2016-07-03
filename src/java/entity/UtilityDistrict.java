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

    public DataUtilityDistrict getUtilityDistrict(String dist) {
        DataUtilityDistrict dud = new DataUtilityDistrict();
        switch (dist) {
            case "PGE":
                dud.name = "PGE";
                dud.tire1current = 0.18;
                dud.tire2current = 0.18;
                dud.tire3current = 0.25;
                dud.tire4current = 0.34;
                dud.tire5current = 0.34;
                dud.tire1kw = 409;
                dud.tire2kw = 123;
                dud.tire3kw = 286;
                dud.tire4kw = 432;
                dud.tire5kw = 99999;
                dud.tire1increase = 0;
                dud.tire2increase = 0.0074;
                dud.tire3increase = 0.0615;
                dud.tire4increase = 0.1117;
                dud.tire5increase = 0.1117;
                break;

            case "SMUD":
                dud.tire1current = 0.10;
                dud.tire2current = 0.19;
                dud.tire3current = 0.19;
                dud.tire4current = 0.19;
                dud.tire5current = 0.19;
                dud.tire1kw = 660;
                dud.tire2kw = 10;
                dud.tire3kw = 250;
                dud.tire4kw = 250;
                dud.tire5kw = 99999;
                dud.tire1increase = 0;
                dud.tire2increase = 0.1;
                dud.tire3increase = 0.1;
                dud.tire4increase = 0.1;
                dud.tire5increase = 0.1;
                break;

            case "Roseville":
                dud.tire1current = 0.11;
                dud.tire2current = 0.15;
                dud.tire3current = 0.17;
                dud.tire4current = 0.17;
                dud.tire5current = 0.17;
                dud.tire1kw = 500;
                dud.tire2kw = 500;
                dud.tire3kw = 100;
                dud.tire4kw = 100;
                dud.tire5kw = 99999;
                dud.tire1increase = 0;
                dud.tire2increase = 0.08;
                dud.tire3increase = 0.1;
                dud.tire4increase = 0.1;
                dud.tire5increase = 0.1;
                break;

            case "Edison":
                dud.name = "Edison";
                dud.tire1current = 0.13;
                dud.tire2current = 0.16;
                dud.tire3current = 0.27;
                dud.tire4current = 0.31;
                dud.tire5current = 0.31;
                dud.tire1kw = 600;
                dud.tire2kw = 250;
                dud.tire3kw = 400;
                dud.tire4kw = 400;
                dud.tire5kw = 99999;
                dud.tire1increase = 0;
                dud.tire2increase = 0.02;
                dud.tire3increase = 0.068;
                dud.tire4increase = 0.114;
                dud.tire5increase = 0.138;
                break;

            case "LA Power - Zone 1":
                dud.name = "LA Power - Zone 1";
                dud.tire1current = 0.14;
                dud.tire2current = 0.18;
                dud.tire3current = 0.20;
                dud.tire4current = 0.20;
                dud.tire5current = 0.20;
                dud.tire1kw = 350;
                dud.tire2kw = 750;
                dud.tire3kw = 1050;
                dud.tire4kw = 1050;
                dud.tire5kw = 99999;
                dud.tire1increase = 0.02;
                dud.tire2increase = 0.04;
                dud.tire3increase = 0.06;
                dud.tire4increase = 0.08;
                dud.tire5increase = 0.1;
                break;

            case "LA Power - Zone 2":
                dud.name = "LA Power - Zone 2";
                dud.tire1current = 0.14;
                dud.tire2current = 0.18;
                dud.tire3current = 0.20;
                dud.tire4current = 0.20;
                dud.tire5current = 0.20;
                dud.tire1kw = 500;
                dud.tire2kw = 1000;
                dud.tire3kw = 1500;
                dud.tire4kw = 1500;
                dud.tire5kw = 99999;
                dud.tire1increase = 0.02;
                dud.tire2increase = 0.04;
                dud.tire3increase = 0.06;
                dud.tire4increase = 0.08;
                dud.tire5increase = 0.1;
                break;

            case "Riverside":
                dud.name = "Riverside";
                dud.tire1current = 0.14;
                dud.tire2current = 0.21;
                dud.tire3current = 0.21;
                dud.tire4current = 0.21;
                dud.tire5current = 0.21;
                dud.tire1kw = 500;
                dud.tire2kw = 1000;
                dud.tire3kw = 1500;
                dud.tire4kw = 1500;
                dud.tire5kw = 99999;
                dud.tire1increase = 0.02;
                dud.tire2increase = 0.04;
                dud.tire3increase = 0.06;
                dud.tire4increase = 0.08;
                dud.tire5increase = 0.1;
                break;

            case "San Francisco Pub.":
                dud.name = "San Francisco Pub.";
                dud.tire1current = 0.11;
                dud.tire2current = 0.13;
                dud.tire3current = 0.27;
                dud.tire4current = 0.27;
                dud.tire5current = 0.27;
                dud.tire1kw = 278;
                dud.tire2kw = 83;
                dud.tire3kw = 1000;
                dud.tire4kw = 1000;
                dud.tire5kw = 99999;
                dud.tire1increase = 0.02;
                dud.tire2increase = 0.04;
                dud.tire3increase = 0.06;
                dud.tire4increase = 0.08;
                dud.tire5increase = 0.1;
                break;

            case "San Diego":
                dud.name = "San Diego";
                dud.tire1current = 0.17;
                dud.tire2current = 0.20;
                dud.tire3current = 0.38;
                dud.tire4current = 0.40;
                dud.tire5current = 0.42;
                dud.tire1kw = 336;
                dud.tire2kw = 100;
                dud.tire3kw = 236;
                dud.tire4kw = 1000;
                dud.tire5kw = 99999;
                dud.tire1increase = 0.02;
                dud.tire2increase = 0.04;
                dud.tire3increase = 0.06;
                dud.tire4increase = 0.08;
                dud.tire5increase = 0.1;
                break;

            case "Select":
                dud.name = "Select";
                dud.tire1current = 0;
                dud.tire2current = 0;
                dud.tire3current = 0;
                dud.tire4current = 0;
                dud.tire5current = 0;
                dud.tire1kw = 0;
                dud.tire2kw = 0;
                dud.tire3kw = 0;
                dud.tire4kw = 0;
                dud.tire5kw = 0;
                dud.tire1increase = 0;
                dud.tire2increase = 0;
                dud.tire3increase = 0;
                dud.tire4increase = 0;
                dud.tire5increase = 0;
                break;
        }

        return dud;
    }

}
