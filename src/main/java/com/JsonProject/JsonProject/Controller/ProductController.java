package com.JsonProject.JsonProject.Controller;

import com.JsonProject.JsonProject.Model.Product;
import com.JsonProject.JsonProject.Service.CalculateBill;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/product")
public class ProductController {

    @PostMapping("/calculateBill")
    public Product calculateBill(@RequestBody Product objProduct){
        return CalculateBill.getBill(objProduct);
    }

}
