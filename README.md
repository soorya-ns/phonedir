# phonedir

There are 4 directories:

##### To Check whether given numbers are Anagrams or not and group it and show the result.
        1. phonedir/phone-directory
        2. phonedir/phone-directory-mysql
        3. phonedir/ui

        ## RUN and Verify Phone Numbers in directory (Windows):
                ## Pre-requisite: Java 8, Maven
                
                ## Build clean and Install
                        >>mvn clean install
                    
                    ## Run One Server
                        >>mvn spring-boot:run
                
                
                ## UI - Search Name by start to type on the Page.

                    ## Open index.html file in any of the browser
                    ## Start type on input box.


   ### Note: If you Type  'Sa', Exepected Result :
                       ##  Name aand Phone Number List ( 5 ), Here  '5' indicates total numbers available in the directory
                       ##     Saranya 8887766555
                       ##     Ninasa 9887766555
                      


##### To Check whether given numbers are Anagrams or not and group it and show the result.
        4. phonedir/verifyAnagram
            ## RUN Verify Anagramas (Windows):
                ## Pre-requisite: Java 8
                ## Compile the code 
                    >>javac CheckAnagram.java
                ## Run the Code and Pass the OWrds list as below, If your are not passing the Workds the Program will consider default List which are
                ## { "CAT", "DOG", "TAC", "MAD", "DAM", "AMD", "GOD", "SET" }
                    
                    >> java CheckAnagrams  CAT  DOG TAC MAD DAM AMD GOD SET

                    Or For default Array test

                    >> java CheckAnagram
