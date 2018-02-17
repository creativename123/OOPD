class Product {
  String name;
  int price;
  
  Product(String productName, int productPrice){
    this.name = productName;
    this.price = productPrice;
  }
}

void setup(){
 Product product1 = new Product("PC", 500); 
 Product product2 = new Product("Mac", 1000);
 Product[] productList = {product1, product2};
 
 for(int i = 0; i<productList.length; i++){
   println(productList[i].name + "kost €" + productList[i].price);
 }
}