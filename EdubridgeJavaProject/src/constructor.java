public class constructor {
    public static class Dat {
        int x;  // Create a class attribute

        // Create a class constructor for the Main class
        public Dat() {
            x = 5;  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            Dat Obj; // Create an object of class Main (This will call the constructor)
            Obj = new Dat();
            System.out.println(Obj.x); // Print the value of x
        }
    }
}
