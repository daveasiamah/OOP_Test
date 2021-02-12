import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AddNewProductTest {
    MontrealTradedProducts montrealTradedProducts;
    ProductPricingService productPricingService;
    @Test
    public void addNewProduct() throws ProductAlreadyRegisteredException {
   Stocks appleStock = new Stocks("Apple","app101");
   Futures futurePrice1 = new Futures(2,200,2,2022);
   Product newProduct = new Product("stApp",275);

  List<Product> currentProductList = new ArrayList<>();
          montrealTradedProducts.addNewProduct(newProduct);
        assertThrows(ProductAlreadyRegisteredException.class, ()->montrealTradedProducts.addNewProduct(newProduct),"This product already exists");
    }
}