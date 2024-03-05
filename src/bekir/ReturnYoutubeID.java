package bekir;

import java.util.Arrays;

public class ReturnYoutubeID {
    /*
    Youtube video sayfasının urlsinde yer alan video id'sini
    return eden bir method yazınız :

    ÖRNEKLER
    youtubeId("<https://www.youtube.com/watch?v=XPEr1cArWRg>")
    ID : XPEr1cArWRg

    youtubeId("<https://youtu.be/BCDEDi5gDPo>")
    ID : BCDEDi5gDPo

    https://youtube.com/BCDEDi5gDPo
    ID: BCDEDi5gDPo

    youtubeId("<https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4>")
    ID : vxP3bY-XxY4
     */

    public static void main(String[] args) {
        System.out.println(youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg"));
        System.out.println(youtubeId("https://youtu.be/BCDEDi5gDPo"));
        System.out.println(youtubeId("https://youtube.com/BCDEDi5gDPo"));
        System.out.println(youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));



    }
    public static String youtubeId(String url){
        String [] parts = url.split("[/=]");
        System.out.println(url);
        System.out.println(Arrays.toString(parts));

        return "ID: " + parts[parts.length-1];
    }




}
