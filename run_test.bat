@echo off

set MODULE=Projects\Personal\lib\lib
set METHOD_NAME=-Dtest=com.personal.test.LibClassTest#testLibMethod

%~dp0\mvnw -pl %MODULE% "%METHOD_NAME%" "-Dsurefire.failIfNoSpecifiedTests=false" -am test
