 git clone https://github.com/spring-guides/gs-spring-boot.git

./gradlew
./gradlew bootRun

./gradlew build -x test
./gradlew clean build
history

http://localhost:8080/
http://localhost:8080/greet
Command pallete clean
Clean Java language server workspace 

https://medium.com/@sun30nil/how-to-secure-secrets-and-passwords-in-springboot-90c952961d9
https://www.devglan.com/online-tools/jasypt-online-encryption-decryption

export JASYPT_ENCRYPTOR_PASSWORD=pass  // Add this to vscode settings
${} provide env variable in application.properties

Download Distributable from 
https://github.com/jasypt/jasypt

Sample output
C:\Users\ibrez\Downloads\jasypt-1.9.3-dist\jasypt-1.9.3\bin>encrypt.bat input=encval password=pass verbose=true algorithm=PBEWithMD5AndDES ivGeneratorClassName=org.jasypt.iv.NoIvGenerator

----ENVIRONMENT-----------------

Runtime: Eclipse Adoptium OpenJDK 64-Bit Server VM 17.0.8+7



----ARGUMENTS-------------------

input: encval
password: pass
ivGeneratorClassName: org.jasypt.iv.NoIvGenerator
verbose: true
algorithm: PBEWithMD5AndDES



----OUTPUT----------------------

GweBmhjb0P56wPKdnaUpiw==

---------------------

docker run -e JASYPT_ENCRYPTOR_PASSWORD=yourEncryptionPassword -p 8080:8080 your-image-name


   96  docker build -t javatest:tag .
   97  docker images
   98  docker run -p 8080:8080 javatest:tag

 100  docker login
  101  docker tag javatest:tag ibrezm1/my-spring-app:v1
  102  docker push ibrezm1/my-spring-app:v1


gcloud container clusters create-auto hello-cluster
gcloud container clusters get-credentials hello-cluster --region us-central1

kubectl create deployment hello-app --image=ibrezm1/my-spring-app:v1

  115  kubectl apply -f springboot-app-deployment.yaml
  116  kubectl get pods
  117  kubectl apply -f springboot-app-service.yaml
  118  kubectl exec -it springboot-app-675d847d87-kr4b9  -- /bin/bash
  kubectl logs  springboot-app-675d847d87-kr4b9
    122  kubectl get service springboot-app-service  //// get url 
  123  curl http://35.232.14.224


kubectl apply -f springboot-app-deployment.yaml
kubectl exec -it <pod-name> -- /bin/bash
echo $DB_URL


kubectl apply -f springboot-app-service.yaml

kubectl get service springboot-app-service

curl http://EXTERNAL_IP


https://cloud.google.com/kubernetes-engine/docs/tutorials/hello-app

https://jhooq.com/building-first-helm-chart-with-spring-boot/

https://shashanksrivastava.medium.com/install-configure-argo-cd-on-kind-kubernetes-cluster-f0fee69e5ac4





