package org.worms.hardware;

public class Product {
  private String name;
  private double price;
  private int inventory;
  
  public Product(){
    name = "unknown";
    price = 0;
    inventory = 0;
  }
  
  public void setName(String name)
  {
	  this.name = name;
  }
  public String getName()
  {
	  return name;
  }
  public void setPrice(double price)
  {
	  this.price = price;
  }
  public double getPrice()
  {
	  return price;
  }
  public void setInventory(int inventory)
  {
	  this.inventory = inventory;
  }
  public int getInventory()
  {
	  return inventory;
  }
  public void increaseInventory(int amount)
  {
	  this.inventory = this.inventory + amount;
  }
  public void decreaseInventory(int amount)
  {
	  this.inventory = this.inventory - amount;
  }
}
