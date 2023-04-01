# Simple Blog Service
Hexagonal Architecture를 숙련도를 높이기 위해 진행하는 Simple Blog Project 입니다. 복잡한 비즈니스로직은 존재하지 않으며 간단한 비즈니스 요구사항을 Hexagonal Architecture로 풀어봅니다.

## Context

###  ACs - Biz

- 사용자는 Post를 자유롭게 등록/조회할 수 있습니다.
- 사용자는 Post를 등록시 입력한 패스워드를 통해 수정할 수 있습니다.
- 사용자는 Post를 등록하고 공유할 수 있습니다.

### ACs - Tech
- Post 등록 시 NickName, Title, Content를 필수로 받습니다.
- 공유 링크는 Post 생성 시 함께 생성됩니다.
- 공유 링크는 영구 저장되어야 합니다.
- 회원 인증/인가는 구현하지 않습니다.


## 주요 관심사

###  Hexagonal Architecture의 철학을 보다 잘 적용하기 위해 각 레이어들은 배포 가능한 독립적인 모듈로 구축하기

- **Hexagonal의 핵심은** `확장성` 
  - 비즈니스 로직을 담당하는 `Application Layer`가 독립적인 형태로 존재하고 외부 의존성들은 언제든지 교체 가능해야 함
  - 따라서 DIP 설계 원칙을 적용하고 세부구현체들은 언제든지 교체 가능하도록 멀티 모듈로 구축한다.

### 객체간 책임과 역할 명백히 하기

- Hexagonal은 MVC 패턴과 같이 아직 표준이라고 불릴만한 Pattern이 존재하지 않음,  Hexagonal의 개념이 등장한지는 어느정도 시간이 흘렀지만 이렇게 Hot Topic으로 떠오른 것은 얼마되지 않았기 때문 -> 따라서 나만의 설계 Practice 적립을 진행



### 나만의 Practice
1. Domain 객체와 Entity를 따로 Develop
2. CQS 개념을 도입
3. ISP 설계 원칙 도입
4. @Service 라는 애노테이션 대신 다른 애노테이션 사용


