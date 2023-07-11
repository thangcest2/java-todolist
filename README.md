# java-todolist
I asked google bard to show me a todolist app in Java with Gradle Maven. And here it goes

## Why
I am new to Java. Like 8 years ago I once wrote some things in Java, 
to play around with its code and also to try building an Android application.
My new job - the company uses Java. So I decided to learn again.
Okay let's start simple.

## What I might have missed
I don't know Java very deep yet, the purpose is to see how things work in high level

## Steps
1. Install IntelliJ IDEA CE: https://www.jetbrains.com/idea/download/?section=mac
2. Create a new todolist project using IntelliJ IDEA, that use Gradle. Note that gradle + openjdk came together with IntelliJIDEA. You can also use brew to install gradle + openjdk.
3. Search: `show me a simple java todolist app with gradle` in google bard

## Important note:
Make sure you have gradle version and openjdk(java) version compatible together
Gradle version: `cat gradle/wrapper/gradle-wrapper.properties | grep distributionUrl` -> gradle 8.0
Java Version: Check IntelliJ project structure. (I use Corretto 18.0.2)

# Run it
```
./gradlew build # build the app
java -jar build/libs/todolist.jar # run the app
```

## Demo video link:
TBUpdated

# License
MIT. You can see more in LICENSE file.
