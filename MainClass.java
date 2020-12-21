/*********************************************************************************
 * AUTHOR     : AJAO HAZZAN                                                      *
 * ============================================================================  *
 * PROFESSION : Java Software Engineer and Hardware Engineer.                    *
 *                                                                               *
 * PROJECT    : This project was developed to model Automobile manufacturing     *
 *              company production information                                   *
 * DESCRIPTION: This project covers headquarter's information,branch information *
 *              and manufacturing information by following clean code principles *
 *********************************************************************************/

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Audi audi = new Audi();
        Bentley bentley = new Bentley();
        Bmw bmw = new Bmw();
        Mercedes mercedes = new Mercedes();
        Rollsroys rollsroys = new Rollsroys();
        Toyota toyota = new Toyota();
        Volkswagen volkswagen = new Volkswagen();

        Scanner scanner = new Scanner(System.in);
        System.out.println("To Access HeadQuarter Information, Enter :1");
        int input = scanner.nextInt();
        int input2 = 1;
        if (input == input2) {
            audi.produceHeadQuarterInformation();
            System.out.println("==================================");
        } else {
            System.out.println("Sorry Wrong Pin, Access Denied !!!");
        }

        System.out.println("To Access Branch Information, Enter :2");
        int input3 = scanner.nextInt();
        int input4 = 2;
        if (input3 == input4) {
            audi.produceBranchInformation();
            System.out.println("==================================");
        } else {
            System.out.println("Sorry Wrong Pin, Access Denied !!!");
        }
        System.out.println("To Access Manufacturing  Information, Enter :3");
        int input5 = scanner.nextInt();
        int input6 = 3;
        if (input5 == input6) {
            audi.produceManufacturingInformation();
            System.out.println("==================================");
        } else {
            System.out.println("Sorry Access Denied ");
        }
        VehicleProductionCompany V1 = new Audi();
        VehicleProductionCompany V2 = new Bentley();
        VehicleProductionCompany V3 = new Mercedes();
        VehicleProductionCompany V4 = new Rollsroys();
        VehicleProductionCompany V5 = new Toyota();
        VehicleProductionCompany V6 = new Volkswagen();

        List<VehicleProductionCompany> vehicleProductionCompanies = new ArrayList<>();
        vehicleProductionCompanies.add(V1);
        vehicleProductionCompanies.add(V2);
        vehicleProductionCompanies.add(V3);
        vehicleProductionCompanies.add(V4);
        vehicleProductionCompanies.add(V5);
        vehicleProductionCompanies.add(V6);

    }
}

