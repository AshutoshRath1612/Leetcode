package Leetcode;

public class CrawlerLogFolderr {
    public static int minOperations(String[] logs) {
        int currentLevel = 0;
        for(String command : logs){
            if(command.equals("../")){
                if(currentLevel > 0){
                    currentLevel--;
                }
            }
            else if(!command.equals("./")){
                currentLevel++;
            }
        }
        return currentLevel;
    }
    public static void main(String[] args) {
        String [] log= {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(log));
    }
}
