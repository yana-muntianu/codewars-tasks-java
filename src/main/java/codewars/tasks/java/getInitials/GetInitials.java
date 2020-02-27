package codewars.tasks.java.getInitials;

public class GetInitials {

    /*
    Write function toInitials returns initials for a given person name. E.g: "Bill Gates" -> "B. G."
     */
    public String toInitials(String fullName){

        String initials;
        String[] splitFullName = fullName.split(" ");
        if (splitFullName.length == 2) {

            char[] firstName = splitFullName[0].toCharArray();
            char[] lastName = splitFullName[1].toCharArray();

            String nameInitial = Character.toString(firstName[0]);
            String lastNameInitial = Character.toString(lastName[0]);

            initials = nameInitial + ". " + lastNameInitial + ".";

            System.out.println(initials);
        }else
            initials = "Please input full name";

        return initials;
    }
}
