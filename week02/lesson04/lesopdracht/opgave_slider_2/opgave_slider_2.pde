Slider slider1, slider2;

void setup() {
  size(300, 200);
  background(0);

  //x, y
  //width height
  //min value, indexes
  //starting index
  slider1 = new Slider((width - 200) / 2, 50, 
    200, 50, 
    100, 50, 2);
  slider2 = new Slider((width - 200) / 2, 110, 
    200, 50, 
    0, 10, 5);
}

void draw() {
  slider1.index = slider1.sliderIndex();
  slider2.index = slider2.sliderIndex();

  slider1.drawSlider();
  slider2.drawSlider();

  println(slider1.getValue() + "---" + slider2.getValue());
}