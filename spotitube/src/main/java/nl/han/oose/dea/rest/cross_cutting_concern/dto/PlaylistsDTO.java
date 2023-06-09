package nl.han.oose.dea.rest.cross_cutting_concern.dto;

import java.util.ArrayList;

public class PlaylistsDTO {

    private ArrayList<PlaylistDTO> playlists = new ArrayList<>();
    private int length;

    public PlaylistsDTO(ArrayList<PlaylistDTO> playlists, int length) {
        this.playlists = playlists;
        this.length = length;
    }

    public ArrayList<PlaylistDTO> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<PlaylistDTO> playlists) {
        this.playlists = playlists;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void addPlaylist(PlaylistDTO playlist) {
        playlists.add(playlist);
    }

    public void removePlaylist(PlaylistDTO playlist) {
        playlists.remove(playlist);
    }

}
