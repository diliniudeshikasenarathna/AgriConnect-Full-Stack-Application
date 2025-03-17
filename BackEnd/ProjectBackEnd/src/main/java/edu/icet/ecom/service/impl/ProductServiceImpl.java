package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Product;
import edu.icet.ecom.entity.ProductEntity;
import edu.icet.ecom.repository.ProductRepository;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    final ProductRepository repository;
    final ModelMapper mapper;
    @Override
    public void addProduct(Product product) {
        repository.save(mapper.map(product, ProductEntity.class));

    }
}
