package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat - BCB");
        int seconds = 0;
        while(seconds <= 117){
            System.out.println("Watching at seconds:" + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("finished watching the video");
        System.out.println("lets start another one!");



        }

    }

