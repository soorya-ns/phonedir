# phonedir

There are 4 directories:

##### To Check whether given numbers are Anagrams or not and group it and show the result.
        1. phonedir/phone-directory
        2. phonedir/phone-directory-mysql
        3. phonedir/ui

        ## RUN and Verify Phone Numbers in directory (Windows):
                ## Pre-requisite: Java 8, Maven, MySQL(If you are running phonedir/phone-directory-msql app)
                
                ## Build clean and Install
                        >>mvn clean install
                        >>cd target
                    
                    ## Run One Server
                    ## Case 01: phonedir/phone-directory
                    ## Here Phonedirectory stored as Java Object
                        >>java -jar phone-directory-withoutDB-1.0.0.jar
                    
                    ## Case 01: phonedir/phone-directory-mysql
                    ## Here Phonedirectory stored as in MySQL Data base
                        >>java -jar phone-directory-msql-1.0.0.jar
                
                
                ## UI - Search PhoneNumber by start to type on the Page.

                    ## Open index.html file in any of the browser
                    ## Start type on input box.


   ### Note: If you Type  '88', Exepected Result :
                       ##  Phone Number List ( 5 ), Here  '5' indicates total numbers available in the directory
                       ##     8887766555
                       ##     9887766555
                       ##     6667768885
                       ##     5977766888
                       ##     5977768878


##### To Check whether given numbers are Anagrams or not and group it and show the result.
        4. phonedir/verifyAnagram
            ## RUN Verify Anagramas (Windows):
                ## Pre-requisite: Java 8
                ## Compile the code 
                    >>javac CheckAnagram.java
                ## Run the Code and Pass the OWrds list as below, If your are not passing the Workds the Program will consider default List which are
                ## { "CAT", "DOG", "TAC", "MAD", "DAM", "AMD", "GOD", "SET" }
                    
                    >> java CheckAnagrams  { "CAT", "DOG", "TAC", "MAD", "DAM", "AMD", "GOD", "SET" }

                    Or 

                    >> java CheckAnagram
