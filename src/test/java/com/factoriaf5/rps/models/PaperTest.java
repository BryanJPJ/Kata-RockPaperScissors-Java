package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaperTest {
   @Test
   public void TestPaper(){
    Paper p = new Paper();
    assertEquals("Paper", p.getType());
   } 
}
