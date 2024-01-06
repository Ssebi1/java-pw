package com.sebi.deliver.controller;

import com.sebi.deliver.model.User;
import com.sebi.deliver.service.ProductService;
import com.sebi.deliver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


}
