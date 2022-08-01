class TwelveDays {
    String verse(int verseNumber) {
        String[] days = {"first", "second", "third", "fourth",
                "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] gifts = {"a Partridge in a Pear Tree.\n", "two Turtle Doves, and ",
                "three French Hens, ", "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ",
                "seven Swans-a-Swimming, ", "eight Maids-a-Milking, ", "nine Ladies Dancing, ",
                "ten Lords-a-Leaping, ", "eleven Pipers Piping, ", "twelve Drummers Drumming, ", };
        
        String verseStart = "On the " + days[verseNumber - 1] + " day of Christmas my true love gave to me: ";
        String verseEnd = "";
        for (int i = verseNumber - 1; i >= 0; i--) {
            verseEnd += gifts[i];
        }
        return verseStart + verseEnd;
    }

    String verses(int startVerse, int endVerse) {
        String song = "";
        for (int i = startVerse; i <= endVerse; i++) {
            song += verse(i);
            if(i != endVerse)
                song += "\n";
        }
        return song;
    }
    
    String sing() {
        return verses(1,12);
    }
}
