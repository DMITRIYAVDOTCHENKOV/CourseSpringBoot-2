package com.example.task3.controllers;

import com.example.task3.model.Product;
import com.example.task3.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class ProductsController {

    private final ProductService productService;
@GetMapping("/products")
    public String getProduckt(Model model) {
        model.addAttribute("products",productService.findAll());
        return "products.html";
    }
@PostMapping("/products")
    public String addProduct(Product p, Model model) {
    productService.addProduct(p);
    model.addAttribute("products", productService.findAll());
    return "products";
}

//
//    public ProductsController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping("/products")
//    public String viewProducts(Model model) {
//        var products = productService.findAll();
//        model.addAttribute("products", products);
//
//        return "products.html";
//    }
//
//    @PostMapping("/products")
//    public String addProduct(
//            Product p,
//            Model model
//    ) {
//        productService.addProduct(p);
//
//        var products = productService.findAll();
//        model.addAttribute("products", products);
//
//        return "products.html";
//    }
}