#installation
java 7 and 8 can be installed in parallel.
<check java>
cmd > java

JDK = java development kit 
java = JRE
javac = Compiler
libraries

installation location
C:\Program Files\Java\jre7\

<setting bin to the path>
Q: java command works, but javac is not working.
S: use environmental variable
path=C:\Program Files\Java\jdk1.7.0_80\bin

#creating your first java Program
<source code>
class FirstProgram {
public static void main(String args[]){
	System.out.println("First Program");
}
}

#compling
javac FirstProgram.java
<bytecode>
FirstProgram.class

#running 
java FirstProgram

