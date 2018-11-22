//This program illustrates the Encapsulation process in OOPS
class ClientDetail{
   public static void main(String args[]) {
      Client user = new Client(); 						        //Object created to set client details
      user.setName("Sarthak");								//Setting name
      user.setAge(22);									//Setting age
      System.out.println("Name : " + user.getName() + " Age : " + user.getAge()); 	//Printing out the result
   }
}
class Client{
   private String name;									//Variable declarations
   private String idNum;
   private int age;
   public int getAge() 									//Getter method for Age
   {
      return age;
   }
   public String getName() 								//Getter method for Name
   {
      return name;
   }
   public void setAge(int newAge) 							//Setter method for Age
   {
      age = newAge;
   }
   public void setName(String newName) 							//Setter method for Name
   {
      name = newName;
   }
}
