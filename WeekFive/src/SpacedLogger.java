public class SpacedLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(spaceMessage(message));        
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + spaceMessage(message));
        
    }

    private String spaceMessage (String message){
        String spacedWord = "";
        for (int i = 0; i < (message.length() - 1); i++){
            spacedWord += message.charAt(i) + " ";
        }
        spacedWord += message.charAt(message.length()-1);
        return spacedWord;
    }
    
}
