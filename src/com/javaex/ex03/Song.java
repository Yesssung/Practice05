package com.javaex.ex03;

public class Song {
	
	private String Title;
	private String Artist;
	private String Album;
	private String Composer;
	private String Year;
	private int Track;
	
	public Song() {
		System.out.println("Song(파라미터0개)");
	}
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.Title = title;
		this.Artist = artist;
		this.Album = album;
		this.Composer = composer;
		this.Year = year;
		System.out.println("Song(파라미터5개)");
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title,artist,album,composer,year);
		this.Track = track;
		System.out.println("Song(파라미터6개)");
	}
	

	
}



