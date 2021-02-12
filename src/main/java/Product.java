import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product implements MontrealTradedProducts, ProductPricingService {
    protected String productID;
    protected int currentPrice;
    private List<Product> productsList = new ArrayList<>();

    public Product() {

    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public Product(String productID, int currentPrice) {
        this.productID = productID;
        this.currentPrice = currentPrice;
    }

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        List<Product> products = productsList.stream()
                .filter(item -> item.getProductID().equals(product.getProductID()))
                .collect(Collectors.toList());
        if (products.isEmpty()) {
            productsList.add(product);
        } else {
            throw new ProductAlreadyRegisteredException("Product with " + product.getProductID() + "  already exist.");
        }
    }

    @Override
    public void trade(Product product, int quantity) {

    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }

    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }
}
