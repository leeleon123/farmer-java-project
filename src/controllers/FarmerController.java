package controllers;
import model.Farmer;
import java.util.ArrayList;

public class FarmerController {
    private ArrayList<Farmer> farmerList = new ArrayList<>();

    public void addFarmer(Farmer farmer) {
        farmerList.add(farmer);
        System.out.println("Farmer added successfully.");
    }

    public ArrayList<Farmer> getFarmers() {
        return farmerList;
    }
}
