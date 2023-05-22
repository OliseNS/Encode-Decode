import java.util.Scanner;

public class EncodeDecodeNmarkweOlisemeka{

    public static void main (String[] args) {

        int Userin;
        int YN;
        String Message;
        String Message2;
        int Offset;
        int Offset2;

        EncoderNmarkweOlisemeka encode= new EncoderNmarkweOlisemeka();
        DecoderNmarkweOlisemeka decode= new DecoderNmarkweOlisemeka();

        Scanner input= new Scanner(System.in);
        
        System.out.println("This program will read in a message and an offset to encode the message by.\nIt can also be used to decode a message with a given offset.\n--------------------------------------------------------------------------------");
        
        //Ask user what they want to do
        System.out.println("Encode(1) or Decode(2)");
        Userin = input.nextInt();

            if (Userin==1){
                System.out.println("Enter the offset you want to encode with");
                Offset= input.nextInt();
                input.nextLine(); 
    
                //Message input
                System.out.println("Enter your message here: ");
                Message= input.nextLine();
    

            String encodeMessage = encode.EncMessage(Offset,Message); //This changes message to a character array

            encode.EncMessage(Offset,Message); // This parses 
            System.out.println("The encoded message is \""+encodeMessage+"\"");
             
            
            do{
                System.out.println(" Do you want to decode this message? (1 is Yes and 2 is No)**");
                YN= input.nextInt();

                String decodeMessage = decode.DecMessage(Offset, encodeMessage);
                if (YN==1){
                    System.out.println("The decoded message is \"" + decodeMessage+"\"");

                } else{
                    System.out.println("\n");
                }
            } while(YN !=1 && YN != 2);
        } // If ends
            else if (Userin==2){
                System.out.println("Enter the offset you want to decode with");
                Offset2= input.nextInt();
                input.nextLine(); 
    
                //Message input
                System.out.println("Enter your message here: ");
                Message2= input.nextLine();
    
 

                    String decodeMessage = decode.DecMessage(Offset2, Message2);
                    System.out.println("The decoded message is \""+decodeMessage+"\"");
                
            
        } else{
            System.out.println("Invalid Input");
        }
        System.out.println("Thanks for using this program ");
        // Method to decode a string



    
}// Main ends
}