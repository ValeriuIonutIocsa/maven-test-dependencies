@echo off

set MODULE=Projects\Personal\main\main
set METHOD_NAME=-Dtest=com.personal.test.DynamicEvenNumberTest#testEvenNumbers

%~dp0\mvnw -pl %MODULE% "%METHOD_NAME%" "-Dsurefire.failIfNoSpecifiedTests=false" -am test
