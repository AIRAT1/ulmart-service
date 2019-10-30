package ru.itpark.service;

import ru.itpark.model.Product;
import ru.itpark.repository.ProductRepository;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public void add(Product item) {
        if (item.getId() != 0) {
            throw new IllegalArgumentException("id must be zero!");
        }
        if (item.getPrice() <= 0) {
            throw new IllegalArgumentException("price must be greater as zero");
        }
        repository.save(item);
    }

    private void alphabeticallySortByName(List<Product> result) {
        result.sort(Comparator.comparing(Product::getName));
    }

    private void reverseSortByName(List<Product> result) {
        result.sort(Comparator.comparing(Product::getName).reversed());
    }

    public List<Product> searchByName(String name) {
        List<Product> result = repository.getAll().stream().filter(x -> name.equalsIgnoreCase(x.getName())).collect(Collectors.toList());
        alphabeticallySortByName(result);
        return result;
    }

    public List<Product> searchByCategory(String className) {
        List<Product> result = repository.getAll().stream().filter(x -> className.equalsIgnoreCase(x.getClass().getSimpleName())).collect(Collectors.toList());
        alphabeticallySortByName(result);
        return result;
    }

    public boolean deleteById(int id, List<Product> products) {
        return products.removeIf(x -> x.getId() == id);
    }

    public List<Product> getSortedByPrice() {
        List<Product> result = new ArrayList<>(repository.getAll());
        result.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
        return result;
    }

    /**
     * @param direction +1 sorting by increase price, -1 sorting by decrease price
     * @return sorted list of values
     */
    public List<Product> getSortedByPrice(int direction) {
        List<Product> result = new ArrayList<>(repository.getAll());
        result.sort((o1, o2) -> direction * (o2.getPrice() - o1.getPrice()));
        return result;
    }

    /**
     * @param direction true sorting alphabetically, false reverse sorting
     * @return sorted list of values
     */
    public List<Product> getAlphabeticallySortedByName(boolean direction) {
        List<Product> result = new ArrayList<>(repository.getAll());
        if (direction) {
            alphabeticallySortByName(result);
        } else {
            reverseSortByName(result);
        }
        return result;
    }

    public List<Product> getAlphabeticallySortedByName() {
        List<Product> result = new ArrayList<>(repository.getAll());
        alphabeticallySortByName(result);
        return result;
    }

    public List<Product> pagingListItems(List<Product> products, int countPerPage, int pageNumber) {
        int countOfPages = products.size() / countPerPage;
        List<List<Product>> subLists = new ArrayList<>(countOfPages);
        subLists.add(products.stream().skip(Math.min(pageNumber - 1, countOfPages) * countPerPage).limit(countPerPage).collect(Collectors.toList()));
        return subLists.get(0);
    }
}