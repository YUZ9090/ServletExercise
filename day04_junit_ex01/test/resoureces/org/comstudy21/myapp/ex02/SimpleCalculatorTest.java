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


//규칙에따라 이름짓기가능
//아래것은 언더바를 지워주는거당.
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SimpleCalculatorTest {
	
	//스태틱은 스태틱끼리만 붙을수잇어서 static 붙여줌
	//static SimpleCalculator calc;
	SimpleCalculator calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//한번만 생성함
		//calc = new SimpleCalculator();
		
		String env_value = System.getenv("TEST_JUNIT");
		System.out.println("env_value = "+env_value);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//매번 생성됨
		calc = new SimpleCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("더하기 기능 테스트") //이름 지정 가능
	void test_add() {
		
		System.out.println("calc.add(1,2)==>"+calc.add(1, 2));
		int result = calc.add(1, 2);
		assertAll(
				() -> assertEquals(3, result),
				() -> assertTrue(result>0),
				() -> System.out.println("더하기 다음 기능")
		);
		
	}

	@Test
	@Disabled //테스트 제외하겠다
	@DisplayName("빼기 기능 테스트")
	void test_sub() {
		System.out.println("빼기");
	}

	@Test
	@DisplayName("곱하기 기능 테스트")
	@EnabledIfEnvironmentVariable(named="TEST_JUNIT", matches="gogo")
	//TEST_JUNIT이라는 환경변수에 gogo가 들어오면실행함
	//이클립스를껏따켜야 적용된다
	void test_mul() {
		System.out.println("곱하기");
	}

	@Test
	@DisplayName("나누기 기능 테스트")
	void test_div() {
		System.out.println("나누기");
	}

}
