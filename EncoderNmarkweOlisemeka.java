
public class EncoderNmarkweOlisemeka{
    
    public String EncMessage(int Offset,String Message) {
        StringBuilder encodeMessage= new StringBuilder();

        for(int i=0;i<Message.length(); i++){
            char j= Message.charAt(i);
            if (Character.isLetter(j)){
                char base= Character.isLowerCase(j) ? 'a' : 'A';
                j= (char)(((j-base+Offset)%26+26)%26+base);
            }
            encodeMessage.append(j);
        }
        return encodeMessage.toString();
}
}