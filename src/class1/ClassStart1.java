package class1;

public class ClassStart1 {
    public static void main(String[] args) {
       MovieReview movieReview = new MovieReview();
       movieReview.review = "인생은 무한루프";
       movieReview.title = "인셉션";

       MovieReview movieReview1 = new MovieReview();
       movieReview1.review = "인생 시간 영화!";
       movieReview1.title = "어바웃 타임";

       MovieReview[] movies = {movieReview, movieReview1};

       for (MovieReview movie : movies) {
           System.out.println("영화 제목: \"" + movie.title + "\", 리뷰 : \"" + movie.review + "\"");
       }


    }
}
