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