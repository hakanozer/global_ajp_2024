package com.works.restcontrollers;

import com.works.entities.Product;
import com.works.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductRestController {

    final ProductService productService;

    @PostMapping("save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("list")
    public List<Product> list() {
        return productService.findAll();
    }

    @GetMapping("delete")
    public boolean delete(@RequestParam Long id) {
        return productService.delete(id);
    }

    @PostMapping("update")
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }


}
