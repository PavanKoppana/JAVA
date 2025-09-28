package com.java.W_SpringBoot.c_SpringCore;

public class SetterInjection {
    // Repository Layer
   // @Repository
    public class ProductRepository {
        public String findProductById(int id) {
            return "Product-" + id;
        }
    }

    // Service Layer (Setter Injection)
   // @Service
    public class ProductService {
        private ProductRepository productRepository;

        // Setter Injection
       // @Autowired
        public void setProductRepository(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

        public String getProduct(int id) {
            if (productRepository == null) {
                return "No Repository Available!";
            }
            return productRepository.findProductById(id);
        }
    }

    // Controller Layer
   // @RestController
   // @RequestMapping("/products")
   // public class ProductController {
        private ProductService productService;

      // @Autowired
        public void setProductService(ProductService productService) {
            this.productService = productService;
        }

       // @GetMapping("/{id}")
        public String getProduct(int id) {
            return productService.getProduct(id);
        }
    }
