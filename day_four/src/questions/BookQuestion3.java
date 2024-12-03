package questions;

public class BookQuestion3 {

        String title;
        String author;
        int publicationYear;

        public  BookQuestion3(String title, String author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }


        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

    public String toString() {
        return "book { title ='" + title + "', author =" + author + " published year ="+ publicationYear + "}";
    }

    }


