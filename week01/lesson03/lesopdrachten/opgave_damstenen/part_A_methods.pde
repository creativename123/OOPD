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