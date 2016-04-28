public class Main {

    public static void main(String[] args) {
        TweetBuilder builder = new TweetBuilder("@mytwitterhandle");

        builder.displayName("Timothy Kim")
               .date("03/21/2016")
               .message("This is a tweet");

        Tweet mytweet = builder.build();

        System.out.println(mytweet.toString());
    }

}
