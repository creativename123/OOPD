String[] lijst = {"123", "663", "143", "323"};

void setup(){
  printArray(lijst);
  findInString(lijst, "NL");
  placeBeforeEveryIndex(lijst, "NL");
  printArray(lijst);
  findInString(lijst, "NL");
}

boolean findInString(String[] stringArray, String keyword){
  for(int i = 0; i < stringArray.length; i++){
    if(!stringArray[i].contains(keyword)){
      println("Geen NL gevonden op index: " + i);
      return false;
    }
  }
  println("Iedere index bevat 'NL'");
  return true;
}

String[] placeBeforeEveryIndex(String[] stringArray, String keyword){
  for (int i = 0; i < stringArray.length; i++){
    if(!lijst[i].contains(keyword)){
      stringArray[i] = keyword + stringArray[i];
    }
  }
  return stringArray;
}