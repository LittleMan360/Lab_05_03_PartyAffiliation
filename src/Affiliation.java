public class Affiliation
{
    public static void main(String[] args)
    {

        ////Declare variables
        //	    	    String partyAffiliation
        //		    String democrat = “You get a Democratic Donkey.”
        //		    String republican = “You get a Republican Elephant.”
        //		    String independent = “You get an Independent Man.”
        //	    	    //Prompt and input
        //	    	    output “Enter your electoral party affiliation”
        //	    	    input partyAffiliation
        //	    	    //Process
        //	    If partyAffiliation = “Democrat” then
        //		partyAffiliation = democrat
        //	    Else if partyAffiliation = “Republican” then
        //		partyAffiliation = republican
        //	    Else if partyAffiliation = “Independent” then
        //		partyAffiliation = independent
        //	    Else
        //partyAffiliation = “Party affiliation options are Democrat, Republican, or Independent”
        //	    endif
        //          	    //Output
        //	        	    output partyAffiliation

        //Declare variables
        String partyAffiliation;
        String democrat = "You get a Democratic Donkey.";
        String republican = "You get a Republican Elephant.";
        String independent = "You get an Independent Man.";
        String other = "Your Affiliation is Other ";
        String menuChoice;
        //Made menu for valid choices
        String menu = "D = Democrat, R = Republican, I = Independent, O = any other "; // [DRIO]


        //Prompt and input
        //Simulated prompt for input
        System.out.println("Enter your electoral party affiliations first letter");

        //Simulated input menu
        menuChoice = "i";

        //process Input
        if (menuChoice.equalsIgnoreCase("D"))
        {
            //attaches party affiliation to appropriate string
            partyAffiliation = democrat;
        }
        else if (menuChoice.equalsIgnoreCase("R"))
        {
            partyAffiliation = republican;
        }
        else if (menuChoice.equalsIgnoreCase("I"))
        {
            partyAffiliation = independent;
        }
        else //any other answer
        {
            partyAffiliation = other;
        }

        //prints appropriate string to party affiliation
        System.out.println(partyAffiliation);

    }
}