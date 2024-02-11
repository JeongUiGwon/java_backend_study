package kr.co.hanbit.product.management.application;

import kr.co.hanbit.product.management.domain.Product;
import kr.co.hanbit.product.management.infrastructure.ListProductRepository;
import kr.co.hanbit.product.management.presentation.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleProductService {
    private ListProductRepository listProductRepository;
    @Autowired
    SimpleProductService(ListProductRepository listProductRepository) {
        this.listProductRepository = listProductRepository;
    }
    public ProductDto add(ProductDto productDto) {
        Product product = ??;
        Product savedProduct = listProductRepository.add(product);
        ProductDto savedProductDto = ??;
        return savedProductDto;
    }
}
