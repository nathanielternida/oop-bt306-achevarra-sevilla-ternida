import java.util.*;

//  (Abstract Class)
abstract class Abstrak {
    // Abstract method
    public abstract void displayPlayerInfo(); //Will be overridden, it'll be used to display informations.
    
    public abstract void endGame(String name, double prize);//Method Overloading
}

// Interface
interface interpeys {
    void startGame(String name, int date); //This method will serve as the "STORY" of the Game.
    
}

// Player class with encapsulation and constructors (Encapsulation, Constructors)
class TroyInHeat extends Abstrak implements interpeys { //Player Class with Inheritance and Polymorphism
    private String name;
    private int age;
    private String gender;
    private String height;
    private String hairstyle;
    private String hairColor;
    private String facialExpression;
    private String facialHairStyle;
    private String skinColor;
    private String faceShape;
    private String noseShape;
    private String eyesColor;
    private String lipShape;
    private String lipColor;
    private String earShape;
    private String bodyShape;
    private String tattooArt;
    private String earrings;
    private String Necklace;
    private String wristAccessory;
    private String shirts;
    private String shorts;
    private String capHat;
    private String footWear;

    // Default constructor (Constructors)
    public TroyInHeat() {
        
    }

    // (Constructors)
    public TroyInHeat(String name, int age, String gender) {
        this(); // Default Constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // (Constructor Overloading) //Character
    public TroyInHeat(String name, int age, String gender, String hairstyle, String hairColor, String height, String facialExpression, String facialHairStyle, String faceShape, 
    String skinColor, String noseShape, String eyesColor, String lipShape, String lipColor, String earShape, String bodyShape, String tattooArt, String earrings,
    String Necklace, String wristAccessory, String shirts, String shorts, String capHat, String footWear) {
 
        this(name, age, gender);
        this.hairstyle = hairstyle;
        this.hairColor = hairColor;
        this.height = height;
        this.facialExpression = facialExpression;
        this.facialHairStyle = facialHairStyle;
        this.faceShape = faceShape;
        this.skinColor = skinColor;
        this.noseShape = noseShape;
        this.eyesColor = eyesColor;
        this.lipShape = lipShape;
        this.lipColor = lipColor;
        this.earShape = earShape;
        this.bodyShape = bodyShape;
        this.tattooArt = tattooArt;
        this.earrings = earrings;
        this.Necklace = Necklace;
        this.wristAccessory = wristAccessory;
        this.shirts = shirts;
        this.shorts = shorts;
        this.capHat = capHat;
        this.footWear = footWear;
    }
    //Setter Methods (Encapsulation)
    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
    
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    
    public void setHeight(String height){
        this.height = height;
    }
    
    public void setFacialExpression(String facialExpression){
        this.facialExpression = facialExpression;
    }
    
    public void setFacialHairStyle(String facialHairStyle){
        this.facialHairStyle = facialHairStyle;
    }
    
    public void setSkinColor (String skinColor){
        this.skinColor = skinColor;
    }
    
    public void setFaceShape (String faceShape){
        this.faceShape = faceShape;
    }
    
    public void setNoseShape(String noseShape){
        this.noseShape = noseShape;
    }
    
    public void setEyesColor (String eyesColor){
        this.eyesColor = eyesColor;
    }
    
    public void setLipShape (String lipShape){
        this.lipShape = lipShape;
    }
    
    public void setLipColor (String lipColor){
        this.lipColor = lipColor;
    }
    
    public void setEarShape (String earShape){
        this.earShape = earShape;
    }
    
    public void setBodyShape(String bodyShape){
        this.bodyShape = bodyShape;
    }
    
    public void setTattoArt (String tattooArt){
        this.tattooArt = tattooArt;
    }
    
    public void setEarrings (String earrings){
        this.earrings = earrings;
    }
    
    public void setNecklace (String Necklace){
        this.Necklace = Necklace;
    }
    
    public void setWristAccessory (String wristAccessory){
        this.wristAccessory = wristAccessory;
    }
    
    public void setShirts (String shirts){
        this.shirts = shirts;
    }
    
    public void setShorts (String shorts){
        this.shorts = shorts;
    }
    
    public void setCapHat (String capHat){
        this.capHat = capHat;
    }
    
    public void setFootWear (String footWear){
        this.footWear = footWear;
    }

    // Getter methods(Encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    public String getHeight(){
        return height;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public String getHairColor() {
        return hairColor;
    }
    
    public String getFaceShape(){
        return faceShape;
    }
    
    public String getFacialExpression(){
        return facialExpression;
    }
    
    public String getFacialHairStyle(){
        return facialHairStyle;
    }
    
    public String getNoseShape(){
        return noseShape;
    }
    
    public String getSkinColor(){
        return skinColor;
    }
    
    public String getEyesColor(){
        return eyesColor;
    }
    
    public String getLipShape(){
        return lipShape;
    }
    
    public String getLipColor(){
        return lipColor;
    }
    
    public String getEarShape(){
        return earShape;
    }
    
    public String getEarrings(){
        return earrings;
    }
    
    public String getBodyShape(){
        return bodyShape;
    }
    
    public String getTattoArt(){
        return tattooArt;
    }
    
    public String getNecklace(){
        return Necklace;
    }
    
    public String getWristAccessory(){
        return wristAccessory;
    }
    
    public String getShirts(){
        return shirts;
    }
    
    public String getShorts(){
        return shorts;
    }
    
    public String getCapHat(){
        return capHat;
    }
    
    public String getFootWear(){
        return footWear;
    }
    
    // (Method Overriding)
    public void displayPlayerInfo() { //Abstract Method, (METHOD OVERRIDING)
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");//Space
        System.out.println("Thank you for Playing Bihisan Mo Ko, Beybe!");
        System.out.println("Welcome to BIHISAN MO KO BEYBE");
        System.out.println("Hi " + name +"!");
        System.out.println("Your age is: " + age);
        System.out.println("You are a: " + gender);
        System.out.println("Your Height is: " + height);
        System.out.println("Your Hairstyle is: " + hairstyle);
        System.out.println("Your Hair Color is: " + hairColor);
        System.out.println("Your Face Shape is: " + faceShape);
        System.out.println("Your Facial Expression is: " + facialExpression);
        System.out.println("Your Facial Hair Style is: " + facialHairStyle);
        System.out.println("Your Skin Color is: " + skinColor);
        System.out.println("Your Nose Shape is: " + noseShape);
        System.out.println("Your Eyes Color is: " + eyesColor);
        System.out.println("Your Lip Shape is: " + lipShape);
        System.out.println("Your Lip Color is: " + lipColor);
        System.out.println("Your Ear Shape is: " + earShape);
        System.out.println("Your Earrings are: " + earrings);
        System.out.println("Your Body Shape is: " + bodyShape);
        System.out.println("Your Tattoo/Body Art is: " + tattooArt);
        System.out.println("Your Necklace is: " + Necklace);
        System.out.println("Your Wrist Accessory is: " + wristAccessory);
        System.out.println("Your Shirt is: " + shirts);
        System.out.println("Your Shorts is: " + shorts);
        System.out.println("Your Cap/Hat is: " + capHat);
        System.out.println("Your Footwear is: " + footWear);
    }

    // Implement the interface method (Polymorphism)
    //Method Overloading
    public void startGame(String name, int date) {//Method Overriding From Interface
        System.out.println("Once upon a time, there was a Virtual Character Show called 'Bihisan Mo Ko, Beybe' – the ultimate character adventure!");
        System.out.println("Meet " + name + ", a  Bigender virtual character ready to conquer the show. But there's a problem – s/he doesn't have a face and clothes.");
        System.out.println("As the Player, you hold the key to" + name + "'s style success. The stage is set, the lights are dim, and " + name + " stands in need of a show-stopping face and outfit.");
        System.out.println("What will be the fashion statement of this "+ date +"? It's your turn to design and dazzle in this virtual fashion extravaganza!");

    }
    //Method Overloading
    public void endGame(String name, double prize){//Method Overloading and Overriding
        System.out.println("Congratulations "+ name + ", for winning the 'Bihisan Mo Ko, Beybe!' contest. You will receive a prize amounting $"+prize+" Congratulations and thank you for participating!");
    }
}

public class BihisanMokoBeybe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        TroyInHeat player = new TroyInHeat();
        
