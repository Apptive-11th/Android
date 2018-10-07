# 2주차 Android 강의
## 강의 순서
## 1. Android Project 만들기
## 2. 안드로이드 스튜디오 구성살펴보기 <br>
<pre>
+ mainfests
AndroidMantifest.xml : 안드로이드 앱에 관한 기본정보및 액티비티 관리

+ Gradle
compileSdkVersion: 어떤버전의 SDK를 사용할 것인지 <br>
minSdkVersion: 최소 어떤 SDK를 지원할 것인지 <br>
targetSdkVersion : 현재 목표로 삼고있는 SDK의 버전은 몇인지 <br>
versionCode: 구글 플레이스토어에서 인식할버전 <br>
versionName: 버전네임 <br>

+ defendencies : API 및 라이브러리 혹은 프레임워크를 들고올때 <br>

+ res/values
colors.xml :  자주 사용하는 색상을 저장해서 불러올 수 있음 @color/id로 사용<br>
strings.xml : 자주 사용하는 문자열을 저장해서 불러올 수 있음 ex)API키 같은거 저장할 때 @string/id로 사용 가능<br>
styles.xml : 앱에 테마나 스타일에 관련된 내용을 저장하거나 선언할 수 있음. ex) 상태바 색깔, 상태바 없애기 등등<br>

+ res/drawable
이미지 파일이나 벡터값이 저장되는곳<br>

+ res/layout
Layout이 되는 xml을 저장하는 곳. 아마 자주 많이 생성될 파일들 중 하나. <br>
안드로이드는 Java로 컴파일 됨. Java 만으로도 Layout을 만들 수 있음 <br>
그러나 그러기 위해선 직관적이지 않고 또 복잡함 <br>
그래서 XML을 Java와 Binding 하는 과정을 거쳐서 보다 직관적인 개발을 가능케 함 <br>

+ java/../
안드로이드에서 주가 되는 언어인 자바를 보관하는 장소.<br>
</pre>
## 3. 액티비티와 뷰란?
<pre>
액티비티 : 안드로이드 앱은 여러개의 화면으로 구성되어져있는데 하나의 스크린 즉 화면을 구성하는 것. <br>
뷰 : 화면을 구성하는 일반적인 요소들. 텍스트 박스, 입력폼, 버튼, 슬라이더, 뷰페이저,<br>
Linear Layout, Constraint Layout 등등~<br>
즉 Android는 액티비티 위에 하나이상의 뷰가 올라가져 있는 구조<br>
Plus 설명 : 뷰를 묶는 뷰그룹또한 뷰를 상속받는 구조 즉 뷰그룹또한 액티비티위에 올라가야 하고 뷰그룹위에 뷰가 올라가는 구조이다.<br>
뷰 그룹 : 뷰를 묶어 놓을 수 있는것들 Linear Layout ~ Constraint Layout등등, 뷰를 상속받아서 뷰의 기능을 사용할 수 있다. <br>

각각의 생명주기 : https://kairo96.gitbooks.io/android/content/ch2.4.1.html <br>
onCreate 랑 onResume로 구현해서 보여주기 <br>
</pre>
참고자료:https://medium.com/android-develop-android/android%EA%B0%9C%EB%B0%9C-2-activity%EC%99%80-layout-view-74aa6df503b8 <br>
안드로이드 기본 용어 설명: https://kairo96.gitbooks.io/android/content/ch2.1.html <br>
안드로이드 기본 뷰 종류: https://kairo96.gitbooks.io/android/content/ch3.2.html <br>

## 4. Layout
Layout은 뷰그룹을 상속한다. <br>
종류가 다양하니 그걸 알아보자 <br>
LinearLayout<br>
ConstraintLayout<br>
FrameLayout<br>
RelativeLayout<br>
ApsoluteLayout<br>
뭐 많은데 각자 사용하실 Layout 차차 익혀 가시길...<br>

## 5. Binding 하기
왜 Binding 하는지<br>

## 6. Layout 실습
Linear를 통해서 간단하게 만들어보기

## 과제
+ View 넣어보기 (text,button,텍스트 입력,switch,slider 등등)<br>
+ Life Cycle 구현하기 (oncreate, onResume, onStop 등등)<br> 
+ 몬드리안 구현해보기
<img src="https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/3sWA/image/NRg5wA6NjBS4sR2SbIdBTvNUIiI.jpg" width="300px">
