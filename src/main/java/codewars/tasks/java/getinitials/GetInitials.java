package codewars.tasks.java.getinitials;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetInitials {

    /*
    Write function toInitials returns initials for a given person name. E.g: "Bill Gates" -> "B. G."
     */
    private static final Logger Log = LogManager.getLogger(GetInitials.class.getName());

    public String toInitials(String fullName){

        String initials;
        String[] splitFullName = fullName.split(" ");
        Log.info("Running toInitials() method");

        if (splitFullName.length == 2) {

            char[] firstName = splitFullName[0].toCharArray();
            char[] lastName = splitFullName[1].toCharArray();

            String nameInitial = Character.toString(firstName[0]);
            String lastNameInitial = Character.toString(lastName[0]);

            initials = nameInitial + ". " + lastNameInitial + ".";

        }else
            Log.error("Please input full name");
            initials = "Please input full name";

        return initials;
    }
}
