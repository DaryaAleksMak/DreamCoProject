package dreamco.project.util;

import dreamco.project.model.Categories;
import dreamco.project.model.Desire;

import java.util.*;


/**
 * Created by Artyom on 29.09.2016.
 */
public class CategoriesUtil {
  public static List<Desire> jobCategory = Collections.synchronizedList(new Vector<Desire>());
  public static List<Desire> desireCategory = Collections.synchronizedList(new Vector<Desire>());
  public static List<Desire> hobbieCategory = Collections.synchronizedList(new Vector<Desire>());
  public static List<Desire> restCategory = Collections.synchronizedList(new Vector<Desire>());

    public static void categoryInitialize(Collection<Desire> desires){
        hobbieCategory.removeAll(desires);
        jobCategory.removeAll(desires);
        desireCategory.removeAll(desires);
        restCategory.removeAll(desires);

        for(Desire desire : desires) {
            if (desire.getCategories().equals("Desire")) {
                desireCategory.add(desire);
            }
            if (desire.getCategories().equals("Job")) {
                jobCategory.add(desire);
            }
            if (desire.getCategories().equals("Rest")) {
                restCategory.add(desire);
            }
            if (desire.getCategories().equals("Hobbie")) {
                hobbieCategory.add(desire);
            }
        }
    }

    public static List<Desire> getCategory(String categories){
        List<Desire> categoriesList = new ArrayList<>();

        if(categories.equals("Desire")){
            return desireCategory;
        }
        if(categories.equals("Job")){
            return jobCategory;
        }
        if(categories.equals("Hobbie")){
            return hobbieCategory;
        }
        if(categories.equals("Rest")){
            return  restCategory;
        }
        categoriesList.addAll(desireCategory);
        categoriesList.addAll(jobCategory);
        categoriesList.addAll(hobbieCategory);
        categoriesList.addAll(restCategory);
        return categoriesList;
    }

}
