package task26;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Car {
    public String name;
    public String description;
    public CarType carType;

    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", carType=" + carType +
                '}';
    }

    public static String showName(List<Car>carList){
        return carList.stream()
                .map(n -> n.getName())
                .collect(Collectors.joining(", "));
    }
}
