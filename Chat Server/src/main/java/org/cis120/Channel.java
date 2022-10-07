package org.cis120;
import java.util.*;


public class Channel implements Comparable {
    private String channelName;
    private Set<String> users;
    private String owner;
    private boolean isPrivate;

    public Channel(String channelName, String owner, boolean isPrivate) {
        users = new TreeSet<>();
        this.channelName = channelName;
        this.isPrivate = isPrivate;
        this.owner = owner;
        users.add(owner);
    }

    public String getChannelName() {
        String out = "";
        out += this.channelName;
        return out;
    }

    public String getOwnerOfChannel() {
        return this.owner;
    }

    public void setOwner(String name) {
        this.owner = name;
    }

    public void addUser(String nameOfUser) {
        users.add(nameOfUser);
    }

    public void removeUser(String nameOfUser) {
        users.remove(nameOfUser);
    }

    public Collection<String> getUsers() {
        return this.users;
    }

    public boolean getIsPrivate() {
        return this.isPrivate;
    }

    public void changePrivateState(boolean newState) {
        this.isPrivate = newState;
    }


    // needs override perhaps???
    public boolean equals(Channel other) {
        boolean sameOwner = this.owner.equals(other.getOwnerOfChannel());
        boolean sameUsers = this.users.equals(other.getUsers());
        boolean sameChannelName = this.channelName.equals(other.getChannelName());
        boolean sameState = this.isPrivate == other.getIsPrivate();

        return sameOwner && sameUsers && sameChannelName && sameState;
    }

    @Override
    public int compareTo(Object c) {
        return 0;
    }
}
