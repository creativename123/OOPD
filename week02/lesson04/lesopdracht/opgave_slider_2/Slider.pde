class Slider {
  float x, y, sWidth, sHeight;
  int indexes, index, minValue;

  Slider(float x, float y, 
    float sWidth, float sHeight, 
    int minValue, int indexes, int index) {
    this.x = x;
    this.y = y;
    this.sWidth = sWidth;
    this.sHeight = sHeight;
    this.minValue = minValue;
    this.indexes = indexes;
    this.index = index;
  }

  void drawSlider() {
    float indexWidth = sWidth / indexes;
    noStroke();
    fill(255);
    rect(x, y, sWidth, sHeight);

    fill(#2257F0);
    rect(x + index * indexWidth, y, indexWidth, sHeight);
  }

  int sliderIndex() {
    float indexWidth = sWidth / indexes;
    if (mousePressed &&
      mouseX > x &&
      mouseX < x + sWidth &&
      mouseY > y &&
      mouseY < y + sHeight) {
      if (mouseX >= sWidth + x) {
        return indexes - 1;
      } else {
        return floor((mouseX  - x) / indexWidth);
      }
    } else {
      return index;
    }
  }

  int getValue() {
    return index + minValue;
  }
}