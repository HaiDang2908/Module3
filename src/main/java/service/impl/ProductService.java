package service.impl;

import DAO.ProductRepository;
import modle.Product;

import java.util.ArrayList;

public class ProductService implements ICRUDService<Product> {
    private  final ProductRepository productRepository = new ProductRepository();


    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public ArrayList<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteById(int id) {

    }
}


