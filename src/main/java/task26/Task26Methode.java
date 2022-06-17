package task26;

import java.util.List;
import java.util.stream.Collectors;

public class Task26Methode {

    public static List<Model> showAllModel(List<Manufacturer> manufacturerList) {
        return manufacturerList.stream()
                .flatMap(m -> m.getModels().stream())
                .collect(Collectors.toList());
    }

    public static List<Car> showAllCar(List<Manufacturer> manufacturerList) {
        return manufacturerList.stream()
                .flatMap(m -> m.getModels().stream())
                .flatMap(c -> c.getCars().stream())
                .collect(Collectors.toList());
    }

    public static List<String> getAllManufacturerName(List<Manufacturer> manufacturerList) {
        return manufacturerList.stream()
                .map(Manufacturer::getName)
                .collect(Collectors.toList());
    }

    public static List<Integer> getAllManufacturerYearOfCreation(List<Manufacturer> manufacturerList) {
        return manufacturerList.stream()
                .map(y -> y.getYearOfCreation())
                .collect(Collectors.toList());
    }

    public static List<String> getAllModelName(List<Manufacturer> manufacturerList) {
        return manufacturerList.stream()
                .flatMap(m -> m.getModels().stream())
                .map(n -> n.getName())
                .collect(Collectors.toList());
    }
    public static List<Integer> getAllModelProductionStartYear(List<Manufacturer> manufacturerList) {
        return manufacturerList.stream()
                .flatMap(m -> m.getModels().stream())
                .map(n -> n.getProductionStartYear())
                .collect(Collectors.toList());
    }
    
    public static List<String> getAllCarName (List<Manufacturer> manufacturerList){
        return manufacturerList.stream()
                .flatMap(m -> m.getModels().stream())
                .flatMap(c -> c.getCars().stream())
                .map(n -> n.getName())
                .collect(Collectors.toList());
    }

    public static List<String> getAllCarDiscription (List<Manufacturer> manufacturerList){
        return manufacturerList.stream()
                .flatMap(m -> m.getModels().stream())
                .flatMap(c -> c.getCars().stream())
                .map(n -> n.getDescription())
                .collect(Collectors.toList());
    }

    public static List<Model> showAllModelWithEvenYears (List<Manufacturer>manufacturerList){
        return manufacturerList.stream()
                .flatMap(m -> m.getModels().stream())
                .filter(y -> y.getProductionStartYear() % 2 == 0)
                .collect(Collectors.toList());
    }

    //tylko auta producentów z parzystym rokiem założenia,
    public static List<Car> getCarFromManufacturerWithEvenFoundingYear (List<Manufacturer>manufacturerList){
        return manufacturerList.stream()
                .filter(y -> y.getYearOfCreation() % 2 == 0)
                .flatMap(m -> m.getModels().stream())
                .flatMap(c -> c.getCars().stream())
                .collect(Collectors.toList());
    }

    //11. tylko auta z parzystym rokiem startu produkcji modelu oraz nieparzystym rokiem założenia producenta,
    public static List<Car> getCarWithEvenProductionStartYearAndNotEvenFoundingYearOfManufacturer(List<Manufacturer>manufacturerList){
        return manufacturerList.stream()
                .filter(y -> y.getYearOfCreation() % 2 != 0)
                .flatMap(m -> m.getModels().stream())
                .filter(y -> y.getProductionStartYear() % 2 == 0)
                .flatMap(c -> c.getCars().stream())
                .collect(Collectors.toList());
    }

    //tylko auta typu CABRIO z nieparzystym rokiem startu produkcji modelu i parzystym rokiem założenia producenta,
    public static List<Car> getCabrioCarWithNotEvenProductionStartYearAndEvenFoundingYearOfManufacturer (List<Manufacturer>manufacturerList){
        return manufacturerList.stream()
                .filter(y -> y.getYearOfCreation() % 2 == 0)
                .flatMap(m -> m.getModels().stream())
                .filter(y -> y.getProductionStartYear() % 2 != 0)
                .flatMap(c -> c.getCars().stream())
                .filter(t -> t.getCarType().equals(CarType.CABRIO))
                .collect(Collectors.toList());
    }

    //tylko auta typu SEDAN z modelu nowszego niż 2019 oraz rokiem założenia producenta mniejszym niż 1919
    public static List<Car> getSedanCarWithProductionStartYearAfterThan2019AndManufacturerOldestTan1919 (List<Manufacturer> manufacturerList){
        return manufacturerList.stream()
                .filter(y -> y.getYearOfCreation() < 1919)
                .flatMap(m -> m.getModels().stream())
                .filter(y -> y.getProductionStartYear() > 2019)
                .flatMap(c -> c.getCars().stream())
                .filter(t -> t.getCarType().equals(CarType.SEDAN))
                .collect(Collectors.toList());
    }

}
