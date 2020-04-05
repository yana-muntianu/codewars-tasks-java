package codewars.tasks.java.salesmantravel;

import java.util.ArrayList;
import static java.util.stream.Stream.of;

public class Travel {

    /*
    A traveling salesman has to visit clients. He got each client's address e.g. "432 Main Long Road St. Louisville OH 43071" as a list.
The basic zipcode format usually consists of two capital letters followed by a white space and five digits. The list of
clients to visit was given as a string of all addresses, each separated from the others by a comma, e.g. :
"123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432".
To ease his travel he wants to group the list by zipcode.
Task
The function travel will take two parameters r (addresses' list of all clients' as a string) and zipcode and returns a string in the following format:
zipcode:street and town,street and town,.../house number,house number,...
The street numbers must be in the same order as the streets where they belong.
If a given zipcode doesn't exist in the list of clients' addresses return "zipcode:/"
     */

    public static String travel(String r, String zipcode) {

        ArrayList<String> streets = new ArrayList<>();
        ArrayList<String>  apartments = new ArrayList<>();
        String filteredAddress;

        of(r.split(",")).filter(s -> zipcode.equals(s.substring(s.length() - 8))).forEach(address -> {
                    streets.add(address.substring(address.indexOf(' ') + 1, address.length() - 9));
                    apartments.add(address.substring(0, address.indexOf(' ')));
                });

        filteredAddress = zipcode + ":" + String.join(",", streets) + "/" + String.join(",", apartments);
        return filteredAddress;
    }
}
