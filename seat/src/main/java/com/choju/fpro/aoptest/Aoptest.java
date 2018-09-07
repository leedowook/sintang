package com.choju.fpro.aoptest;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Service;


@Service
@Aspect
public class Aoptest {
	/*포인트 컷(pointcut)+어드바이스(advice)를 합쳐서 
	 * 에스팩트라고함(aspect)
	 * 포인트 컷은 호출되는 위ㅏ치 지정과 관련된
	 * advice는 해당 위치에서 어떤 기능을 수행할것인지를 정의하는것
	 * 
	 * */
	
	//포인트 컷 정의
	/*(* com.ldw.pr..*ment.*(..))
	 * 1.*:모든 리턴타입
	 * 2.com.ldw.pr 적용할 패키지 지정
	 * 3.com.ldw.pr..*ment :com.ldw.pr 패키지에 소속도어있는 
	 * 	모든 패키지중에서 클래스의 이름이 ment로 끝나는 모든 클래스를 지정함.
	 *4.*(..):앞의 *은 모든 메소드를 의미하며 예를 들면 get*형식으로 쓰면 
	 *	get으로 시작하는 모든 메소드 
	 *	(..)은 모든 매개변수를 포함한다는 의미(개수 , 타입 상관없음) 
	 * */
	@Pointcut("execution(* com.pr.job..*service.*(..))")
	public void allPointcut() {
		
	}
	
	//아래의 두 메소드는 어드바이스 정의
	@Before("allPointcut()")
	public void printLog() {
		System.out.println("====AOP TEST Before Annotation====");
	}
	
	@AfterReturning("allPointcut()")
	public void printLogAfter() {
		
		System.out.println("==== AOP TEST After Returning Annotation====");
		
	}

}
