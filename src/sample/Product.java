package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Product{

    private String name;
    private double price;
    private int id;
    
    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return this.id + ". " + this.name + " " + String.format("%.2f", this.price);
    }

}
