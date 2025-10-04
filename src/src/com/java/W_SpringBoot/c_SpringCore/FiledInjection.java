package com.java.W_SpringBoot.c_SpringCore;

public class FiledInjection {
    // Repository Layer
   // @Repository
    public class ProductRepository {
        public String findProductById(int id) {
            return "Product-" + id;
        }
    }

    // Service Layer (Field Injection)
   // @Service
    public class ProductService {
       // @Autowired
        private ProductRepository productRepository; // Direct injection

        public String getProduct(int id) {
            return productRepository.findProductById(id);
        }
    }

    // Controller Layer
   // @RestController
   // @RequestMapping("/products")
    public class ProductController {
      //  @Autowired
        private ProductService productService; // Direct injection

       // @GetMapping("/{id}")
        public String getProduct(int id) {
            return productService.getProduct(id);
        }
    }
}
