## Spell Checker with english dictionary words

This project will help us to identify the correct word from the english dictionary was well as giving the suggestion word for the wrong text was given. 
It works well for the below given inputs
- File (you can specify the file from the local or remote)
- Words (list of words separated by commas)
- List (list of words)
- Set (list of unique words)

This project can be very useful in
- Cross-check the words, sentence or paragraph written on blog post page
- Verify the label or web-page content was written correctly by using automation
- Any valid word suggestion required for any application
- It can be mainly used for CMS to quickly evaluate the phrase

This project is currently supported for english dictionary but also, it can be extended to use for other language as well.

Important to know about the `SpellCheckResponse` class methods to get the actual response of the spellcheck process.

|Variable Name|Variable Type| Access Method          |
|-------------|-------------|------------------------|
|isCorrectionFound|boolean| getIsCorrectionFound() |
|correctWords|List<String>| getCorrectWords()|
|suggestedWords|Map<String, String>|getSuggestedWords()|

### Usage

- File based search for local and remote file (you can replace the remote file path instead of local path from the below code snippet)

        try {
            //File based search with local file. you can share remote file as well
            SpellCheckResponse response = SpellChecker.checkSpell("src/main/java/com/java/spellcheck/input/check-input.txt");
            boolean isCorrectionFound = response.getIsCorrectionFound();
            List<String> correctWords = response.getCorrectWords();
            Map<String, String> suggestedWords = response.getSuggestedWords();

            System.out.println("Correction Found: "+response.getIsCorrectionFound());
            if(response.getCorrectWords().size() > 0) {
                System.out.println("Correct Words: \n\t"+String.join(", ", response.getCorrectWords()));
            }
            if(response.getSuggestedWords().size() > 0) {
                System.out.println("Suggested Words: ");
                Set<String> words = response.getSuggestedWords().keySet();
                for(String word:words){
                    System.out.println("\t"+ word+"   --   "+response.getSuggestedWords().get(word));
                }
            }

        } catch (SpellCheckerException ex) {
            System.out.println("Error Occured");
            ex.printStackTrace();
        }
- Words based search

        try {
            SpellCheckResponse response = SpellChecker.checkSpell("know", "bind", "ball");
            boolean isCorrectionFound = response.getIsCorrectionFound();
            List<String> correctWords = response.getCorrectWords();
            Map<String, String> suggestedWords = response.getSuggestedWords();

            System.out.println("Correction Found: "+response.getIsCorrectionFound());
            if(response.getCorrectWords().size() > 0) {
                System.out.println("Correct Words: \n\t"+String.join(", ", response.getCorrectWords()));
            }
            if(response.getSuggestedWords().size() > 0) {
                System.out.println("Suggested Words: ");
                Set<String> words = response.getSuggestedWords().keySet();
                for(String word:words){
                    System.out.println("\t"+ word+"   --   "+response.getSuggestedWords().get(word));
                }
            }

        } catch (SpellCheckerException ex) {
            System.out.println("Error Occured");
            ex.printStackTrace();
        }
- List based search

        try {
            List<String> listWords = new ArrayList<String>();
            listWords.add("kniw");
            listWords.add("trust");
            SpellCheckResponse response = SpellChecker.checkSpell(listWords);
            boolean isCorrectionFound = response.getIsCorrectionFound();
            List<String> correctWords = response.getCorrectWords();
            Map<String, String> suggestedWords = response.getSuggestedWords();

            System.out.println("Correction Found: "+response.getIsCorrectionFound());
            if(response.getCorrectWords().size() > 0) {
                System.out.println("Correct Words: \n\t"+String.join(", ", response.getCorrectWords()));
            }
            if(response.getSuggestedWords().size() > 0) {
                System.out.println("Suggested Words: ");
                Set<String> words = response.getSuggestedWords().keySet();
                for(String word:words){
                    System.out.println("\t"+ word+"   --   "+response.getSuggestedWords().get(word));
                }
            }

        } catch (SpellCheckerException ex) {
            System.out.println("Error Occured");
            ex.printStackTrace();
        }
- Set based search

        try {
            Set<String> setWords = new HashSet<String>();
            setWords.add("blow");
            setWords.add("must");
            setWords.add("blenk");
            setWords.add("trust");
            SpellCheckResponse response = SpellChecker.checkSpell(setWords);
            boolean isCorrectionFound = response.getIsCorrectionFound();
            List<String> correctWords = response.getCorrectWords();
            Map<String, String> suggestedWords = response.getSuggestedWords();

            System.out.println("Correction Found: "+response.getIsCorrectionFound());
            if(response.getCorrectWords().size() > 0) {
                System.out.println("Correct Words: \n\t"+String.join(", ", response.getCorrectWords()));
            }
            if(response.getSuggestedWords().size() > 0) {
                System.out.println("Suggested Words: ");
                Set<String> words = response.getSuggestedWords().keySet();
                for(String word:words){
                    System.out.println("\t"+ word+"   --   "+response.getSuggestedWords().get(word));
                }
            }

        } catch (SpellCheckerException ex) {
            System.out.println("Error Occured");
            ex.printStackTrace();
        }
