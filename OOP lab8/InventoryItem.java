interface InventoryItem{
    public String getName();
    public double getPrice();
    public int getQuantity();
    public void increaseQuantity(int quantity);
    public void decreaseQuantity (int quantity);
}