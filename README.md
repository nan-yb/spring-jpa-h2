# spring-boot-jpa-h2

spring-boot , jpa 공부 (h2)

## Requirements

- Java 8

## Includes

- Spring Boot 2.7.0
  - spring-boot-starter-web
  - spring-boot-starter-thymeleaf
  - spring-boot-starter-data-jpa
  - com.h2database:h2

### ORM

- 객체지향 언어를 이용하여 , 서로 호환되지 않는 타입 간의 데이터를 변환하는 기술
- 좁은 의미 : DB(RDBMS) 테이블 데이터를 (자바) 객체와 매핑하는 기술
- 효과 : RDBMS를 객체 지향 DB로 가상화하는 것
- ORM 으로 얻고자 하는 것
  - DB의 추상화 : 특정 DB에 종속된 표현(ex : SQL) 이나 구현이 사라지고 , DB 변경에 좀 더 유연해짐.
  - 객체의 이점을 활용 : 객체 간 참조 , type-safety
  - 관심사 분리 : DB 동작에 관한 코드 작성의 반복을 최소화하고 비즈니스 로직에 집중

### JPA

- Jakarta(JAVA) Persistence API
- 자바에서 ORM 기술을 사용해 RDBMS를 다루기 위한 인터페이스 표준 명세
- API + JPQL + metadata (+ Criteria API)
- 기본적으로 관계형 데이터베이스의 영속성(persistence) 만을 규정
  - JPA 구현체 중에 다른 유형의 데이터베이스 모델을 지원하는 경우가 있지만 , 원래 JPA 스펙과는 무관
- 이름의 변화
  - Java Persistence API => Jakarta Persistence API
  - 2017년 9월 , 오라클이 JAVA EE 를 이클립스 재단으로 이관 -> 상표권 문제로 이름을 변경
  - Spring Boot : 2.2부터 Jakarta EE 로 의존성이 변경됨.

### Persistence (영속성)

- 프로세스가 만든 시스템의 상태가 종료된 후에도 사라지지 않는 특성
  - 구현 방법 : 시스템의 상태를 데이터 저장소에 데이터로 저장한다.
  - 사라지는 데이터 - 주기억상태에 저장된 데이터
    - 프로세스 메모리 안의 데이터 (변수 , 상수 , 객체 , 함수 등)
  - 사라지지 않는 데이터 - 보조기억장지
    - 하드디스크 , SSD에 기록된 데이터
  - 영속성 프레임 워크 : 영속성을 관리하는 부분을 persistence layer로 추상화하고 , 이를 전담하는 프레임워크에게 관리를 위임.
  - JPA 에서 persistence 란 : 프로세스가 DB로부터 읽거나 DB에 저장한 정보의 특성
