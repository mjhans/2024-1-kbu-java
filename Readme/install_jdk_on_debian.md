# Debian linux에 jdk 설치하기
---

> edoptium의 내용을 요약한 것입니다. ([link](https://adoptium.net/installation/linux/#_deb_installation_on_debian_or_ubuntu))

## prerequisite
* windows 10 (Build 19041 이상)
* WSL2을 이용해서 Debian Linux 정상 설치
* Debian 처음 설치시 생성한 username과 password 기억하기
  * password의 경우 sudo 명령어를 이용할때 필요
    * sudo는 관리자 권한을 부여 하기 때문에, 사용자를 인증하는 것이라고 이해
    * 리눅스 특성상 password입력시 아무런 값도 안나온다
  * sudo 명령어는 시스템에서 사용하는 파일과 디렉토리를 수정할수 있는 권한(root 권한이라고 함)을 획득 ( 참고: [sudo 사용법](https://withcoding.com/106), [linux 권한](https://m1n5eo.tistory.com/93), [linux root와 user](https://smallrich.tistory.com/80) )
* Debian과 같은 리눅스는 다양한 유틸리티 프로그램을 설치가능한 형태로 서버에 저장해둔다. debian의 경우 `apt` 라는 명령어를 이용해서 그 서버에서 다운로드 받아 설치한다. 
  * 서버 주소는 `/etc/apt/` 아래에서 파일로 관리하고 있다
  * apt 명령어를 쓰는 시스템에서는 **apt repository(apt 저장소)** 라고 표현한다
  * Debian 커뮤니티 뿐 아니라 다른 커뮤티니/회사에서도 서버를 구축해서 사용하고, 사용을 위해서 인증정보를 요구하기도 한다.
    * 회사의 경우 제품 판매를 위해서 라이선스 구매 후 키를 발급하는 형태
  * Temurin JDK를 설치하기 위해서는 **Eclipse 재단의 서버에 접근해야 하므로, 해당 서버주소를 추가하는 작업이 필요**하다


## 설치하기

0. debian을 처음 셋팅했을 경우 `sudo apt update` 명령어로  파일의 서버 주소를 load해준다
```shell
sudo apt update # sudo 패스워드를 물어볼수 있다. 처음에 설정했던 패스워드를 적어준다.
```
1. JDK 설치전 필요한 Linux Package를 설치한다
```shell
# wget : url의 내용을 다운로드 받는 프로그램
# apt-transport-https : package 서버와 https 통신시 필요한 프로그램
# gpg : 파일이나 메시지를 암호화와 서명을 위한 프로그램
# apt install은 package 서버에서 해당 프로그램이 있는지 검색하고, 설치전에 사용자에게 진짜로 설치할건지 물어본다. -y 옵션은 이 물어보는 부분에 자동으로 yes라고 체크해준다
# apt install 이후 필요한 프로그램의 이름을 공백문자 단위로 써주면 한번에 설치한다
apt install -y wget apt-transport-https gpg
```
2. Eclipse Adoptium 프로젝트의 GPG key를 다운로드 받아서 apt에서 쓸수 있도록 저장한다.
```shell
# | 은 앞에 쓰인 명령어의 실행결과를 다음 명령어에 넘겨주는 역할을 한다.
# > /dev/null 은 실행 결과를 아무것도 표시하지 않는다. (키를 내려 받기 때문에 보안상 필요)
# tee 는 입력된 내용을 화면에 출력하고, 파일에 쓰는 프로그램이다. (왠만한 리눅스에는 기본 제공)
wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | gpg --dearmor | sudo tee /etc/apt/trusted.gpg.d/adoptium.gpg > /dev/null
```
3. Eclipse Adoptium의 apt 저장소 주소 추가하기
```shell
# 2번작업은 Eclipse Adoptium의 apt 저장소에 접근하기 위한 키 값을 다운받아서 설정하는 과정이고
# 지금은 apt 저장소를 추가하는 작업이다.
echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^VERSION_CODENAME/{print$2}' /etc/os-release) main" | sudo tee /etc/apt/sources.list.d/adoptium.list
```
4. 필요한 jdk 버전을 설치한다
```shell
sudo apt update
sudo apt install -y temurin-17-jdk
#temurin-<version>-jdk
#e.g temurin-17-jdk or temurin-8-jdk
```

5. 설치 후 확인하기
```shell 
java --version
```

## git에 추가한 install_java_on_debian.sh 파일 이용하기

- 파일을 Debian 리눅스의 /home/<내 유저이름>/ 경로로 이동하기
  - [파일 위치](scripts/install_java_on_debian.sh)
- 파일 실행
```shell
bash +x install_jdk_on_debian.sh
```
- 처음에 password 입력하라는 문구 나오면 내 패스워드 입력 후 엔터
- 두번째 자바 버전 입력하는 문구나오면 17 입력 후 엔터