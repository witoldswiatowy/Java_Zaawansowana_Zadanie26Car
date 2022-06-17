package task26;

import lombok.Getter;

import java.util.List;

@Getter
public class Model {
    public String name;
    public int productionStartYear;
     List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "\nModel{" +
                "name='" + name + '\'' +
                ", productionStartYear=" + productionStartYear +
                ", cars=" + Car.showName(cars) +
                '}';
    }
}

