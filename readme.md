# Lab 8

Name: CHENG Xiaohe
Student ID: 20413370


## Command
git add src/* -v

git commit -m "..."

git push

git pull

git reset --hard HEAD^

git add build/classes/java/main/lab2/ex1/Book.class 

git stash

git remove -f build/classes/java/main/lab2/ex1/Book.class 



## Question
 - Why it is a bad idea? Can you comment it with the experience in Task 3?
 -- Very hard to resolve the difference
 
 - What does git stash do? What is the disadvantage in using git stash?
 -- It tracks all current changes, put them onto stash, and leave the repository as the HEAD's status.
 -- Disadvantage: need to manually pop changes out and resolve difference.
 -- Mistakes can cause all changes to be lost.
 
 - Which of the public/protected/private methods and data members will be generated in Javadoc?
 How can we specify the parameter?
 -- By default, Public methods and data memebers will have docs generated. 
 -- To specify it: in build.gradle
 
 ```
 task myJavadocs(type: Javadoc) {    
                          source = sourceSets.main.allJava
                          options.memberLevel = JavadocMemberLevel.PRIVATE
                          classpath = configurations.compile
                          destinationDir = file("./doc/")
                        }
 ```
 
 
 
 