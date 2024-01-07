package com.sebi.deliver.controller;

import com.sebi.deliver.model.Product;
import com.sebi.deliver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("{id}")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @DeleteMapping("{id}")
    public Product deleteProduct(@PathVariable Long id) {
        return productService.deleteProduct(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("name/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }
}
