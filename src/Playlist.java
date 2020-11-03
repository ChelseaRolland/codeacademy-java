import java.util.ArrayList;

public class Playlist {
    public static void main(String [] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        //ADDING
        desertIslandPlaylist.add("Fine Mess - Interpol");
        desertIslandPlaylist.add("Path - Apocalyptica");
        desertIslandPlaylist.add("Anything You Need - Low Roar");
        desertIslandPlaylist.add("Voltaic Acid - Lapalux");
        desertIslandPlaylist.add("Massage Situation - Flying Lotus");
        desertIslandPlaylist.add("Reality - Kamara");
        desertIslandPlaylist.add("Arrival - Kamara");

        System.out.println(desertIslandPlaylist);

        System.out.println(desertIslandPlaylist.size());

        //REMOVING
        desertIslandPlaylist.remove(0);
        desertIslandPlaylist.remove("Path - Apocalyptica");

        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        //SWAPPING SONGS
        System.out.println(desertIslandPlaylist.indexOf("Anything You Need - Low Roar")); //0
        System.out.println(desertIslandPlaylist.indexOf("Arrival - Kamara")); //4

        String tempA = desertIslandPlaylist.get(0);
        String tempB = desertIslandPlaylist.get(4);

        desertIslandPlaylist.set(0, tempB);
        desertIslandPlaylist.set(4, tempA);

        System.out.println(desertIslandPlaylist);
    }
}
