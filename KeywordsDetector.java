public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"}; //להשתמש ב mystring
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] newSentences = new String[sentences.length];
        for(int i=0; i< sentences.length; i++){
            newSentences[i] = sentences[i];
            newSentences[i] = (String) MyString.lowerCase(newSentences[i]);
        } 
        
        String[] newKeywords = new String[keywords.length];
        for(int i=0; i< keywords.length; i++){
            newKeywords[i] = keywords[i];
            newKeywords[i] = (String) MyString.lowerCase(newKeywords[i]);
        }
        
        for(int i=0; i < newSentences.length; i++){
            for(int j=0; j < newKeywords.length; j++){
                if(MyString.contains(newSentences[i],newKeywords[j])){
                    System.out.println(sentences[i]);
                }
            }   
        }
    }
    //Expected:%0AOur product will transform the market%0AWe need to leverage our core competencies%0AThis blockchain-based solution will disrupt the industry%0AThe team showed great Synergy in the last project%0AOur new technology presents a significant paradigm shift%0
    // AActual:%0AOur product will transform the market%0AWe need to leverage our core competencies%0AThis blockchain-based solution will disrupt the industry%0AThe team showed great Synergy in the last project

    

}
