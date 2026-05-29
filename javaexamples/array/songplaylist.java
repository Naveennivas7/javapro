package javaexamples.array;

public class songplaylist {
    public static void main(String[] args) {
        String[] playlist = new String[3];
        playlist[0] = "song1";
        playlist[1] = "song2";
        playlist[2] = "song3";

        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }

    }

}
