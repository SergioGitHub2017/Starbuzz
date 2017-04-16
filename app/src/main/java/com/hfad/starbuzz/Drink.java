/**
 * Created by Admin on 15.04.2017.
 */
package com.hfad.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //drinks - массив с лементами Drink
    public static final Drink[] drinks ={
      new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
      new Drink("Cappuccino", "Espresso, hot milkm and a steamed milk foam", R.drawable.cappuccino),
      new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    // для каждого напитка хранится имя, описание и ресурс изображения
    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    // методы Get-ры для приватных переменных
    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }

}
