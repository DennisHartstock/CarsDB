package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.carsdb.data.DatabaseHandler;
import com.example.carsdb.model.Car;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        Log.d("CarsCount", String.valueOf(databaseHandler.getCarsCount()));

        /*databaseHandler.addCar(new Car("Toyota", "30 000 $"));
        databaseHandler.addCar(new Car("Opel", "25 000 $"));
        databaseHandler.addCar(new Car("Mercedes", "50 000 $"));
        databaseHandler.addCar(new Car("Kia", "28 000 $"));
        databaseHandler.addCar(new Car("Mazda", "30 000 $"));
        databaseHandler.addCar(new Car("Honda", "25 000 $"));
        databaseHandler.addCar(new Car("Skoda", "50 000 $"));
        databaseHandler.addCar(new Car("Hyundai", "28 000 $"));*/

        List<Car> carsList = databaseHandler.getAllCars();

        /*Car deletingCar = databaseHandler.getCar(7);

        databaseHandler.deleteCar(deletingCar);*/
        
        for (Car car : carsList) {
            Log.d("CarInfo: ", "ID " + car.getId() + ", Name " + car.getName() + ", Price " + car.getPrice());
        }





        /*car.setName("Tesla");
        car.setPrice("70 000 $");

        int updatedCarID = databaseHandler.updateCar(car);

        Log.d("CarInfo: ", "ID " + car.getId() + ", Name " + car.getName() + ", Price " + car.getPrice() + ", updatedCarID " + updatedCarID);*/
    }

}