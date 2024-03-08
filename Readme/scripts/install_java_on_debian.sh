#! /usr/bin/env bash
echo -n "Input sudo PASSWORD : "
stty -echo
read PASS
stty echo
echo ""

read -p "java version : " VERSION
echo ""


echo $PASS | sudo -S apt install -y wget apt-transport-https gpg
wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | gpg --dearmor | sudo tee /etc/apt/trusted.gpg.d/adoptium.gpg > /dev/null
echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^VERSION_CODENAME/{print$2}' /etc/os-release) main" | sudo tee /etc/apt/sources.list.d/adoptium.list

sudo apt update 				# update if you haven't already
sudo apt install -y temurin-$VERSION-jdk

