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

        for (Asset asset : allAssets) {
            if (asset instanceof House) {
                System.out.println("This is a house");
                System.out.printf("%s|%s|%s|$%.2f|");

            } else if (vehicle instanceof Moped) {
                System.out.println("MOPED TYPE OF VEHICLE");
            }

            System.out.println(vehicle);
            System.out.println();
        }
    }
}
