@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
    
    assertEquals("Ошибка, должно быть тру", expected, isAdult);
}
