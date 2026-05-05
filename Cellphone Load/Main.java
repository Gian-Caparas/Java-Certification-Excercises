public class Main {
    public static void main(String[] args) {
        // 1. Create a Phone instance
        Phone myPhone = new Phone();
        System.out.println("Initial State:");
        System.out.println(myPhone.toString());
        System.out.println("---");

        // 2. Create different types of loads
        // These now work because the classes are defined at the top level
        CellphoneLoad cit = new CITLoad(); 
        CellphoneLoad ct = new CTLoad();   
        CellphoneLoad internet = new ILoad(); 

        // 3. Test loading
        System.out.println("Action: Loading CITLoad...");
        myPhone.load(cit);
        System.out.println(myPhone.toString());
        
        System.out.println("\nAction: Loading ILoad...");
        myPhone.load(internet);
        System.out.println(myPhone.toString());

        // 4. Verifying getters
        System.out.println("\n--- Load Verification ---");
        System.out.println("CIT Load - Has Unlimited Calls: " + cit.getHasUnlimitedCalls());
        System.out.println("CIT Load - Has Unlimited Texts: " + cit.getHasUnlimitedTexts());
        System.out.println("CIT Load - Internet MB: " + cit.getInternetMB());
    }
}