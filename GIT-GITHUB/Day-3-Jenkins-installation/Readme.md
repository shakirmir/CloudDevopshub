### CI #########
### Jenkins
- Install Jenkins on ubuntu 
 *** follow the instructions in the link below - 
- https://www.jenkins.io/doc/book/installing/linux/#debianubuntu

- sudo wget -O /etc/apt/keyrings/jenkins-keyring.asc \
  https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key
- echo "deb [signed-by=/etc/apt/keyrings/jenkins-keyring.asc]" \
  https://pkg.jenkins.io/debian-stable binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null
- sudo apt update
- sudo apt install jenkins
- jenkins -version
- sudo systemctl status jenkins
- systemctl status jenkins
- sudo systemctl enable jenkins
- sudo systemctl start jenkins
=============================
Note: create a firewall rule and allow all
http://34.47.219.98:8080/login?from=%2F

=============================
to get the login pwd type cmd on ubuntu terminal
# cat /var/lib/jenkins/secrets/initialAdminPassword
=============================   
install suggested pluggins
un: admin
pwd: admin

