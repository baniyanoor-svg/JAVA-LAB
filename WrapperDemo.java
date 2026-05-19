// Program to demonstrate wrapper class

class WrapperDemo {
    public static void main(String args[]) {

        int a = 50;

        // converting primitive to object
        Integer obj = Integer.valueOf(a);

        // converting object to primitive
        int b = obj.intValue();

        System.out.println("Value of a = " + a);
        System.out.println("Wrapper object = " + obj);
        System.out.println("Value of b = " + b);
    }
}
