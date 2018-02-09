class Damsteen {
  int x, y, straal;
  color kleur;

  Damsteen (int x, int y, int straal, color kleur) {
    this.x = x;
    this.y = y;
    this.straal = straal;
    this.kleur = kleur;
  }
}

void setup() {
  size(250,250);
  noStroke();
  
  Damsteen damsteenZwart1 = new Damsteen(100, 50, 20, #ffffff);
  Damsteen damsteenZwart2 = new Damsteen(100, 100, 20, #000000);
  Damsteen damsteenZwart3 = new Damsteen(200, 50, 20, #ffffff);
  Damsteen damsteenZwart4 = new Damsteen(200, 100, 20, #000000);
  
  Damsteen[] damstenen = {
    damsteenZwart1,
    damsteenZwart2,
    damsteenZwart3,
    damsteenZwart4
  };

  drawDamstenen(damstenen);
}

void drawDamstenen(Damsteen[] damstenen) {
  for (int i =0; i<damstenen.length; i++) {
    tekenDamsteen(damstenen[i].x,
      damstenen[i].y,
      damstenen[i].straal,
      damstenen[i].kleur);
  }
}

void tekenDamsteen(int x, int y, int straal, color kleur) {
  fill(kleur);
  ellipse(x, y, straal, straal);
}