package org.comstudy21.myapp.ex02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;


//��Ģ������ �̸����Ⱑ��
//�Ʒ����� ����ٸ� �����ִ°Ŵ�.
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SimpleCalculatorTest {
	
	//����ƽ�� ����ƽ������ �������վ static �ٿ���
	//static SimpleCalculator calc;
	SimpleCalculator calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//�ѹ��� ������
		//calc = new SimpleCalculator();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//�Ź� ������
		calc = new SimpleCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("���ϱ� ��� �׽�Ʈ") //�̸� ���� ����
	void test_add() {
		assertEquals(3, calc.add(1, 2));
	}

	@Test
	@Disabled //�׽�Ʈ �����ϰڴ�
	void test_sub() {
	}

	@Test
	void test_mul() {
	}

	@Test
	void test_div() {
	}

}
