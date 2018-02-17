int[] array = {1, 2, 3, 6, 8, 3};

boolean komtGetalVoorIn ( int getal, int[] lijst ) {
  for (int i = 0; i < array.length; i++) {
    if (getal  == lijst[i]){
      println("Getal " + getal + " komt voor op index: " + i);
      return true;
    }
  }
  return false;
}

void setup(){
  komtGetalVoorIn(1, array);
}