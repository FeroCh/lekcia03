package com.engeto.vozovy_park;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cars {
    LocalDate dateOfExpiry = LocalDate.now().minusMonths(11);
    List<Car> cars = new ArrayList<>();

        public void addCars(Car newCar){ cars.add(newCar);
        }

        public void printCars(){
            for (Car car : cars)
                System.out.println(car);
        }


        public void technicalCheck(){
              for (Car car2 : cars) {
                  if (car2.getLastTechnicalCheck().isBefore(dateOfExpiry)){
                      System.out.println(car2);
                  }
              }
        }
}
