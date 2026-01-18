package com.tap.students.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.students.dto.CreateProductDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    // Any authenticated user can access
    @GetMapping
    public String getProducts() {
        return "Secure product list";
    }

    // Only ADMIN role can access
    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public String createProduct(
            @Valid @RequestBody CreateProductDto dto) {

        return "Product created";
    }
}
