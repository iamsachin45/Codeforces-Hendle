package com.example.codeforceshandle;

public class Pojo {
    public int contribution;
    public int lastOnlineTimeSeconds;
    public int rating;
    public int friendOfCount;
    public String titlePhoto;
    public String rank;
    public String handle;
    public int maxRating;
    public String avatar;
    public int registrationTimeSeconds;
    public String maxRank;
    public String status;
    public String firstName;

    //user rating details
    public int contestId;
    public String contestName;

    public int ratingUpdateTimeSeconds;
    public int oldRating;
    public int newRating;

    public Pojo(String firstName)
    {
        this.firstName = firstName;
    }

    public int getContestId() {
        return contestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public int getRatingUpdateTimeSeconds() {
        return ratingUpdateTimeSeconds;
    }

    public void setRatingUpdateTimeSeconds(int ratingUpdateTimeSeconds) {
        this.ratingUpdateTimeSeconds = ratingUpdateTimeSeconds;
    }

    public int getOldRating() {
        return oldRating;
    }

    public void setOldRating(int oldRating) {
        this.oldRating = oldRating;
    }

    public int getNewRating() {
        return newRating;
    }

    public void setContestId(int contestId) {
        this.contestId = contestId;
    }

    public void setNewRating(int newRating) {
        this.newRating = newRating;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Pojo(int contribution, int lastOnlineTimeSeconds, int rating, int friendOfCount, String titlePhoto, String rank, String handle, int maxRating, String avatar, int registrationTimeSeconds, String maxRank, String status, String firstName, int contestId, String contestName, int ratingUpdateTimeSeconds, int oldRating, int newRating) {
        this.contribution = contribution;
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
        this.rating = rating;
        this.friendOfCount = friendOfCount;
        this.titlePhoto = titlePhoto;
        this.rank = rank;
        this.handle = handle;
        this.maxRating = maxRating;
        this.avatar = avatar;
        this.registrationTimeSeconds = registrationTimeSeconds;
        this.maxRank = maxRank;
        this.status = status;
        this.firstName = firstName;
        this.contestId = contestId;
        this.contestName = contestName;
        this.ratingUpdateTimeSeconds = ratingUpdateTimeSeconds;
        this.oldRating = oldRating;
        this.newRating = newRating;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

    public int getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }

    public void setLastOnlineTimeSeconds(int lastOnlineTimeSeconds) {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getFriendOfCount() {
        return friendOfCount;
    }

    public void setFriendOfCount(int friendOfCount) {
        this.friendOfCount = friendOfCount;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }

    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public int getMaxRating() {
        return maxRating;
    }

    public void setMaxRating(int maxRating) {
        this.maxRating = maxRating;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }

    public void setRegistrationTimeSeconds(int registrationTimeSeconds) {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }

    public String getMaxRank() {
        return maxRank;
    }

    public void setMaxRank(String maxRank) {
        this.maxRank = maxRank;
    }
}
