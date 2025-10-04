package com.java.W_SpringBoot.c_SpringCore;

public class ConstructorInjection {
    // Repository Layer
    //@Repository
    public class ProductRepository {
        public String findProductById(int id) {
            return "Product-" + id;
        }
    }

    // Service Layer (Constructor Injection)
    //@Service
    public class ProductService {
        private final ProductRepository productRepository;

        // Constructor Injection
       // @Autowired  // optional in Spring Boot 2.6+
        public ProductService(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

        public String getProduct(int id) {
            return productRepository.findProductById(id);
        }
    }

    // Controller Layer
    //@RestController
    //@RequestMapping("/products")
    public class ProductController {
        private final ProductService productService;

      //  @Autowired
        public ProductController(ProductService productService) {
            this.productService = productService;
        }

       // @GetMapping("/{id}")
        public String getProduct(int id) {
            return productService.getProduct(id);
        }
    }

}
