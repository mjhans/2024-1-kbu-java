# prerequisite
- macos (OSX) 
- homebrew 설치가 된 상태
- 여러버전의 jdk가 설치
- zsh를 사용 (OSX 기본 shell)

# 여러 버전의 자바가 설치되었을 경우

- 자바 설치된 경로 확인
```shell
/usr/libexec/java_home
/usr/libexec/java_home -v17
/usr/libexec/java_home -v20 # sample
/usr/libexec/java_home -v21 # sample
```

![check path](images/check_java_path.png)
 
- 자바 버전별로 환경 변수 (Environment Variables) 만들어서 시스템에 적용하기

```shell
# echo는 쉘에서 값을 문자열을 출력하는 기능을 한다. 
# export는 환경변수를 셋팅하는 역할을 한다.
# >> 은 쉘에 출력된 문자열을 >> 기호 다음에 나오는 파일의 제일 끝에 추가한다
echo 'export JAVA_17_HOME=$(/usr/libexec/java_home -v17)' >> ~/.zshrc
echo 'export JAVA_21_HOME=$(/usr/libexec/java_home -v21)' >> ~/.zshrc
```
 
> 자바 환경변수 셋팅 하기
![export java home ](images/export_java_home.png)  

> 환경 변수 셋팅후 ~/.zshrc 파일 확인
![check .zshrc file](images/java_home_result.png)

- alias 명령어를 이용해서 JAVA_HOME 환경변수 쉽게 변경할 수 있도록 셋팅

```shell
echo "alias java17='export JAVA_HOME=\$JAVA_17_HOME'" >> ~/.zshrc
echo "alias java21='export JAVA_HOME=\$JAVA_21_HOME'" >> ~/.zshrc
```

- 터미널에 java 17 입력
```shell
java17
```



