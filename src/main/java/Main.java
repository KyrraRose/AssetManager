import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> allAssets = new ArrayList<>();
        Asset myHouse = new House("Tent in the Woods","10/28/2025",425,"100 Woods Lane, Cooks Forest PA 14935",1,45,1000);
        allAssets.add(myHouse);
        Asset hauntedHouse = new House ("Bleasdale Farmhouse","10/31/1990",0,"134 Bleasdale Drive, Phasmophobia, Pa 15101",3,3000,150);
        allAssets.add(hauntedHouse);
        Asset myCar = new Vehicle("SheRa","11/10/2019",17000,"Toyota Corolla",2018,74000);
        allAssets.add(myCar);
        Asset newCar = new Vehicle("Going Camping","10/28/2025",30000,"Subaru Outback",2025,100);
        allAssets.add(newCar);
        System.out.println("All Assets");
        System.out.println();
        String d = "$";

        for (Asset asset : allAssets) {
            if (asset instanceof House) {
                System.out.printf("House:  %-47s |%-20s | %-13s |%4s%-10.2f | %10d sq. ft. | %10d sq. ft. lot |\n", ((House) asset).getAddress(),asset.getDescription(),asset.getDateAcquired(),d,asset.getValue(),((House) asset).getSquareFoot(),((House) asset).getLotSize());

            } else if (asset instanceof Vehicle) {
                System.out.printf("Vehicle:  %-15s | %-10s | %d | %-10s | %4s%-10.2f | %6d miles |\n",asset.getDescription(),((Vehicle) asset).getMakeModel(),((Vehicle) asset).getYear(),asset.getDateAcquired(),d,asset.getValue(),((Vehicle) asset).getOdometer());

            }


            System.out.println();
        }
    }
}
