import java.util.*;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String movieName;  
        String company; 
        String genre ;
        int budget;

        Movie[] arr = new Movie[4];
        for(int i=0;i<arr.length;i++){
            arr[i] = new Movie(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
            sc.nextLine();
        }
        String action = sc.nextLine();

        Movie[] result = getMovieByGenre(arr,action);
        for(int i=0;i<result.length;i++){
            System.out.println("Movie Namae: "+result[i].getMovieName() +" " + "Movie budget:"+ result[i].getBudget());
        }
    }
    public static Movie[] getMovieByGenre(Movie[] arr,String action){
        // ArrayList<Movie> result = new ArrayList<>();
        Movie[] result = new Movie[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getGenre().equalsIgnoreCase(action)){
                if(arr[i].getBudget() > 80000000){
                  result = Arrays.copyOf(result,result.length+1);
                  result[result.length-1] = arr[i];
                }
            }
        }
        return result;
    }
}

class Movie{
    private String movieName;  
    private String company; 
    private String genre ;
    private int budget;

    Movie(String movieName,String company,String genre,int budget){
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName(){
        return movieName;
    }
    public String getGenre(){
        return genre;
    }
    public int getBudget(){
        return budget;
    }

}