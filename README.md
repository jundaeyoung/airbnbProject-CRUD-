# Java Project_airbnb 목표
HTTP 메세지 (시작 줄, 헤드, 헤더, 빈 줄(CLRF), 바디) 개념 꼭 이해하기  

웹 서버와 (WAS)웹 컨테이너 개념 이해하기 

Servlet 과 JSP 파일에 대한 이해 

Connection less 개념과 State less 개념 이해 

요청부터 응답까지 순서 그림 그려보기 


## 🖥️ 프로젝트 소개
숙박업체 airbnb를 참고하여 만든 숙박예매사이트입니다.

## 🕰️ 개발 기간
* 23.03.30일 - 22.04.03일 총 5일

## ⚙️ 개발 환경
- `Java ee`
- `JDK SE 11`
- **IDE** : Eclipse 4.26

## 📌 주요 기능
#### main - <a href="https://github.com/jundaeyoung/airbnbProject-CRUD-/wiki/%EC%A3%BC%EC%9A%94%EA%B8%B0%EB%8A%A5%EC%86%8C%EA%B0%9C-(-%EB%A9%94%EC%9D%B8-%ED%99%94%EB%A9%B4-%EC%84%A4%EA%B3%84-)" >상세보기 - WIKI 이동</a>
- 실제 airbnb와 비슷하게 제작
- forEach를 사용하여 DB에 숙소 정보만 넣으면 바로 화면에 나타날수 있도록 설계
- 숙소 정보창도 여러 개가 아닌 하나의 jsp 파일로 구현
#### reply - <a href="https://github.com/jundaeyoung/airbnbProject-CRUD-/wiki/%EC%A3%BC%EC%9A%94%EA%B8%B0%EB%8A%A5%EC%86%8C%EA%B0%9C-(-%EB%8C%93%EA%B8%80-%EA%B8%B0%EB%8A%A5-)" >상세보기 - WIKI 이동</a>
- 후기를 적으면 평점이 올라가고 후기 갯수가 올라갈 수 있도록 구현
- 후기 평점을 평균 내서 평점을 내도록 구현
- 해당 아이디로 작성한 글은 해당 아이디로만 삭제 가능( 다른 사람이 적은 후기를 내가 삭제 못하도록 구현한 것 )
#### reservation - <a href="https://github.com/jundaeyoung/airbnbProject-CRUD-/wiki/%EC%A3%BC%EC%9A%94%EA%B8%B0%EB%8A%A5%EC%86%8C%EA%B0%9C-(-%EC%98%88%EC%95%BD-%EA%B8%B0%EB%8A%A5-)" >상세보기 - WIKI 이동</a>
- 예약하면 예약 정보가 db에 넘어가도록 구현
#### search - <a href="https://github.com/jundaeyoung/airbnbProject-CRUD-/wiki/%EC%A3%BC%EC%9A%94%EA%B8%B0%EB%8A%A5%EC%86%8C%EA%B0%9C-(%EC%88%99%EC%86%8C-%EA%B2%80%EC%83%89-%EA%B8%B0%EB%8A%A5)" >상세보기 - WIKI 이동</a>
- 숙소 정보를 DB에 담아 SELECT 쿼리문을 던져 숙소 검색
- 쿼리문을 던질 때 like절 사용 방법 주의
#### User - <a href="https://github.com/jundaeyoung/airbnbProject-CRUD-/wiki/%EC%A3%BC%EC%9A%94%EA%B8%B0%EB%8A%A5%EC%86%8C%EA%B0%9C(%EC%82%AC%EC%9A%A9%EC%9E%90-%EB%A1%9C%EA%B7%B8%EC%9D%B8,%EB%A1%9C%EA%B7%B8%EC%95%84%EC%9B%83,%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85,%EC%A0%95%EB%B3%B4%EC%88%98%EC%A0%95)" >상세보기 - WIKI 이동</a> 
- SELECT 쿼리문을 던져 로그인 구현
- INSERT 쿼리문을 던져 회원가입 구현 SELECT를 사용해 중복 아이디가 있는지 확인
- UPDATE 쿼리문을 던져 정보수정 구현 SELECT를 사용해 수정시 사용이 편하도록 구현
#### search - <a href="https://github.com/jundaeyoung/airbnbProject-CRUD-/wiki/%EC%A3%BC%EC%9A%94%EA%B8%B0%EB%8A%A5%EC%86%8C%EA%B0%9C-(%EC%88%99%EC%86%8C-%EA%B2%80%EC%83%89-%EA%B8%B0%EB%8A%A5)" >
