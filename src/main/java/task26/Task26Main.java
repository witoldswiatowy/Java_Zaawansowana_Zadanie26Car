package task26;

import java.util.List;

public class Task26Main {
    public static void main(String[] args) {

        Car punto1 = new Car("Fiat Punto v.1", "Pierwsza wersja tego modelu", CarType.SEDAN);
        Car punto2 = new Car("Fiat Punto v.2", "Druga wersja tego modelu", CarType.HATCHBACK);
        Car mondeo1 = new Car("Seat mondeo v.1", "Pierwsza wersja tego modelu", CarType.HATCHBACK);
        Car mondeo2 = new Car("Seat mondeo v.1", "Druga wersja tego modelu", CarType.SEDAN);
        Car dwiescie6 = new Car("dwiescie6", "dwiescie6 tmp opis", CarType.CABRIO);
        Car maluch1 = new Car("maluch1", "maluch1 tmp opis", CarType.SEDAN);
        Car mustangV8 = new Car("mustangV8", "mustangV8 tmp opis", CarType.CABRIO);
        Car gieleska = new Car("gieleska", "gieleska tmp opis", CarType.CABRIO);
        Car gieleska2 = new Car("gieleska2", "gieleska2 tmp opis", CarType.SEDAN);
        Car tmpVolvo = new Car("tmpVolvo", "tmpVolvo tmp opis", CarType.HATCHBACK);

        Model punto = new Model("Punto", 2020, List.of(punto1, punto2));
        Model mondeo = new Model("Mondeo", 2001, List.of(mondeo1, mondeo2));
        Model dwiescieSzostka = new Model("206", 2005, List.of(dwiescie6));
        Model maluch = new Model("126p", 1961, List.of(maluch1));
        Model mustang = new Model("Munstang", 1980, List.of(mustangV8));
        Model gls = new Model("Gls", 2015, List.of(gieleska, gieleska2));
        Model volvoModel = new Model("jakis", 2020, List.of(tmpVolvo));

        Manufacturer benz = new Manufacturer("Benz", 1883, List.of(gls));
        Manufacturer mercedes = new Manufacturer("Mercedes", 1901, List.of(gls));
        Manufacturer volvo = new Manufacturer("Volvo", 1926, List.of(volvoModel));
        Manufacturer fiat = new Manufacturer("Fiat", 1899, List.of(punto, maluch, mustang));
        Manufacturer peogeot = new Manufacturer("Peogeot", 1906, List.of(dwiescieSzostka));
        Manufacturer seat = new Manufacturer("Seat", 1904, List.of(mondeo));

        List<Manufacturer> manufacturerList = List.of(benz, mercedes, volvo, fiat, peogeot, seat);

        System.out.println("-----Wywołanie metody showAllModel------");
        System.out.println(Task26Methode.showAllModel(manufacturerList));
        System.out.println("-----Wywołanie metody showAllCar------");
        System.out.println(Task26Methode.showAllCar(manufacturerList));
        System.out.println("-----Wywołanie metody getAllManufacturerName------");
        System.out.println(Task26Methode.getAllManufacturerName(manufacturerList));
        System.out.println("-----Wywołanie metody getAllManufacturerYearOfCreation------");
        System.out.println(Task26Methode.getAllManufacturerYearOfCreation(manufacturerList));
        System.out.println("-----Wywołanie metody getAllModelName------");
        System.out.println(Task26Methode.getAllModelName(manufacturerList));
        System.out.println("-----Wywołanie metody getAllModelProductionStartYear------");
        System.out.println(Task26Methode.getAllModelProductionStartYear(manufacturerList));
        System.out.println("-----Wywołanie metody getAllCarName------");
        System.out.println(Task26Methode.getAllCarName(manufacturerList));
        System.out.println("-----Wywołanie metody getAllCarDiscription------");
        System.out.println(Task26Methode.getAllCarDiscription(manufacturerList));
        System.out.println("-----Wywołanie metody showAllModelWithEvenYears------");
        System.out.println(Task26Methode.showAllModelWithEvenYears(manufacturerList));
        System.out.println("-----Wywołanie metody getCarFromManufacturerWithEvenFoundingYear------");
        System.out.println(Task26Methode.getCarFromManufacturerWithEvenFoundingYear(manufacturerList));
        System.out.println("-----Wywołanie metody getCarWithEvenProductionStartYearAndNotEvenFoundingYearOfManufacturer------");
        System.out.println(Task26Methode.getCarWithEvenProductionStartYearAndNotEvenFoundingYearOfManufacturer(manufacturerList));
        System.out.println("-----Wywołanie metody getCabrioCarWithNotEvenProductionStartYearAndEvenFoundingYearOfManufacturer------");
        System.out.println(Task26Methode.getCabrioCarWithNotEvenProductionStartYearAndEvenFoundingYearOfManufacturer(manufacturerList));
        System.out.println("-----Wywołanie metody getSedanCarWithProductionStartYearAfterThan2019AndManufacturerOldestTan1919------");
        System.out.println(Task26Methode.getSedanCarWithProductionStartYearAfterThan2019AndManufacturerOldestTan1919(manufacturerList));




    }
}
