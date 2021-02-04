package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> females = new ArrayList<Person>();

        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("female")){
                females.add(person);
            }
        }
        return females;
    }
}
