package com.discaATLAS.Blank.discaATLAS.RollingMain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface ProductBrandRepository extends MongoRepository<ProductBrand, String> {

}
