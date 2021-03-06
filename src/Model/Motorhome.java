package Model;//Magnus Svendsen DAT16i

import java.time.LocalDate;
import java.util.ArrayList;

public class Motorhome
{
    public static ArrayList<Motorhome> allMotorhomes = new ArrayList<>();

    String motorhomeID;
    String model;
    String brand;
    String size;
    boolean rentedStatus = false;
    boolean serviceStatus = false;
    float pricePerDay;
    String dateOfCheck;

    public Motorhome(String model, String brand, String size, float pricePerDay)
    {
        this.model = model;
        this.brand = brand;
        this.size = size;
        this.pricePerDay = pricePerDay;
        this.motorhomeID = generateID();
    }

    private String generateID()
    {
        //logic for generating unique id goes here
        int val = Motorhome.allMotorhomes.size();
        return val + "";
    }

    public String getMotorhomeID()
    {
        return motorhomeID;
    }

    public void setMotorhomeID(String motorhomeID)
    {
        this.motorhomeID = motorhomeID;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public boolean isRentedStatus()
    {
        return rentedStatus;
    }

    public void setRentedStatus(boolean rentedStatus)
    {
        this.rentedStatus = rentedStatus;
    }

    public boolean isServiceStatus()
    {
        return serviceStatus;
    }

    public void setServiceStatus(boolean serviceStatus)
    {
        this.serviceStatus = serviceStatus;
    }

    public String getStatus()
    {
        if (this.isServiceStatus())
            return "Out of service";
        else if (this.isRentedStatus())
            return "Rented";
        else
            return "Available";
    }

    public String getDateOfCheck()
    {
        if (dateOfCheck == null)
        {
            return "";
        }
        else
        {
            return dateOfCheck;
        }
    }

    public void setDateOfCheck(LocalDate localDate)
    {
        this.dateOfCheck = localDate.toString();
    }

    public float getPricePerDay()
    {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay)
    {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString()
    {
        return this.getModel();
    }
}
