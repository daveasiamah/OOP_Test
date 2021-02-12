public class Stocks extends Product implements ProductPricingService {
    protected String ticker;
    protected String exchange;

    public Stocks(String ticker, String exchange) {
        super();
        this.ticker = ticker;
        this.exchange = exchange;
    }

    @Override
    public void addNewProduct(Product product) {
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
