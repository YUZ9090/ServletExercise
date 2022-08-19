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
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;


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
		
		String env_value = System.getenv("TEST_JUNIT");
		System.out.println("env_value = "+env_value);
		
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
		
		System.out.println("calc.add(1,2)==>"+calc.add(1, 2));
		int result = calc.add(1, 2);
		assertAll(
				() -> assertEquals(3, result),
				() -> assertTrue(result>0),
				() -> System.out.println("���ϱ� ���� ���")
		);
		
	}

	@Test
	@Disabled //�׽�Ʈ �����ϰڴ�
	@DisplayName("���� ��� �׽�Ʈ")
	void test_sub() {
		System.out.println("����");
	}

	@Test
	@DisplayName("���ϱ� ��� �׽�Ʈ")
	@EnabledIfEnvironmentVariable(named="TEST_JUNIT", matches="gogo")
	//TEST_JUNIT�̶�� ȯ�溯���� gogo�� �����������
	//��Ŭ�����������Ѿ� ����ȴ�
	void test_mul() {
		System.out.println("���ϱ�");
	}

	@Test
	@DisplayName("������ ��� �׽�Ʈ")
	void test_div() {
		System.out.println("������");
	}

}
