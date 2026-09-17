def call(String ProjectName,String imageTag){
  sh "docker build -t $(ProjectName):$(imageTag) ."
}
