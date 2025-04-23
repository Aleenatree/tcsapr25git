class TestCases{
  @Test
  public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
 @Test
 public void testMethod2(){
	assertTrue(false);
}
 @Test
 public void testMethod3(){
	assertTrue(false);//conflict resolved
}
 public void testMethod4(){

	assertTrue(false);
}

}
