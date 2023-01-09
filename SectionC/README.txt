The solution requires Java 8 or higher, and Maven 3.8.7. These can be found at https://www.java.com/en/download/manual.jsp and https://maven.apache.org/download.cgi
When installing maven you may encounter some trouble with the PATH variable, the readme within the zip file details how to set this correctly and should resolve the problem.

The below steps should work for Windows, Linux, and MacOSX, though if you have any trouble please feel free to contact me through my email, w.abdoolkarim@gmail.com.
To build the solution navigate to the directory and run the command "mvn compile".
To test the solution navigate to the directory and run the command mvn test, the output is only written to the command line, There are 9 test cases.
To run the solution first run "mvn package" then run "java -jar target/gs-maven-0.1.0.jar" 

