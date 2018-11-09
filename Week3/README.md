#3주차 강의
리스트뷰 및 뷰페이저

## MVC 모델 패턴
<img src="https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/327/1262.png">
MVC란 Model View Controller의 약자로 에플리케이션을 세가지의 역할로 구분한 개발 방법론이다.<br>
아래의 그림처럼 사용자가 Controller를 조작하면 Controller는 Model을 통해서 데이터를 가져오고<br>
그 정보를 바탕으로 시각적인 표현을 담당하는 View를 제어해서 사용자에게 전달하게 된다.<br>
참고 : https://opentutorials.org/course/697/3828 <br>

## 어댑터

<br> https://medium.com/@jsuch2362/adapter-%EB%88%84%EA%B5%AC%EB%83%90-%EB%84%8C-data-view-2db7eff11c20

## 리스트 뷰
리스트 뷰 와 그리드 뷰 커스텀 리스트 뷰 등등
참고 https://developer.android.com/reference/android/widget/ListView

## 커스텀 리스트 뷰
참고 http://recipes4dev.tistory.com/43

## 프래그 먼트 
Fragment는 동작 또는 Activity 내에서 사용자 인터페이스의 일부를 나타냅니다.<br>
여러 개의 프래그먼트를 하나의 액티비티에 조합하여 창이 여러 개인 UI를 구축할 수 있으며,<br> 하나의 프래그먼트를 여러 액티비티에서 재사용할 수 있습니다.<br> 프래그먼트는 자체 수명 주기를 가지고, 자체 입력 이벤트를 받으며, 액티비티 실행 중에 추가 및 제거가 가능한 액티비티의 모듈식 섹션이라고 생각하면 됩니다(다른 액티비티에 재사용할 수 있는 "하위 액티비티"와 같은 개념).


참고 https://developer.android.com/guide/components/fragments?hl=ko
프래그먼트 생명주기: https://developer88.tistory.com/69

## 과제 피드백

**최유완** 1.5점 <br>
과제 제출OK,<br>
Custom List View OK <br>
프래그먼트, 프래그먼트 Cycle 에 대한 설명 미흡 <br>
카카오톡과 유사도 6점 (10점 만점)<br>
<br>

**박인오** 1.0점<br>
과제 제출 OK, <br>
Custom List View Ok <br>
프래그먼트, 프래그먼트 Cycle에 대한 설명 X <br>
대신 프래그먼트에 대해 구현해옴 버튼 이벤트까지 <br>
카카오톡과 유사도 2점 (10점 만점)<br>
<br>

**이정민** 0.5점<br>
과제 제출 OK, <br>
프레그먼트에 대한 이해도 OK<br>
Custom List View X -> 4주차 떄 제출 할 것<br>
 => 현재 Adapter에 데이터를 삽입하는 함수가 없음 그부분 수정해서 4주차 때 제출 바람!<br>
카카오톡과 유사도 1점 (10점 만점)<br>
<br>

**손덕현** 0점 <br>
과제 미제출<br>
다음주 제출 혹은<br>
0점<br>


## 과제
1. Activity와 Fragment차이 알아오기
2. Fragment 생명주기 알아오기
3. Custom ListView 사용해서 KaKao 친구창 
