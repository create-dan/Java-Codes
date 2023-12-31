import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class UrlShorteningService {
    private Map<String,String> urlToShortMap;
    private Map<String,String> ShortToUrlMap;

    private static final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private static final int short_url_length = 6;
    public UrlShorteningService(){
        urlToShortMap = new HashMap<>();
        ShortToUrlMap = new HashMap<>();
    }

    //function which takes original string as input and give shorten url 
    public String shortenUrl(String original){

        if(urlToShortMap.containsKey(original)){
            return urlToShortMap.get(original);
        }

        String shortUrl = generateShortUrl();   
        urlToShortMap.put(original,shortUrl);
        ShortToUrlMap.put(shortUrl,original);

        return shortUrl;

    }

    //function to get original url from shortUrl
    public String getOriginalUrl(String shortUrl){
        return ShortToUrlMap.getOrDefault(shortUrl,"Short URL not found");
    }

    //function to generate a shortUrl 
    private String generateShortUrl(){
        StringBuilder shortUrl = new StringBuilder();
        Random random = new Random();

        for(int i=0;i<short_url_length;i++)
        {
            int index = random.nextInt(characters.length());
            shortUrl.append(characters.charAt(index));
        }

        return shortUrl.toString();

    }
}

                

                
public class UrlShortner {
    public static void main(String[] args) {
        

        UrlShorteningService urlShorteningService = new UrlShorteningService();

        String s1 = "https://www.example.com/page1";
        String s2 = "https://www.example.com/page2";

        String short1 = urlShorteningService.shortenUrl(s1);
        String short2 = urlShorteningService.shortenUrl(s2);


        System.out.println("Original: "+ s1 + " " + "Short: " + short1);
        System.out.println("Original: "+ s2 + " " + "Short: " + short2);
    }
}