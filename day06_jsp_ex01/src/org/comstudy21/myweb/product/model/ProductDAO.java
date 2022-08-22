package org.comstudy21.myweb.product.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.model.InvalidTestClassError;

class ProductDAOTest {
   ProductDAO dao = null;

   @BeforeAll
   static void setUpBeforeClass() throws Exception {
   }

   @AfterAll
   static void tearDownAfterClass() throws Exception {
   }

   @BeforeEach
   void setUp() throws Exception {
      dao = new ProductDAO();
   }

   @AfterEach
   void tearDown() throws Exception {
   }

   @Test
   void testSelectAll() {
      List<Object> list = dao.selectAll();
      assertTrue(list.size() > 0);
      list.forEach((item)-> System.out.println(item));
   }

   @Test
   void testSelectOne() {
      fail("Not yet implemented");
   }

   @Test
   void testInsert() {
      fail("Not yet implemented");
   }

   @Test
   void testUpdate() {
      fail("Not yet implemented");
   }

   @Test
   void testDelete() {
      fail("Not yet implemented");
   }

}