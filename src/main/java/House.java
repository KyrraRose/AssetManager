public class House extends Asset {
     private String address;
     private int condition ,squareFoot ,lotSize;
    //(1 -excellent, 2 -good, 3 -fair, 4 -poor)

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double valueSQFT = 0;
        switch (getCondition()){
            case 1:
                valueSQFT = 180;
                break;
            case 2:
                valueSQFT = 130;
                break;
            case 3:
                valueSQFT = 90;
                break;
            case 4:
                valueSQFT = 80;
                break;

        }
        return (valueSQFT*getSquareFoot())+(getLotSize()*.25);
        /**
         * / A house's value is determined as
         * // $180.00 per square foot (excellent)
         * // $130.00 per square foot (good)
         * // $90.00 per square foot (fair)
         * // $80.00 per square foot (poor)
         * // PLUS 25 cents per square foot of lot size
         */
    }
}
