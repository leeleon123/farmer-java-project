package model;

public class Farmer {
    private String farmerId;
    private String name;
    private String specialization;
    private String certification;
    private double farmSize;

    public Farmer(String farmerId, String name, String specialization, String certification, double farmSize) {
        this.farmerId = farmerId;
        this.name = name;
        this.specialization = specialization;
        this.certification = certification;
        this.farmSize = farmSize;
    }
    public String getFarmerDetails(){
        return "ID: " + farmerId + ", Name: " + name
                + ", Specialization: " + specialization
                + ", Certification: " + certification
                + ", Farm Size: " + farmSize + " acres";

    }


    }

