def gitdownload(repo)
{
 git "https://github.com/intelliqittrainings/${repo}.git"
}
def mavenbuild()
{
  sh 'mvn package'
}
def  deploytomcat(jobname,ip,context)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
    
}
 runselenium(jobname)
{
   sh "java -jar /var/lib/jenkins/workspace/${jobnmae}/testing.jar"
}
