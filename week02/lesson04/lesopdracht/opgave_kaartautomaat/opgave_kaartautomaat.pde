void setup(){
  TicketMachine t1 = new TicketMachine("Poekemon", 15.00);
  t1.payment(1.0);
  t1.payment(10.0);
  t1.payment(5.0);
  t1.buyTicket();
}