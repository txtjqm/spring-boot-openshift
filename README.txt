
WARNING: "Do not follow this vehicle"
This is a scratch app I'm using to learn how it works, so dont use as a guide.
--------------------------------------

used these as guide:
intro: https://spring.io/guides/gs/spring-boot-docker/
advanced "topical": https://spring.io/guides/topicals/spring-boot-docker/

this project initially got from and then modified:
git clone https://github.com/spring-guides/gs-spring-boot.git

to put on openshift using docker
1. make jar file by clicking gradle tab-> execute gradle task -> gradle build
  this probably does something defined by the plugin from build.gradle
  "org.springframework.boot"
  See https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/gradle-plugin/reference/html/
2. cd to fromGitSpringBoo\gs-spring-boot\complete\build\libs and run
  : java -jar build/libs/spring-boot-0.0.1-SNAPSHOT.jar 
  : curl localhost:8080/actuator/health
3. put project on github
4. on openshift console
   ?? add->import from git
   If using private git repository make private key
     ** https://www.openshift.com/blog/deploy-private-git-repositories
     ** https://docs.github.com/en/github/authenticating-to-github/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent
     $ ssh-keygen -t rsa -b 4096 -C "myEmailHere@gmail.com"
     ... COULDNT GET TO WORK. HAD TO MAKE REPO PUBLIC INSTEAD....
     ... maybe would work from openshift cli tools on pc ...
     ... tried git clone from pc with rsa cert, had to type "yes"...
 . import from github failed with error
    "openshift services=1, used: services=5, limited: services=5"
 * Fixed it by deleting old project entirely. Must be limit of 1 project
  on free openshift, apparently.


==========================================
hot reload when debugger running:
This option controls Run | Debugging Actions | Reload Changed Classes action behavior.
If it's turned on, the make process is performed before searching and reloading changed classes.
... tried it but seems to be a one time command
.... added it to icons... file-settings-debug toolbar top window-add
... then add it from main toolbar-run-debugging actions