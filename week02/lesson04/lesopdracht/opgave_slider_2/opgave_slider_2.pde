Slider slider1, slider2;

void setup() {
  size(300, 200);
  background(0);

  slider1 = new Slider((width - 200) / 2, 50, 200, 50, 5);
  slider2 = new Slider((width - 200) / 2, 110, 200, 50, 40);
}

void draw() {
  slider1.index = slider1.sliderIndex();
  slider2.index = slider2.sliderIndex();
  
  slider1.drawSlider();
  slider2.drawSlider();
  
  println(slider1.index + "---" + slider2.index);
}