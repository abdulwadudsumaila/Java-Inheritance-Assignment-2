
public class Q {

	public static void main(String[] args) {
	      // Test constructor and toString()
	      Author swadud = new Author("Abdul Wadud", "wadud@amalitech.org", 'M');
	      System.out.println(swadud);  

	      // Test Setters and Getters
	      swadud.setEmail("wadud@amalitech.org");   
	      System.out.println("Name is: " + swadud.getName());
	      //name is: swadud
	      System.out.println("Gender is: " + swadud.getGender());
	      //gender is: m
	      System.out.println("email is: " + swadud.getEmail());
	      //email is: wadud@amalitech.org
	      
	      // Test Book's constructor and toString()
	      Book javaBook = new Book("Java for beginner", swadud, 20, 100);
	      System.out.println(javaBook);  // Book's toString()

	      // Test Setters and Getters
	      javaBook.setPrice(12);
	      javaBook.setQty(400);
	      System.out.println("name is: " + javaBook.getName());
	      //name is: Java for dummies
	      System.out.println("price is: " + javaBook.getPrice());
	      //price is: GHS12
	      System.out.println("qty is: " + javaBook.getQty());
	      //qty is: 400
	      System.out.println("author is: " + javaBook.getAuthor());  // invoke Author's toString()
	      
	      System.out.println("author's name is: " + javaBook.getAuthor().getName());
	      //author's name is: swadud
	      System.out.println("author's email is: " + javaBook.getAuthor().getEmail());
	      //email is wadud@amalitech.org
	      System.out.println("author's gender is: " + javaBook.getAuthor().getGender());
	      //author's gender is: m

	      // Using an anonymous Author instance to create a Book instance
	      Book moreJavaBook = new Book("Java for beginner's",
	            new Author("Sumaila", "sumaila@gmail.com", 'M'), // an anonymous Author's instance
	            19.99, 8);
	      System.out.println(moreJavaBook);  // Book's toString()
	      
	   }
}