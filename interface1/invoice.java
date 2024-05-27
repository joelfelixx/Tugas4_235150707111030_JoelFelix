package interface1;

class Invoice implements Payable {
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;

    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return "Produk: " + productName + ", Kuantitas: " + quantity + ", Harga per Item: Rp" + pricePerItem;
    }
}
