package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component	//스프링에게 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired)	//컴파일 시 자동으로 setChef()를 생성 + onMethod 속성: 생성되면 setChef()에 Autowired 어노테이션 추가
	private Chef chef;
	//Restaurant 객체는 Chef 타입의 객체를 필요로 한다는 의미
}
