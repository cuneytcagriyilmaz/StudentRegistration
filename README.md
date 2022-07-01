# StudentRegistration

Let's make a student registration system. Let's read student information from a json file. Let's keep the information we read in a list, then let the list return and a method of reading the information. The methods of reading from the file and printing the information we read to the console should be planned as 2 separate threads. Student information will be mapped to json and set to attributes in a class like Student.java. Let's create the project as a maven project. Let's follow the Single responsibility principle while doing the homework. In addition, let's implement the Runnable interface for the thread class. Let's use Thread.sleep(3000) between reading and writing to console, there should be no printing to console without reading data. Json example could be like this:
{"students": [{"name":"trial", "surname":"trial", "age": 18},
{"name":"trial", "surname":"trial", "age" : 18},
{"name":"trial", "surname":"trial", "age": 18},
{"name":"trial", "surname":"trial", "age": 18 } ]}
