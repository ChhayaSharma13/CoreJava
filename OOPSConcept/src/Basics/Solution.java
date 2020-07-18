package Basics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
	 public static String solution(String s) {
    int musicSize = 0;
    int imageSize = 0;
    int movieSize = 0; int otherSize = 0;

    String files[] = s.split("\\r?\\n");
    for(String file : files) {
        String currfile[] = file.split(" ");
        String fileName = currfile[0];
        String size = currfile[1];
        int currSize = Integer.parseInt(size.substring(0, size.length() - 1));
        String[] fileNameParts = fileName.split("\\.");
        String extension = fileNameParts[fileNameParts.length- 1];
        if (extension.equals("mp3") || extension.equals("aac") || extension.equals("flac")) {
            musicSize = musicSize + currSize;
        }else if (extension.equals("jpg") || extension.equals("bmp") || extension.equals("gif")) {
            imageSize = imageSize + currSize;
        } else if (extension.equals("mp4") || extension.equals("avi") || extension.equals("mkv")) {
            movieSize = movieSize + currSize;
        } else {
            otherSize = otherSize + currSize;
        }
}
    StringBuilder sb = new StringBuilder();
    sb.append("music ").append(musicSize).append("b");
    sb.append(System.getProperty("line.separator"));
    sb.append("image ").append(imageSize).append("b");
    sb.append(System.getProperty("line.separator"));
    sb.append("movie ").append(movieSize).append("b");
    sb.append(System.getProperty("line.separator"));
    sb.append("other ").append(otherSize).append("b");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
}
}