        player.startGame("Juned", 2024);//Method Overloading //Story
        
        Laro(scan);
        
        // Name, Age, Gender (Constructors, Method Overloading)
        player = create(scan);

        // Customizing the character (Encapsulation) Eto yung mga naka setter and getter method
        customizeCharacter(player, scan);

        // Displaying player information (Polymorphism, Method Overriding)
        player.displayPlayerInfo();
        
        player.endGame("Juned", 30500.99);//Method Overloading
    }
    private static void Laro(Scanner scan) {
        System.out.print("\nBut First! Have you played a game like this before? Yes or No: "); // Boolean
        String sagot = scan.nextLine();
        boolean sagotmo;

        if (sagot.equalsIgnoreCase("Yes")) {
            sagotmo = true;
            System.out.println("Great!");
            System.out.println("Welcome to Bihisan Moko, Beybe!");
        } else if (sagot.equalsIgnoreCase("No")) {
            sagotmo = false;
            System.out.println("This Game is a Choice-Based Game. You'll be the stylist of Juned that will help him to win the contest.");
            System.out.println("There will be questions/choices regarding the style/color you prefer.");
            System.out.println("Please choose only the number for any option. Selecting a number that is not among the choices will result in asking you over and over again.");
    
            // Ask if the user understands how the game works
            System.out.print("Do you understand how the game works? Yes or no: ");
            sagot = scan.nextLine();
    
            if (sagot.equalsIgnoreCase("Yes")) {
                sagotmo = true;
                System.out.println("Great!");
                System.out.println("Welcome to Bihisan Moko, Beybe!");
            } else if (sagot.equalsIgnoreCase("No")) {
                System.out.println("Please review the tutorial. Then run the program if you understand how the game works.");
                System.exit(0);
            } else {
                System.out.println("Wrong input!");
                System.exit(0);
            }
        } else {
            System.out.println("Wrong input!");
            System.exit(0);
        }
    }

    private static TroyInHeat create(Scanner scan) {
        System.out.print("Enter your IGN or In-game name: ");
        String name = scan.nextLine();
        int age = 0;
        int genderChoice = 0;
        do {
        System.out.print("Enter your age: ");
        try {
            age = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid age. Age must be only 1 - 125!");
            scan.nextLine();
            continue;
        }

        if (age > 125 || age < 1) {
            System.out.println("Invalid age. Age must be only 1 - 125!");
        }
    } 
        while (age > 125 || age < 1);
        
    do {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
        System.out.print("Choose your Identity\n1. Male\n2. Female\n3. Gay\n4. Lesbian\n5. Preferred not to say\nEnter the number corresponding to your choice (1-5): ");
        try {
            genderChoice = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
            scan.nextLine();
            continue;
        }

        if (genderChoice < 1 || genderChoice > 5) {
            System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
        }
    } while (genderChoice < 1 || genderChoice > 5);

    scan.nextLine();
    String gender = getGender(genderChoice);
        return new TroyInHeat(name, age, gender);
    }
    private static String getGender(int pili) {
        if (pili == 1){
            return "Male";
        }
        else if (pili == 2){
            return "Female";
        }
        else if (pili == 3){
            return "Gay";
        }
        else if (pili == 4){
            return "Lesbian";
        }
        else if (pili == 5){
            return "Preferred not to say";
        }
        else {
            System.out.println("Invalid choice. Exiting...");
            System.exit(0);
            return "";
            } 
    }
    private static void customizeCharacter(TroyInHeat player, Scanner scan) {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
        System.out.println("Customize Your Character: Juned");
        
        // Height
        int heightChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Height: \n1. Dwarf 2 to 4ft\n2. Small 4 to 5ft\n3. Medium 5 to 5.5ft\n4. Tall 5.6 to 6ft\n5. Giant 6 to 8ft\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                heightChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (heightChoice < 1 || heightChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (heightChoice < 1 || heightChoice > 5);

        scan.nextLine(); 
        player.setHeight(getHeight(heightChoice));//Polymorphism
        
        // Hairstyle
        int hairStyleChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Hairstyle: \n1. Wolfcut\n2. Longhair\n3. Shorthair\n4. Dreadlocks\n5. Ponytail\n6. Mullet\nEnter the number corresponding to your choice (1-6): ");
               
            try {
                hairStyleChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scan.nextLine(); 
                continue; 
            }

            if (hairStyleChoice < 1 || hairStyleChoice > 6) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-6).");
            }
        } 
        while (hairStyleChoice < 1 || hairStyleChoice > 6);

        scan.nextLine(); 
        player.setHairstyle(getHairstyle(hairStyleChoice));//Polymorphism
    
        // Hair Color
        int hairColorChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Hair Color: \n1. Red\n2. Blue\n3. Blonde\n4. Black\n5. Gray\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                hairColorChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (hairColorChoice < 1 || hairColorChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (hairColorChoice < 1 || hairColorChoice > 5);

        scan.nextLine(); 
        player.setHairColor(getHairColor(hairColorChoice));
        
        // Eyes Color
        int eyesColorChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose an Eyes Color: \n1. Blue\n2. Red\n3. Brown\n4. Black\n5. Green\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                eyesColorChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (eyesColorChoice < 1 || eyesColorChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (eyesColorChoice < 1 || eyesColorChoice > 5);

        scan.nextLine(); 
        player.setEyesColor(getEyesColor(eyesColorChoice));
        
        // Facial Expression
        int facialExpressionChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Facial Expression: \n1. Happy\n2. Sad\n3. Angry\n4. Fear\n5. Disgust\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                facialExpressionChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (facialExpressionChoice < 1 || facialExpressionChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (facialExpressionChoice < 1 || facialExpressionChoice > 5);

        scan.nextLine(); 
        player.setFacialExpression(getFacialExpression(facialExpressionChoice));
        
        // Facial Hairstyle
        int facialHairStyleChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Facial Hair Style: \n1. Beard\n2. Mustache\n3. Goatee\n4. Sideburns\n5. None\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                facialHairStyleChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (facialHairStyleChoice < 1 || facialHairStyleChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (facialHairStyleChoice < 1 || facialHairStyleChoice > 5);

        scan.nextLine(); 
        player.setFacialHairStyle(getFacialHairStyle(facialHairStyleChoice));
        
        // Face Shape
        int faceShapeChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Face Shape: \n1. Oval shape\n2. Round shape\n3. Square shape\n4. Heart shape\n5. V-Shaped\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                faceShapeChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (faceShapeChoice < 1 || faceShapeChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (faceShapeChoice < 1 || faceShapeChoice > 5);

        scan.nextLine(); 
        player.setFaceShape(getFaceShape(faceShapeChoice));
        
        // Nose Shape
        int noseShapeChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Nose Shape: \n1. Fleshy Nose\n2. Hawk Nose\n3. Big Nose\n4. Small Nose\n5. Roman Nose\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                noseShapeChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (noseShapeChoice < 1 || noseShapeChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (noseShapeChoice < 1 || noseShapeChoice > 5);

        scan.nextLine(); 
        player.setNoseShape(getNoseShape(noseShapeChoice));
        
        // Skin Color
        int skinColorChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Skin Color: \n1. Naturally Brown skin\n2. Black skin\n3. White skin\n4. Pale skin\n5. Fair skin\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                skinColorChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (skinColorChoice < 1 || skinColorChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (skinColorChoice < 1 || skinColorChoice > 5);

        scan.nextLine(); 
        player.setSkinColor(getSkinColor(skinColorChoice));
        
        // Lip Shape
        int lipShapeChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Lip Shape: \n1. Full Lips\n2. Wide Lips\n3. Thin Lips\n4. Heart Shaped Lips\n5. Bow Shaped Lips\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                lipShapeChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (lipShapeChoice < 1 || lipShapeChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (lipShapeChoice < 1 || lipShapeChoice > 5);

        scan.nextLine(); 
        player.setLipShape(getLipShape(lipShapeChoice));
        
        // Lip Color
        int lipColorChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Lip Color: \n1. Red\n2. Brown\n3. Black\n4. Natural\n5. Pink\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                lipColorChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (lipColorChoice < 1 || lipColorChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (lipColorChoice < 1 || lipColorChoice > 5);

        scan.nextLine(); 
        player.setLipColor(getLipColor(lipColorChoice));
        
        // Ears Shape
        int earsShapeChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose an Ear Shape: \n1. Human Ears\n2. Half-Elf Ears\n3. Elf-Ears\n4. Dwarf Ears\n5. Gnome Ears\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                earsShapeChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (earsShapeChoice < 1 || earsShapeChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (earsShapeChoice < 1 || earsShapeChoice > 5);

        scan.nextLine(); 
        player.setEarShape(getEarShape(earsShapeChoice));
        
        // Earrings
        int earringsChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose an Earrings: \n1. Hoop Earrings\n2. Stud Earrings\n3. Dangle Earrings\n4. Cross Earrings\n5. Cluster Earrings\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                earringsChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (earringsChoice < 1 || earringsChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (earringsChoice < 1 || earringsChoice > 5);

        scan.nextLine(); 
        player.setEarrings(getEarrings(earringsChoice));
        
        // Body Shape
        int bodyShapeChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Body Shape: \n1. Lean\n2. Fat\n3. Bulky\n4. Cut\n5. Skinny\n6. Muscular \nEnter the number corresponding to your choice (1-6): ");
               
            try {
                bodyShapeChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scan.nextLine(); 
                continue; 
            }

            if (bodyShapeChoice < 1 || bodyShapeChoice > 6) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-6).");
            }
        } 
        while (bodyShapeChoice < 1 || bodyShapeChoice > 6);

        scan.nextLine(); 
        player.setBodyShape(getBodyShape(bodyShapeChoice));
        
        // Tattoo/Body Art
        int tattooArtChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Tattoo: \n1. Dragon\n2. Tiger\n3. God Face\n4. Yakuza\n5. None\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                tattooArtChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (tattooArtChoice < 1 || tattooArtChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (tattooArtChoice < 1 || tattooArtChoice > 5);

        scan.nextLine(); 
        player.setTattoArt(getTattoArt(tattooArtChoice));
        
        // Necklace
        int necklaceChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Necklace: \n1. Chain Necklace\n2. Gold Necklace\n3. Diamond Necklace\n4. Jade Necklace\n5. Ruby Necklace\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                necklaceChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (necklaceChoice < 1 || necklaceChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (necklaceChoice < 1 || necklaceChoice > 5);

        scan.nextLine(); 
        player.setNecklace(getNecklace(necklaceChoice));
 
        // Wrist Accessory
        int wristAccessoryChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Wrist Accessory: \n1. Gold Bracelet\n2. Diamond Bracelet\n3. Loom Bands\n4. Watch\n5. Baller\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                wristAccessoryChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (wristAccessoryChoice < 1 || wristAccessoryChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (wristAccessoryChoice < 1 || wristAccessoryChoice > 5);

        scan.nextLine(); 
        player.setWristAccessory(getWristAccessory(wristAccessoryChoice));
        
        // Shirts
        int shirtsChoice = 0;
        do {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
        System.out.print("""
                         Shirts For Male: 
                         1. Polo Shirt
                         2. Hoodie
                         3. Sweater
                         4. Tank Top
                         5. Formal Wear
                         6. Top Less
                         
                         Shirts for Female:
                         7. Dress
                         8. Crop Top
                         9. Blouse
                         10. Sports Bra
                         11. Tube Top
                         12. Tank Top
                         Enter the number corresponding to your choice (1-12): """);
            try {
                shirtsChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
                scan.nextLine(); 
                continue; 
            }

            if (shirtsChoice < 1 || shirtsChoice > 12) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-12).");
            }
        } 
        while (shirtsChoice < 1 || shirtsChoice > 12);

        scan.nextLine(); 
        player.setShirts(getShirts(shirtsChoice));
        
        // Shorts
        int shortsChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("""
                         Shorts For Male: 
                         1. Denim Shorts
                         2. Cargo Shorts
                         3. Boxer Shorts
                         4. Cargo Pants
                         5. Jeans
                         6. Chino Pants
                         
                         Shorts for Female:
                         7. Cycling Shorts
                         8. Skirt
                         9. Running Shorts
                         10. Baggy Shorts
                         11. Linen Shorts
                         12. Ripped Jeans
                         Enter the number corresponding to your choice (1-12): """);
            try {
                shortsChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
                scan.nextLine(); 
                continue; 
            }

            if (shortsChoice < 1 || shortsChoice > 12) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-12).");
            }
        } 
        while (shortsChoice < 1 || shortsChoice > 12);

        scan.nextLine(); 
        player.setShorts(getShorts(shortsChoice));
        
        int capHatChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a Cap/Hat: \n1. Beanie\n2. Fedora Hat\n3. Cowboy Hat\n4. Baseball Cap\n5. Beret\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                capHatChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (capHatChoice < 1 || capHatChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (capHatChoice < 1 || capHatChoice > 5);

        scan.nextLine(); 
        player.setCapHat(getCapHat(capHatChoice));
    
        
        // FootWear
        int footWearChoice = 0;
        do {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); // Space
            System.out.print("Choose a FootWear: \n1. Sneakers\n2. Sandals\n3. Loafers\n4. Flip-Flops\n5. Barefoot\nEnter the number corresponding to your choice (1-5): ");
               
            try {
                footWearChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scan.nextLine(); 
                continue; 
            }

            if (footWearChoice < 1 || footWearChoice > 5) {
                System.out.println("Invalid choice. Please choose a number from the given options (1-5).");
            }
        } 
        while (footWearChoice < 1 || footWearChoice > 5);

        scan.nextLine(); 
        player.setFootWear(getFootWear(footWearChoice));
    }
    private static String getHeight(int pili) { //Height
        if (pili == 1) {
            return "Dwarf 2 to 4ft";
        } 
        else if (pili == 2) {
            return "Small 4 to 5ft";
        } 
        else if (pili == 3) {
            return "Medium 5 to 5.5ft";
        } 
        else if (pili == 4) {
            return "Tall 5.6 to 6ft";
        } 
        else if (pili == 5) {
            return "Giant 6 to 8ft";
        } 
        else {
            return "";
        }
    }
    private static String getHairstyle(int pili) { //Hair Style
        if (pili == 1) {
            return "Wolfcut";
        }
        else if (pili == 2){
            return "Longhair";
        } 
        else if (pili == 3) {
            return "Shorthair";
        }
        else if (pili == 4) {
            return "Dreadlocks";
        }
        else if (pili == 5) {
            return "Ponytail";
        }
        else if (pili == 6) { 
            return "Mullet";
        }
        else {
            return "";
        }
    }
        private static String getHairColor(int pili) { //Hair Color
        if (pili == 1){
            return "Red";
        }
        else if (pili == 2){
            return "Blue";
        }
        else if (pili == 3){
            return "Blonde";
        }
        else if (pili == 4){
            return "Black";
        }
        else if (pili == 5){
            return "Gray";
        }
        else {
            return "";
        }
    }
    private static String getEyesColor(int pili){ //Eyes Color
        if (pili == 1){
            return "Blue";
        }
        else if (pili == 2){
            return "Red";
        }
        else if (pili == 3){
            return "Brown";
        }
        else if (pili == 4){
            return "Black";
        }
        else if (pili == 5){
            return "Green";
        }
        else {
            return "";
        }
    }
    private static String getFacialExpression(int pili){ //Facial Expression
        if (pili == 1){
            return "Happy";
        }
        else if (pili == 2){
            return "Sad";
        }
        else if (pili == 3){
            return "Angry";
        }
        else if (pili == 4){
            return "Fear";
        }
        else if (pili == 5){
            return "Disgust";
        }
        else {
            return "";
        }
    }
    private static String getFacialHairStyle(int pili){ //Facial Hair Style
        if (pili == 1){
            return "Beard";
        }
        else if (pili == 2){
            return "Mustache";
        }
        else if (pili == 3){
            return "Goatee";
        }
        else if (pili == 4){
            return "Sideburns";
        }
        else if (pili == 5){
            return "None";
        }
        else {
            return "";
        }
    }
    private static String getFaceShape(int pili){ //Face Shape
        if (pili == 1){
            return "Oval shape";
        }
        else if (pili == 2){
            return "Round shape";
        }
        else if (pili == 3){
            return "Square shape";
        }
        else if (pili == 4){
            return "Heart shape";
        }
        else if (pili == 5){
            return "V-Shaped";
        }
        else {
            return "";
        }
    }
    private static String getSkinColor(int pili){ //Skin Color
        if (pili == 1){
            return "Naturally Brown skin";
        }
        else if (pili == 2){
            return "Black skin";
        }
        else if (pili == 3){
            return "White skin";
        }
        else if (pili == 4){
            return "Pale skin";
        }
        else if (pili == 5){
            return "Fair skin";
        }
        else {
            return "";
        }
    }
    private static String getNoseShape(int pili){ //Nose Shape
        if (pili == 1){
            return "Fleshy Nose";
        }
        else if (pili == 2){
            return "Hawk Nose";
        }
        else if (pili == 3){
            return "Big Nose";
        }
        else if (pili == 4){
            return "Small Nose";
        }
        else if (pili == 5){
            return "Roman Nose";
        }
        else {
            return "";
        }
    }
    private static String getLipShape(int pili){ //Lip Shape
        if (pili == 1){
            return "Full Lips";
        }
        else if (pili == 2){
            return "Wide Lips";
        }
        else if (pili == 3){
            return "Thin Lips";
        }
        else if (pili == 4){
            return "Heart Shaped Lips";
        }
        else if (pili == 5){
            return "Bow Shaped Lips";
        }
        else {
            return "";
        }
    }
    private static String getLipColor(int pili){ //Lip Color
        if (pili == 1){
            return "Red";
        }
        else if (pili == 2){
            return "Brown";
        }
        else if (pili == 3){ //Goth yarn?
            return "Black";
        }
        else if (pili == 4){
            return "Natural";
        }
        else if (pili == 5){
            return "Pink";
        }
        else {
            return "";
        }
    }
    private static String getEarShape(int pili){ //Ear Shapes
        if (pili == 1){
            return "Human Ears";
        }
        else if (pili == 2){
            return "Half-Elf Ears";
        }
        else if (pili == 3){ 
            return "Elf Ears";
        }
        else if (pili == 4){
            return "Dwarf Ears";
        }
        else if (pili == 5){
            return "Gnome Ears";
        }
        else {
            return "";
        }
    }
    private static String getEarrings(int pili){ //Earrings
        if (pili == 1){
            return "Hoop Earrings";
        }
        else if (pili == 2){
            return "Stud Earrings";
        }
        else if (pili == 3){
            return "Dangle Earrings";
        }
        else if (pili == 4){
            return "Cross Earrings";
        }
        else if (pili == 5){
            return "Cluster Earrings";
        }
        else {
            return "";
        }
    }
    private static String getBodyShape(int pili){ //Body Shapes
        if (pili == 1){
            return "Lean";
        }
        else if (pili == 2){
            return "Fat";
        }
        else if (pili == 3){ 
            return "Bulky";
        }
        else if (pili == 4){
            return "Cut";
        }
        else if (pili == 5){
            return "Skinny";
        }
        else if (pili == 6){
            return "Muscular";
        }
        else {
            return "";
        }
    }
    private static String getTattoArt(int pili){ //Tattoo/Body Art
        if (pili == 1){
            return "Dragon";
        }
        else if (pili == 2){
            return "Tiger";
        }
        else if (pili == 3){
            return "God Face";
        }
        else if (pili == 4){
            return "Yakuza";
        }
        else if (pili == 5){
            return "None";
        }
        else {
            return "";
        }
    }
    private static String getNecklace(int pili){ //Necklace
        if (pili == 1){
            return "Chain Necklace";
        }
        else if (pili == 2){
            return "Gold Necklace";
        }
        else if (pili == 3){
            return "Diamond Necklace";
        }
        else if (pili == 4){
            return "Jade Necklace";
        }
        else if (pili == 5){
            return "Ruby Necklace";
        }
        else {
            return "";
        }
    }
    private static String getWristAccessory(int pili){ //Wrist Accessory
        if (pili == 1){
            return "Gold Bracelet";
        }
        else if (pili == 2){
            return "Diamond Bracelet";
        }
        else if (pili == 3){ 
            return "Loom Bands";
        }
        else if (pili == 4){
            return "Watch";
        }
        else if (pili == 5){
            return "Baller";
        }
        else {
            return "";
        }
    }
    private static String getShirts(int pili){ //Shirts
        if (pili == 1){ 
            return "Polo Shirt"; //Male
        }
        else if (pili == 2){ //Male
            return "Hoodie";
        }
        else if (pili == 3){  //Male
            return "Sweater/Jumper";
        }
        else if (pili == 4){ //Male
            return "Tank Top";
        }
        else if (pili == 5){ //Male
            return "Formal Wear";
        }
        else if (pili == 6){ //Male
            return "Top Less";
        }
        else if (pili == 7){ //Female
            return "Dress";
        }
        else if (pili == 8){ //Female
            return "Crop Top";
        }
        else if (pili == 9){ //Female
            return "Blouse";
        }
        else if (pili == 10){ //Female
            return "Sports Bra";
        } 
        else if (pili == 11){ //Female
            return "Tube Top";
        } 
        else if (pili == 12){ //Female
            return "Tank Top";
        }
        else {
            return "";
        }
    }
    private static String getShorts(int pili){ //Shorts
        if (pili == 1){
            return "Denim Shorts"; //Male
        }
        else if (pili == 2){ //Male
            return "Cargo Shorts";
        }
        else if (pili == 3){  //Male
            return "Boxer Shorts";
        }
        else if (pili == 4){ //Male
            return "Cargo Pants";
        }
        else if (pili == 5){ //Male
            return "Jeans";
        }
        else if (pili == 6){ //Male
            return "Chino Pants";
        }
        else if (pili == 7){ //Female
            return "Cycling Shorts";
        }
        else if (pili == 8){ //Female
            return "Skirt";
        }
        else if (pili == 9){ //Female
            return "Running Shorts";
        }
        else if (pili == 10){ //Female
            return "Baggy Shorts";
        }
        else if (pili == 11){ //Female
            return "Linen Shorts";
        }
        else if (pili == 12){ //Female
            return "Ripped Jeans";
        }
        else {
            return "";
        }
    }
    private static String getCapHat(int pili){ //Cat or Hat
        if (pili == 1){
            return "Beanie";
        }
        else if (pili == 2){
            return "Fedora Hat";
        }
        else if (pili == 3){ 
            return "CowBoy Hat";
        }
        else if (pili == 4){
            return "Baseball Cap";
        }
        else if (pili == 5){
            return "Beret";
        }
        else {
            return "";
        }
    }
    private static String getFootWear(int pili){ //FootWears
        if (pili == 1){
            return "Sneakers";
        }
        else if (pili == 2){
            return "Sandals";
        }
        else if (pili == 3){ 
            return "Loafers";
        }
        else if (pili == 4){
            return "Flip-Flops";
        }
        else if (pili == 5){
            return "Barefoot";
        }
        else {
            return "";
        }
    }
}
