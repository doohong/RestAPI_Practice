>[스프링 기반 REST API 개발](https://www.inflearn.com/course/spring_rest-api/) -백기선님 인프런 강좌를 보고 작성하였습니다.
# API
- Application Programming Interface
- 응용 프로그램에서 사용할 수 있도록, 운영 체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다.

# REST
- REpresentational State Treansfer
- 인터넷 상의 시스템 간의 상호 운용성(Interoperability)을 제공하는 방법중 하나
- 시스템 제각각의 독립적인 진화를 보장하기 위한 방법
- REST API : REST 아키텍처 스타일을 따르는 API  

# 그런 REST API로 괜찮은가
> [그런 REST API로 괜찮은가](https://tv.naver.com/v/2292653) - 이응준님 강연을 보고 작성하였습니다.

- 오늘날 대부분의 "REST API"는 사실 REST를 따르지 않고 있다.
- REST의 제약조건 중에서 특히 **Self-descriptive**와 **HATEOAS**를 잘 만족하지 못한다.
- REST를 따르겠다면, **Self-descriptive**와 **HATEOAS**를 만족시켜야한다.
  - **Self-descriptive**는 custom media type이나 profile link relation 등으로 만족시킬 수 있다.
  - **HATEOAS**는 HTTP 헤더나 본문에 링크를 담아 만족시킬 수 있다.
## Self descriptive message
- 메세지 스스로 메세지에 대한 설명이 가능해야 한다. 
  - 이렇지 않으면 API문서를 항상 만들어야 한다. API만 보고 의미를 알 수 없기 때문이다.

### Self descriptive message를 달성하기 위한 방법

1. 미디어 타입을 IANA에 등록하고 그 미디어 타입을 리소스 리턴할 때 Content-Type으로 사용한다. 
2. ProFile 의미가 뭔지 정보가 담긴 문서 링크 헤더를 추가한다.


## HATEOAS
- 하이퍼미디어(링크)를 통해 애플리케이션 상태 변화가 가능해야 하며 링크 정보를 동적으로 바꿀 수 있다.
  - HATEOS는 애플리케이션 상태 전이의 late binding을 가능하게 하기 때문에 필요하다.
어디서 어디로 전이가 가능한지 미리 결정되지 않는다. 어떤 상태로 전이가 완료되고 나서야 그 다음 전이될 수 있는 상태가 결정된다. 링크는 동적으로 변경될 수 있다. 언제나 서버가 마음대로 바꿀 수 있음.
### HATEOAS를 달성하기 위한 방법
1. 데이터 링크 제공
2. HTTP 헤더에 Location, Link를 활용하는 방법


[블로그](https://doohong.github.io/categories/RESTAPI/)
