package com.interview.practice;

import java.util.List;

class Twitter {

	private int tweetId;
	private String tweet;

	/** Initialize your data structure here. */
	public Twitter() {

	}

	public Twitter(int tweetId, String tweet) {

		this.tweetId = tweetId;
		this.tweet = tweet;
	}

	/** Compose a new tweet. */
	public void postTweet(int userId, int tweetId) {
		Twitter t = new Twitter(tweetId, "first tweet");
	}

	/**
	 * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in
	 * the news feed must be posted by users who the user followed or by the user
	 * herself. Tweets must be ordered from most recent to least recent.
	 */
	public List<Integer> getNewsFeed(int userId) {
		return null;

	}

	/**
	 * Follower follows a followee. If the operation is invalid, it should be a
	 * no-op.
	 */
	public void follow(int followerId, int followeeId) {

	}

	/**
	 * Follower unfollows a followee. If the operation is invalid, it should be a
	 * no-op.
	 */
	public void unfollow(int followerId, int followeeId) {

	}

	public static void main(String[] args) {
		Twitter twitter = new Twitter();
		twitter.postTweet(1, 5);

	}

}


	
	



