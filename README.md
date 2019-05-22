# springboot2-executable-jar-demo

## Build
To build use following command: (JDK 8 is required)
```
./gradlew clean build
```

## Run
To execute:

```bash
cd build/libs
mv <whatever-jar-name> demo-app.jar
./demo-app.jar # This will show you CLI args you need to run this.

./demo-app.jar start 
```