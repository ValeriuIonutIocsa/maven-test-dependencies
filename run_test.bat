@echo off

%~dp0\mvnw -pl Projects\Personal\lib\lib ^
"-Dtest=com.personal.test.LibClassTest#testLibMethod" "-Dsurefire.failIfNoSpecifiedTests=false" -am test
