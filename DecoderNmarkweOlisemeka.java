public class DecoderNmarkweOlisemeka{

   
    public String DecMessage(int Offset,String  Message) {
        StringBuilder decodeMessage= new StringBuilder();

        for(int i=0;i<Message.length(); i++){
            char j= Message.charAt(i);
            if (Character.isLetter(j)){
                char base= Character.isLowerCase(j) ? 'a' : 'A';
                j= (char)(((j-base-Offset+26)%26)+base);
            }
            decodeMessage.append(j);
        }
        return decodeMessage.toString();
}
}
