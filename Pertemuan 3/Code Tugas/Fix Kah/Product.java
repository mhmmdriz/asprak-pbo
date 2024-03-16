public class Product {
  private String name;
  private int stock;
  private int price;

  public Product() {
    this.name = "";
    this.stock = 0;
    this.price = 0;
  }

  public Product(String name, int stock, int price) {
    this.name = name;
    this.stock = stock;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getStock() {
    return stock;
  }

  public int getPrice() {
    return price;
  }

  public void setName(String name) {
    assert name != null;
    this.name = name;
  }

  public void setStock(int stock) {
    assert stock >= 0;
    this.stock = stock;
  }

  public void setPrice(int price) {
    assert price >= 0;
    this.price = price;
  }

  public void purchaseProduct(int quantity) {
    assert quantity > 0 : "Quantity must be positive";
    assert quantity <= stock : "Insufficient stock";

    stock -= quantity;
  }

  public void addStock(int quantity) {
    assert quantity > 0 : "Quantity must be positive";

    stock += quantity;
  }

}
