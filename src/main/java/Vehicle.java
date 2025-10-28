import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year, odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = 0, reduction = 1;
        int yearsOld = LocalDate.now().getYear()-getYear();

        switch (yearsOld){
            case 0,1,2,3:
                value = super.getValue()-(super.getValue()*(.03*yearsOld));
                break;
            case 4,5,6:
                value = super.getValue()-(super.getValue()*(.06*yearsOld));
                break;
            case 7,8,9,10:
                value = super.getValue()-(super.getValue()*(.08*yearsOld));
                break;
            default:
                value = 1000;
        }
       if (getOdometer()>100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")){
           reduction = .75; //we're returning 75% of the cost
       }
        return value*reduction;
    }
}
