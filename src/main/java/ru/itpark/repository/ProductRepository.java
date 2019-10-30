package ru.itpark.repository;

import ru.itpark.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products = new ArrayList<>();
    private int nextId = 1;

    public void save (Product item) {
        if (item.getId() == 0) {
            item.setId(nextId++);
        }
        products.add(item);
    }

    public List<Product> getAll() {
        return products;
    }
}
