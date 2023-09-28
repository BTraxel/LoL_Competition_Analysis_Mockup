//First Name class
//F21SF - Jamie
//Modified by Barthélémy Traxel

public class Name {
  private String firstName, middleName, lastName;


  public Name(String fName, String lName) {
        firstName = fName;
        middleName = "";
        lastName = lName;
  }
   //constructor to create object with first, middle and last name
   //if there isn't a middle name, that parameter could be an empty String // mjg is this good?
   public Name(String fName, String mName, String lName) {
// This doesn't work:  public Name(String fName, mName, lName) {
		firstName  = fName;
		middleName = mName;
		lastName   = lName;
   }

   public Name (String fullName) {
       int spacePos1 = fullName.indexOf(' ');
       firstName = fullName.substring(0, spacePos1);
       int spacePos2 = fullName.lastIndexOf(' ');
       if (spacePos1 == spacePos2)
           middleName = "";
       else
           middleName = fullName.substring(spacePos1 + 1, spacePos2);
       lastName = fullName.substring(spacePos2 + 1);
   }

    public String getFirstName() {return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName()  {return lastName; }

    public void setFirstName(String fn) {
        firstName = fn;
    }
    public void setMiddleName(String mn) {
        middleName = mn;
    }
    public void setLastName(String ln) { lastName = ln; }
  
  //returns the first name then a space then the last name
    public String getFirstAndLastName() { return firstName + " " + lastName; }

    public String getFullName() {
        String result = firstName + " ";
        if (!middleName.equals("")) {
            result += middleName + " ";
        }
        result += lastName;
        return result;
    }
  
  //returns the last name followed by a comma and a space
  //  then the first name
    public String getLastCommaFirst() { return lastName + ", "+ firstName; }
  
  //returns name in the format initial, period, space, lastname
    public String getInitPeriodLast() { return firstName.charAt(0) + ". " + lastName; }

    public String getInit() {
        String result = ""+firstName.charAt(0);
        if (!middleName.equals("")) {
            result += middleName.charAt(0);
        }
        result += lastName.charAt(0);
        return result;
    }

}
  
 
