package com.fatihdemir.websocketproject.service.impl;

import com.fatihdemir.websocketproject.dto.product.DtoProduct;
import com.fatihdemir.websocketproject.dto.product.DtoProductIU;
import com.fatihdemir.websocketproject.entity.Product;
import com.fatihdemir.websocketproject.repository.ProductRepository;
import com.fatihdemir.websocketproject.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    public DtoProduct createProduct(DtoProductIU dtoProductIU) {

        DtoProduct response = new DtoProduct();
        Product product = new Product();

        BeanUtils.copyProperties(dtoProductIU, product);

        Product dbProduct = productRepository.save(product);

        BeanUtils.copyProperties(dbProduct, response);

        return response;

    }
}
