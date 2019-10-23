package ru.itpark;

import ru.itpark.model.*;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final ProductService service = new ProductService(new ProductRepository());

        service.add(new SmartPhone(0, "Iphone", 50_000, SmartPhone.SmartphoneType.MONOBLOCK, SmartPhone.MaterialOfCase.METAL, SmartPhone.SimCardType.NANO, SmartPhone.OperationSystem.IOS));
        service.add(new SmartPhone(0, "Alcatel", 10_000, SmartPhone.SmartphoneType.SLIDER, SmartPhone.MaterialOfCase.PLASTIC, SmartPhone.SimCardType.MICRO, SmartPhone.OperationSystem.ANDROID));
        service.add(new Pot(0, "Pot1", 150, Pot.Color.BLACK));
        service.add(new Pot(0, "Iphone", 200, Pot.Color.CYAN));
        service.add(new Computer(0, "Dell", 500, Computer.CPUType.INTEL, 16, Computer.OperationSystemType.WINDOWS));
        service.add(new Computer(0, "HP", 600, Computer.CPUType.AMD, 32, Computer.OperationSystemType.LINUX));
        service.add(new TShirt(0, "T-shirt1", 50, 48, TShirt.Color.WHITE, TShirt.Material.COTTON));
        service.add(new TShirt(0, "T-shirt2", 55, 46, TShirt.Color.OTHER, TShirt.Material.VISCOSE));
        service.add(new TV(0, "Hitachi", 350, 51, TV.Color.WHITE, TV.DigitalTelevisionStandard.DVB_T2));
        service.add(new TV(0, "Sony", 850, 72, TV.Color.BLACK, TV.DigitalTelevisionStandard.DVB_S));

        System.out.println(service.searchByName("IPHONE"));
        System.out.println(service.searchByCategory("tv"));
        List<Product> test = service.getRepository().getAll();
        List<Product> sorted = service.getAlphabeticallySortedByName(false);
        test.forEach(System.out::println);
        System.out.println(service.deleteById(2, sorted));
        sorted.forEach(System.out::println);
        System.out.println(service.pagingListItems(test, 5));
        System.out.println(service.pagingListItems(test, 5));
        System.out.println(service.pagingListItems(test, 5));
        System.out.println(service.pagingListItems(test, 5));
        System.out.println(service.pagingListItems(test, 5));
    }
}
