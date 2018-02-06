String[] lijst = {"NL 123", "663", "NL 143", "NL 323"};

void setup(){
  findInString(lijst, "NL");
  printArray(placeBeforeEveryIndex(lijst, "NL "));
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