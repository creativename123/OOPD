class TicketMachine {
  private String movieName;
  private double moviePrice, customerAmount;

  TicketMachine(String movieName, double moviePrice) {
    this.movieName = movieName;
    this.moviePrice = moviePrice;
    println("film kost: €" + moviePrice);
  }

  void payment(double customerAmount) {
    if (customerAmount > 0.0) {
      this.customerAmount += customerAmount;
    }
    println("Ingeworpen: " + customerAmount + " | Totaal ingeworpen: € " + this.customerAmount);
  }

  void returnChange() {
    double customerChange = customerAmount - moviePrice;
    String money =
      "+-------+\n" + 
      "| €100€ |\n" +
      "+-------+";

    println("U krijgt als wisselgeld: €" + customerChange);
    println(money);
  }

  void buyTicket() {
    if (this.customerAmount >= moviePrice) {
      println("Voldoende ingeworpen");
      returnChange();
      printTicket();
      println("");
    } else {
      println("Niet genoeg ingeworpen, nog te betalen: " + (this.moviePrice - this.customerAmount));
    }
  }

  void printTicket() {
    String ticket =
      "+------------------------+\n" + 
      "|Movie name: "+movieName+"|\n" +
      "|Movie price: €"+moviePrice+"|\n" +
      "|Customer Payed: €"+customerAmount+"|\n" +
      "|Change: €"+(customerAmount - moviePrice)+"|\n" +
      "+------------------------";
    println(ticket);
    customerAmount = 0.0;
  }
}