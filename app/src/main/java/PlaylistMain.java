//import java.util.InputMismatchException;
//import java.util.Scanner;
///*
//public class PlaylistMain {
//
//    private static void addExampleSongs(Playlist playlist) {
//        Genre description = Genre.POP;
//        System.out.println(description.getDescription());
//    }
//
//    private static void addSong(Playlist playlist, String title, String artist,
//                                int durationSeconds, Genre genre) {
//
//    /*
//        Song song = new Song(title, artist, durationSeconds, genre);
//
//        if (playlist.add(song)) {
//            System.out.printf("New song added: %s%n", song);
//        } else {
//            System.out.println("Song already exists in playlist");
//        }
//    */
//
//    }
//
//    private static void listSongs(Playlist playlist) {
//        // playlist.printPlaylist();
//    }
//
//    private static void playAll(Playlist playlist) {
//        // playlist.playAll();
//        // System.out.println("All songs played!");
//    }
//
//    private static void filterByGenre(Playlist playlist, Genre genre) {
//        // playlist.printPlaylist(genre);
//    }
//
//    private static void printStats(Playlist playlist) {
//    /*
//        int totalSeconds = playlist.getTotalDuration();
//        int minutes = totalSeconds / 60;
//        int seconds = totalSeconds % 60;
//        System.out.printf("Playlist: %s (%d songs)%n", playlist.getName(), playlist.getSize());
//        System.out.printf("Total duration: %d:%02d%n", minutes, seconds);
//        System.out.printf("Total energy: %d%n", playlist.getTotalEnergy());
//    */
//    }
//
//
//    // ##########################################################################
//    // ########### DON'T CHANGE ANYTHING BELOW THIS LINE ########################
//    // ##########################################################################
//
//    private static void printGenres() {
//        for (Genre genre : Genre.values()) {
//            System.out.printf(" %d: %s (%s)%n",
//                    genre.ordinal(), genre.getDescription(), genre.getSymbol());
//        }
//    }
//
//    private static void readNewSong(Scanner scanner, Playlist playlist) {
//
//        String title = "";
//        while (title.isBlank()) {
//            System.out.print("Title: ");
//            title = scanner.nextLine();
//        }
//
//        String artist = "";
//        while (artist.isBlank()) {
//            System.out.print("Artist: ");
//            artist = scanner.nextLine();
//        }
//
//        int durationSeconds = 0;
//        do {
//            System.out.print("Duration (seconds): ");
//            try {
//                durationSeconds = Integer.parseInt(scanner.nextLine());
//                if (durationSeconds <= 0) {
//                    System.out.println("Duration must be greater than 0");
//                    durationSeconds = 0;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input");
//            }
//        } while (durationSeconds <= 0);
//
//        Genre selectedGenre = null;
//        do {
//            System.out.println("Choose a genre:");
//            printGenres();
//            System.out.print("Selection: ");
//            try {
//                int selection = Integer.parseInt(scanner.nextLine());
//
//                if (selection >= 0 && selection < Genre.values().length) {
//                    selectedGenre = Genre.values()[selection];
//                } else {
//                    System.out.println("Invalid selection");
//                }
//
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input");
//            }
//
//        } while (selectedGenre == null);
//
//        addSong(playlist, title, artist, durationSeconds, selectedGenre);
//
//    }
//
//    private static Genre readGenre(Scanner scanner) {
//
//        Genre selectedGenre = null;
//        do {
//            System.out.println("Choose a genre:");
//            printGenres();
//            System.out.print("Selection: ");
//            try {
//                int selection = Integer.parseInt(scanner.nextLine());
//
//                if (selection >= 0 && selection < Genre.values().length) {
//                    selectedGenre = Genre.values()[selection];
//                } else {
//                    System.out.println("Invalid selection");
//                }
//
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input");
//            }
//
//        } while (selectedGenre == null);
//
//        return selectedGenre;
//    }
//
//    public static void main(String[] args) {
//        Playlist playlist = new Playlist("My Playlist");
//
//        addExampleSongs(playlist);
//
//        Scanner scanner = new Scanner(System.in);
//
//        String input = null;
//
//        do {
//
//            System.out.println("(N)ew song, (L)ist, (P)lay all, (F)ilter by genre, (S)tats, (Q)uit");
//            input = scanner.nextLine().toUpperCase();
//
//            switch (input) {
//                case "N":
//                    readNewSong(scanner, playlist);
//                    break;
//
//                case "L":
//                    listSongs(playlist);
//                    break;
//
//                case "P":
//                    playAll(playlist);
//                    break;
//
//                case "F":
//                    Genre genre = readGenre(scanner);
//                    filterByGenre(playlist, genre);
//                    break;
//
//                case "S":
//                    printStats(playlist);
//                    break;
//
//                case "Q":
//                    System.out.println("Bye!");
//                    break;
//
//                default:
//                    System.out.println("Invalid input!");
//
//            }
//
//        } while (!input.equals("Q"));
//
//        scanner.close();
//
//    }
//
//}
//
