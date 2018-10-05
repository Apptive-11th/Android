#2주차 Android 강의
## 강의 순서
1. Android Project 만들기
2. 안드로이드 스튜디오 구성살펴보기 <br>
+ mainfests
AndroidMantifest.xml : 안드로이드 앱에 관한 기본정보및 액티비티 관리

+ Gradle
compileSdkVersion: 어떤버전의 SDK를 사용할 것인지 <br>
minSdkVersion: 최소 어떤 SDK를 지원할 것인지 <br>
targetSdkVersion : 현재 목표로 삼고있는 SDK의 버전은 몇인지 <br>
versionCode: 구글 플레이스토어에서 인식할버전 <br>
versionName: 버전네임 <br>

defendencies : API 및 라이브러리 혹은 프레임워크를 들고올때 <br>

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


3. 