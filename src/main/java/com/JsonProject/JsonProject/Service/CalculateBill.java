package com.JsonProject.JsonProject.Service;

import com.JsonProject.JsonProject.Model.Product;

public class CalculateBill {

    public static Product getBill(Product objProduct){

        double minPrice = 0;
        if (objProduct.getPackageType() == 'A'){
            minPrice = 5;
        }
        if (objProduct.getPackageType() == 'B'){
            minPrice = 6;
        }
        if (objProduct.getPackageType() == 'C'){
            minPrice = 7;
        }
        objProduct.setTotal(objProduct.getMins()*minPrice);
        return objProduct;

    }

}
