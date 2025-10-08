package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"iphone",1000),
            new Product(102,"samsung",2000),
            new Product(103,"nothing",12000)
            ));

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
//                .findFirst().get();
                .findFirst().orElse(new Product(100,"No item",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
        }
        products.set(index,prod);
    }
    public void deleteProduct(int prodId){
        int index = 0;
        boolean flag=false;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prodId){
                index = i;
                flag = true;
            }
        }
        if(flag){
            products.remove(index);
            System.out.println(prodId+" is Deleted");
        }else{
            System.out.println("Item no "+prodId+" not found");
        }
    }

}