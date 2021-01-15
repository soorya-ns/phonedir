package com.phonedirectory.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

 

@Component
public class PhoneNumberDirecory {

      

       private  Set<String> phoneDirectory = new HashSet<>();;

      

       public PhoneNumberDirecory() {

             

              phoneDirectory.add("9972243210");

              phoneDirectory.add("9972243215");

              phoneDirectory.add("9972243220");

              phoneDirectory.add("9972243225");

              phoneDirectory.add("9972243230");

              phoneDirectory.add("9972243235");

              phoneDirectory.add("9972243240");

              phoneDirectory.add("9972243245");

              phoneDirectory.add("9972243250");

              phoneDirectory.add("9972243255");

              phoneDirectory.add("9972243260");

              phoneDirectory.add("9972243265");

              phoneDirectory.add("9972243270");

              phoneDirectory.add("9972243275");

              phoneDirectory.add("9972243280");

              phoneDirectory.add("9972243285");

              phoneDirectory.add("9972243290");

              phoneDirectory.add("9972243295");

             

              phoneDirectory.add("9972288860");

              phoneDirectory.add("8872243265");

              phoneDirectory.add("6677243260");

              phoneDirectory.add("8888843277");

              phoneDirectory.add("6666884326");

              phoneDirectory.add("6662243265");

             

       }
       

       public List<String> findAll() {
    	   
           return new ArrayList<>(phoneDirectory);

    }

       public boolean addNumber(String number) {

              return phoneDirectory.add(number);

       }

      


      

 

}
