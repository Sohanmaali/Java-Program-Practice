import java.util.Scanner;
class Project
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("\t+------------------------------------------------------+");
		System.out.println("\t|-------------------WELCOME TO JAVA--------------------|");
	    System.out.println("\t+------------------------------------------------------+");		
		System.out.println("\t| 1. INTRODUCTION OF JAVA                              |");
		System.out.println("\t| 2. VERSION OF JAVA                                   |");
		System.out.println("\t| 3. FEATURES OF JAVA                                  |");
		System.out.println("\t| 4. OOPs BASIC CONCEPTS                               |");
	    System.out.println("\t| 5  JDK,JRE,JVM                                       |");
		System.out.println("\t| 6. COMPILATION PROCESS                               |");
		System.out.println("\t| 7. RULE OF PROGRAMING                                |");
		System.out.println("\t| 8. METHOD                                            |");
		System.out.println("\t| 9. PACKAGES                                          |");
		System.out.println("\t|10. ACCESS MODIFIER                                   |");
		System.out.println("\t|11. DATA TYPES                                        |");
		System.out.println("\t|12. ASCII VALUE                                       |");
		System.out.println("\t|13. VARIABLE                                          |");
		System.out.println("\t|14. OPERATORE                                         |");
		System.out.println("\t|15. CONTROL STRUCTURE                                 |");
		System.out.println("\t+------------------------------------------------------+");
		System.out.println("\t+-------------------------------------------------------+");
	    System.out.println("\t|  ______________   _____________    ______________     |");
		System.out.println("\t| | PRESS 1 FOR  | | PRESS 2 FOR |  | PRESS 3 FOR  |    |");
		System.out.println("\t| | INTRO Of Java| |   VERSION   |  |  FEATURES    |    |");
		System.out.println("\t| |______________| |_____________|  |______________|    |");
		System.out.println("\t|                                                       |");
		System.out.println("\t|  ______________   _____________    ________________   |");
		System.out.println("\t| | PRESS 4 FOR  | | PRESS 5 FOR |  | PRESS 6 FOR    |  |");
		System.out.println("\t| | OOPs CONCEPT | | JDK,JRE,JVM |  |COMPILATION PRO.|  |");
	    System.out.println("\t| |______________| |_____________|  |________________|  |");
		System.out.println("\t|                                                       |");
		System.out.println("\t|  ______________   _____________    ______________     |");
		System.out.println("\t| | PRESS 7 FOR  | | PRESS 8 FOR |  | PRESS 9 FOR  |    |");
		System.out.println("\t| |RULE OF PROG. | |   METHOD    |  |  PACKAGES    |    |");
		System.out.println("\t| |______________| |_____________|  |______________|    |");
		System.out.println("\t|                                                       |");
		System.out.println("\t|  ______________   _____________    ______________     |");
		System.out.println("\t| | PRESS 10 FOR | | PRESS 11 FOR|  | PRESS 12 FOR |    |");
		System.out.println("\t| |ACCESS MODIF. | |  DATA TYPES |  | ASCII VALUE  |    |");
		System.out.println("\t| |______________| |_____________|  |______________|    |");
		System.out.println("\t|                                                       |");
		System.out.println("\t|  ______________   _____________    ______________     |");
		System.out.println("\t| | PRESS 13 FOR | | PRESS 14 FOR|  | PRESS 15 FOR |    |");
		System.out.println("\t| |   VARIABLE   | |  OPERATORE  |  | CONTROL STR. |    |");
		System.out.println("\t| |______________| |_____________|  |______________|    |");
		System.out.println("\t+-------------------------------------------------------+");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		do
		{
		    switch(ch)
		    {
				case 1:
							System.out.println("\t|  ______________   ______________    ______________     |");
							System.out.println("\t| |PRESS 'D' FOR | | PRESS'V' FOR |  | PRESS 'F' FOR|    |");
							System.out.println("\t| |  Defination  | |   Version    |  |   FEATURES   |    |");
							System.out.println("\t| |______________| |______________|  |______________|    |");
		                    String m = sc.next();
			switch(m)
			{
				case "D":
				
				System.out.println("\t+--------------------------------------------------------------------------+");
				System.out.println("\t|---------------------------<INTRODUCTION OF JAVA>-------------------------|");
				System.out.println("\t+--------------------------------------------------------------------------+");		
				System.out.println("\t| DEFINATION:- Java is a programming language and a platform.Java is a high|");
				System.out.println("\t|               level,Roubst,Object-orinted and Secure programing language |");
				System.out.println("\t|                                                                          |");
				System.out.println("\t+--------------------------------------------------------------------------+");
		        System.out.println("\t|-------------------------------<HISTORY OF JAVA>--------------------------|");
	            System.out.println("\t+--------------------------------------------------------------------------+");
				System.out.println("\t|The history of Java is very interesting. Java was originally designed for |");
				System.out.println("\t|interactive television, but it was too advanced technology for the digital|");
				System.out.println("\t|cable television industry at the time.The history of Java starts  with the|");
				System.out.println("\t|Green Team.                                                               |");
				System.out.println("\t|                                                                          |");
				System.out.println("\t|1) James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java  |");
				System.out.println("\t|   language project in June 1991. The small team of sun engineers called  |");
				System.out.println("\t|    Green Team.                                                           |");
				System.out.println("\t|2) Initially it was designed for small, embedded systems in electronic    |");
				System.out.println("\t|   appliances like set-top boxes.                                         |");
				System.out.println("\t|3) Firstly, it was called Greentalk by James Gosling, and the file        |");
				System.out.println("\t|   extension was .gt.                                                     |");
				System.out.println("\t|4) After that, it was called Oak and was developed as a part of the Green |");
				System.out.println("\t|   project.                                                               |");
                System.out.println("\t|5) Why Oak? Oak is a symbol of strength and chosen as a national tree of|");
                System.out.println("\t|   many countries like the U.S.A., France, Germany, Romania, etc      	 |");
                System.out.println("\t|6) In 1995, Oak was renamed as Java because it was already a trademark 	 |");
                System.out.println("\t|	  by Oak Technologies.                                                   |");
                System.out.println("\t|7) Java is an island in Indonesia where the first coffee was produced     |");
                System.out.println("\t|	  (called Java coffee). It is a kind of espresso bean. Java name was     |");
                System.out.println("\t|	  chosen by James Gosling while having a cup of coffee nearby his office.|");
                System.out.println("\t|8) Initially developed by James Gosling at Sun Microsystems(which is 	 |");
                System.out.println("\t|	  now a subsidiary of Oracle Corporation) and released in 1995.          |");				
				System.out.println("\t+--------------------------------------------------------------------------+");
				System.out.println("\t+-------------------------------------------------------+");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 1 FOR  | | PRESS 2 FOR |  | PRESS 3 FOR  |    |");
				System.out.println("\t| | INTRO of java| |   VERSION   |  |  FEATURES    |    |");  
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ________________   |");
				System.out.println("\t| | PRESS 4 FOR  | | PRESS 5 FOR |  | PRESS 6 FOR    |  |");
				System.out.println("\t| | OOPs CONCEPT | | JDK,JRE,JVM |  |COMPILATION PRO.|  |");
				System.out.println("\t| |______________| |_____________|  |________________|  |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 7 FOR  | | PRESS 8 FOR |  | PRESS 9 FOR  |    |");
				System.out.println("\t| |RULE OF PROG. | |   METHOD    |  |  PACKAGES    |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 10 FOR | | PRESS 11 FOR|  | PRESS 12 FOR |    |");
				System.out.println("\t| |ACCESS MODIF. | |  DATA TYPES |  | ASCII VALUE  |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 13 FOR | | PRESS 14 FOR|  | PRESS 15 FOR |    |");
				System.out.println("\t| |   VARIABLE   | |  OPERATORE  |  | CONTROL STR. |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t+-------------------------------------------------------+");
				System.out.println("Enter 0 for exit");
				System.out.println("Enter your choice");
			     m=sc.next();
				 m=m;
				break;
			 
			    case "V":
				
				System.out.println("\t+------------------------------------------------------+");
				System.out.println("\t|-------------------VERSION OF JAVA--------------------|");
				System.out.println("\t+------------------------------------------------------+");		
				System.out.println("\t| 1. JDK 1.0 (23rd Jan 1996)                           |");
				System.out.println("\t| 2. JDK 1.1 (19th Feb 1997)                           |");
				System.out.println("\t| 3. J2SE 1.2 (8th Dec 1998)                           |");
				System.out.println("\t| 4. J2SE 1.3 (8th May 2000)                           |");
			    System.out.println("\t| 5. J2SE 1.4 (6th Feb 2002)                           |");
				System.out.println("\t| 6. J2SE 5.0 (30th Sep 2004)                          |");
				System.out.println("\t| 7. Java SE 6 (11th Dec 2006)                         |");
				System.out.println("\t| 8. Java SE 7 (28th July 2011)                        |");
				System.out.println("\t| 9. Java SE 8 (18th Mar 2014)                         |");
				System.out.println("\t|10. Java SE 9 (21st Sep 2017)                         |");
				System.out.println("\t|11. Java SE 10 (20th Mar 2018)                        |");
				System.out.println("\t|12. Java SE 11 (25th Sep 2018)                        |");
				System.out.println("\t|13. Java SE 12 (19th March 2019)                      |");
				System.out.println("\t|14. Java SE 13 (17th Sep 2019)                        |");
				System.out.println("\t|15. Java SE 14 (17th Mar 2020)                        |");
				System.out.println("\t|16. Java SE 15 (15th Sep 2020)                        |");
				System.out.println("\t|17. Java SE 16 (16th Mar 2021)                        |");
				System.out.println("\t|18. Java SE 17 (14th September 2021)                  |");
				System.out.println("\t|19. Java SE 18 (to be released by March 2022)         |");
				System.out.println("\t+------------------------------------------------------+");
				System.out.println("\t+-------------------------------------------------------+");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 1 FOR  | | PRESS 2 FOR |  | PRESS 3 FOR  |    |");
				System.out.println("\t| | INTRO of java| |   VERSION   |  |  FEATURES    |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ________________   |");
				System.out.println("\t| | PRESS 4 FOR  | | PRESS 5 FOR |  | PRESS 6 FOR    |  |");
				System.out.println("\t| | OOPs CONCEPT | | JDK,JRE,JVM |  |COMPILATION PRO.|  |");
				System.out.println("\t| |______________| |_____________|  |________________|  |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 7 FOR  | | PRESS 8 FOR |  | PRESS 9 FOR  |    |");
				System.out.println("\t| |RULE OF PROG. | |   METHOD    |  |  PACKAGES    |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 10 FOR | | PRESS 11 FOR|  | PRESS 12 FOR |    |");
				System.out.println("\t| |ACCESS MODIF. | |  DATA TYPES |  | ASCII VALUE  |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 13 FOR | | PRESS 14 FOR|  | PRESS 15 FOR |    |");
				System.out.println("\t| |   VARIABLE   | |  OPERATORE  |  | CONTROL STR. |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t+-------------------------------------------------------+");
				System.out.println("Enter 0 for exit");
				System.out.println("Enter your choice");
			    m=sc.next();
				m=m;
				break;	
				case "F":
				
				System.out.println("\t+----------------------------------------------------------------------------+");
				System.out.println("\t|--------------------------------FEATURES OF JAVA----------------------------|");
				System.out.println("\t+----------------------------------------------------------------------------+");		
				System.out.println("\t| 1.SIMPLE:- Java is very easy to learn, and its syntax is simple, clean and |");
				System.out.println("\t|            easy to understand. According to Sun Microsystem, Java language |");
				System.out.println("\t|            is a simple programming language because:.                      |");
				System.out.println("\t|          *  Java syntax is based on C++ (so easier for programmers to learn|");
			    System.out.println("\t|             it after C++).                                                 |");
				System.out.println("\t|          * Java has removed many complicated and rarely-used features, for |");
				System.out.println("\t|            example, explicit pointers, operator overloading, etc.          |");
				System.out.println("\t|          * There is no need to remove unreferenced objects because  there  |");
				System.out.println("\t|            is an Automatic Garbage Collection in Java.                     |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t| 2.OBJECT-ORINENTED:- Java is an object-oriented programming language.      |");
				System.out.println("\t|                      Everything in Java is an object. Object-oriented means|");
				System.out.println("\t|                     we organize our software as a combination of different |");
				System.out.println("\t|                   types of objects that incorporate both data and behavior.|");
				System.out.println("\t|   * Object-oriented programming (OOPs) is a methodology that simplifies    |");
				System.out.println("\t|     software development and maintenance by providing some rules.          |");
				System.out.println("\t|    <<< Basic concepts of OOPs are: >>>                                     |");
				System.out.println("\t|        1. Object                                                           |");
				System.out.println("\t|        2. Class                                                            |");
				System.out.println("\t|        3. Inheritance                                                      |");
				System.out.println("\t|        4. Polymorphism                                                     |");
				System.out.println("\t|        5. Abstraction                                                      |");
				System.out.println("\t|        6. Encapsulation                                                    |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t| 3.SECURED:- Java is best known for its security. With Java, we can develOP |");
				System.out.println("\t|             virus-free systems. Java is secured because:                   |");
				System.out.println("\t|           << No explicit pointer                                           |");
				System.out.println("\t|           << Java Programs run inside a virtual machine sandbox            |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t| 4.PLATFORM INDEPENDENT:- Java program can run on any platform that has a   |");
				System.out.println("\t|                          Java Virtual Machine(JVM),which makes Java program|");
				System.out.println("\t|                          highly portable.                                  |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t| 5.PORTABLE:- Java is portable because it facilitates you to carry the Java |");
				System.out.println("\t|            bytecode to any platform. It doesn't require any implementation.|");
				System.out.println("\t|                                                                            |");
				System.out.println("\t| 6.ROBUST:- * It uses strong memory management.                             |");
				System.out.println("\t|            * There is a lack of pointers that avoids security problems.    |");
				System.out.println("\t|            * There are exception handling and the type checking mechanism  |");
				System.out.println("\t|              in Java. All these points make Java robust.                   |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t| 7.ARCHITECTURE-NEUTRAlL:- Java is architecture neutral because there are no|");
				System.out.println("\t|                         implementation dependent features, for example, the|");
				System.out.println("\t|                          size of primitive types is fixed.                 |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t| 8.HIGH-PERFORMANCE:-Java is faster than other traditional interpreted prog-|");
				System.out.println("\t|                    RAmming languages because Java bytecode is close to     |");
				System.out.println("\t|                    native code.It is still a little bit slower than a      |");
				System.out.println("\t|                    compiled language (e.g., C++). Java is an interpreted   |");
				System.out.println("\t|                   language that is why it is slower than compiled languages|");
				System.out.println("\t|                   e.g., C, C++, etc.                                       |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t| 9.DISTRIBUTED:- Java is distributed because it facilitates users to create |");
				System.out.println("\t|                distributed applications in Java. RMI and EJB are used for  |");
				System.out.println("\t|                creating distributed applications.  This feature of Java    |");
				System.out.println("\t|                makes us able to access files by calling the methods from   |");
				System.out.println("\t|                any machine on the internet.                                |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t|10.MULTI-THREADED:- A thread is like a separate program, executing concurren|");
				System.out.println("\t|                  -tly. We can write Java programs that deal with many tasks|");
				System.out.println("\t|                  at once by defining multiple threads. The main advantage  |");
				System.out.println("\t|               of multi-threading is that it doesn't occupy memory for each |");
				System.out.println("\t|                thread. multi-media, Web applications, etc.                 |");
				System.out.println("\t|                                                                            |");
				System.out.println("\t|11.DYNAMIC:- Java is a dynamic language. It supports the dynamic loading of |");
				System.out.println("\t|            classes. It means classes are loaded on demand. It also supports|");
				System.out.println("\t|           functions from its native languages, i.e., C and C++.            |");
				System.out.println("\t+----------------------------------------------------------------------------+");
				System.out.println("\t+-------------------------------------------------------+");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 1 FOR  | | PRESS 2 FOR |  | PRESS 3 FOR  |    |");
				System.out.println("\t| | INTRO of java| |   VERSION   |  |  FEATURES    |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ________________   |");
				System.out.println("\t| | PRESS 4 FOR  | | PRESS 5 FOR |  | PRESS 6 FOR    |  |");
				System.out.println("\t| | OOPs CONCEPT | | JDK,JRE,JVM |  |COMPILATION PRO.|  |");
				System.out.println("\t| |______________| |_____________|  |________________|  |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 7 FOR  | | PRESS 8 FOR |  | PRESS 9 FOR  |    |");
				System.out.println("\t| |RULE OF PROG. | |   METHOD    |  |  PACKAGES    |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 10 FOR | | PRESS 11 FOR|  | PRESS 12 FOR |    |");
				System.out.println("\t| |ACCESS MODIF. | |  DATA TYPES |  | ASCII VALUE  |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 13 FOR | | PRESS 14 FOR|  | PRESS 15 FOR |    |");
				System.out.println("\t| |   VARIABLE   | |  OPERATORE  |  | CONTROL STR. |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t+-------------------------------------------------------+");
				System.out.println("Enter 0 for exit");
				System.out.println("Enter your choice");
			    m=sc.next();
			    m=m;
				break;
			}	
				case 4:
				System.out.println("\t+----------------------------------------------------------------------------+");
				System.out.println("\t|----------------------------OOPs CONCEPT OF JAVA----------------------------|");
				System.out.println("\t+----------------------------------------------------------------------------+");	
				System.out.println("\t|	1. Inheritance: Inheritance is a mechanism in Java that allows a new class |");
				System.out.println("\t|	               to be based on an existing class. The new class inherits the|"); 
				System.out.println("\t|             	properties and methods of the existing class and can also  |");
				System.out.println("\t|                  add new properties and methods.                           |");
                System.out.println("\t|                                                                            |");
				System.out.println("\t|	2. Encapsulation: Encapsulation is the process of hiding the implementation|");
				System.out.println("\t|	                  details of a class and  exposing only the necessary      |");
				System.out.println("\t|	                  information to the  outside world. This can be achieved  |");
				System.out.println("\t|	                  by using  access modifiers such as public, private,and   |");
				System.out.println("\t|	                  protected.                                               |");
				System.out.println("\t|	                                                                           |");
                System.out.println("\t| 3. Polymorphism: Polymorphism is the ability of a Java object to take on   |");
				System.out.println("\t|	                many forms. This can be achieved through method overloading|");
				System.out.println("\t|	                 and method overriding.                                    |");
				System.out.println("\t|	                                                                           |");
				System.out.println("\t|	4. Abstraction: Abstraction is the process of creating a simple model of a |");
				System.out.println("\t|	                complex system.In Java, abstraction can be achieved through|"); 
				System.out.println("\t|	                 abstract classes and interfaces.                          |");
				System.out.println("\t|	                                                                           |");
                System.out.println("\t| 5. Class: A class is a blueprint for creating objects in Java. It defines  |"); 
				System.out.println("\t|            the properties and methods that an object will have.            |");
				System.out.println("\t|	                                                                           |");
				System.out.println("\t|	6. Object: An object is an instance of a class.  It has its own set of     |");
				System.out.println("\t|	           properties and methods.                                         |");
                System.out.println("\t|                                                                            |");
				System.out.println("\t|	7. Method: A method is a block of code that performs a specific task. It   |");
				System.out.println("\t|	          can be called by an object to perform that task.                 |");
				System.out.println("\t+----------------------------------------------------------------------------+");
				System.out.println("\t+-------------------------------------------------------+");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 1 FOR  | | PRESS 2 FOR |  | PRESS 3 FOR  |    |");
				System.out.println("\t| | INTRO of java| |   VERSION   |  |  FEATURES    |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ________________   |");
				System.out.println("\t| | PRESS 4 FOR  | | PRESS 5 FOR |  | PRESS 6 FOR    |  |");
				System.out.println("\t| | OOPs CONCEPT | | JDK,JRE,JVM |  |COMPILATION PRO.|  |");
				System.out.println("\t| |______________| |_____________|  |________________|  |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 7 FOR  | | PRESS 8 FOR |  | PRESS 9 FOR  |    |");
				System.out.println("\t| |RULE OF PROG. | |   METHOD    |  |  PACKAGES    |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 10 FOR | | PRESS 11 FOR|  | PRESS 12 FOR |    |");
				System.out.println("\t| |ACCESS MODIF. | |  DATA TYPES |  | ASCII VALUE  |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t                                                        |");
				System.out.println("\t|  ______________   _____________    ______________     |");
				System.out.println("\t| | PRESS 13 FOR | | PRESS 14 FOR|  | PRESS 15 FOR |    |");
				System.out.println("\t| |   VARIABLE   | |  OPERATORE  |  | CONTROL STR. |    |");
				System.out.println("\t| |______________| |_____________|  |______________|    |");
				System.out.println("\t+-------------------------------------------------------+");
				System.out.println("Enter 0 for exit");
				System.out.println("Enter your choice");
			    n=sc.nextInt();
			    ch=n;
				break;
			
			}
		}
		while(ch!=0);
    }
}