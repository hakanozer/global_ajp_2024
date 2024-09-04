package com.works.services;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public Product save( Product product ) {
        Optional<Product> optionalProduct = productRepository.findByTitleEqualsIgnoreCase(product.getTitle());
        if (optionalProduct.isPresent()) {
            return null;
        }
        productRepository.save(product);
        return product;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public boolean delete( Long product_id ) {
        try {
            Optional<Product> optionalProduct = productRepository.findById(product_id);
            if (optionalProduct.isPresent()) {
                productRepository.deleteById(product_id);
                return true;
            }
        }catch (Exception ex) {}
        return false;
    }

    public Product update( Product product ) {
        Optional<Product> optionalProduct = productRepository.findById(product.getPid());
        if (optionalProduct.isPresent()) {
            productRepository.saveAndFlush(product);
            return product;
        }
        return null;
    }

    public List<Product> saveAll( List<Product> productList ) {
        return productRepository.saveAll(productList);
    }


    // select * from product limit 0, 10
    public Page<Product> findAllPage(int pageNumber, int pageSize) {
        int sizeEnd = 10;
        if (pageSize < 51 && pageSize > 5) {
            sizeEnd = pageSize;
        }
        Pageable pageable = PageRequest.of(pageNumber, sizeEnd);
        Page<Product> products = productRepository.findAll(pageable);
        return products;
    }



}
