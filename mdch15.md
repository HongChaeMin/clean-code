# 15장 JUnit 들여다보기

이 장에서는 JUnit 코드를 리팩터링 하는 과정을 보여주었다

책이 술술 읽혔다 전 장보다 더 깔끔한 설명 실용적인 방법들이 많이 나왔다

1. 테스트 코드는 코드 커버리지가 높아야한다 이 장에서 나왔던 모듈은 코드 커버리지가 100%였다
2. 접두사를 제거한다 오늘날의 IDE가 발전했기 때문에 불필요한 접두사를 제거한다
3. 캡슐화 시킨다
4. 헷갈릴 수 있는 이름을 변경한다(변수명, 함수명 등등)
5. 함수 사용 방식을 일관성 있게 만들어라
    - 이 과정에서 시간적인 결합, 의존관계 확인 등이 필요하다
    - 인수로 전달하는 방식은 자의적이다 *(방자하게 두는 것)*
    - 함수 호출 순서는 확힐히 정해지지만 필요한 이유는 설명하지 못한다

모듈은 일련의 분석 함수와 일련의 조합 함수로 나뉜다 전체 함수는 위상적으로 정렬했으므로 각 함수가 사용된 직후에 정의한다 분석 함수가 먼저 나오고 조합 함수가 그 뒤를 이어서 나온다

*사실 이 장은 책에 나온 코드를 같이 봐야 더 와닿는다 역시 코드 예제가 최고다…*

**결론**

보이스카우트 규칙을 지켰다 코드를 처음보다 더 깨끗하게 만드는 책임은 우리 모두에게 있다
