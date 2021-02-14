package com.urdomain.practice;

public class NoticeBoard extends CommonReference {

	NoticeBoard(String boardName, String postTitle, String writer, String postedDate, int postNumber, int comments,
			int numberOfViews) {
		this.boardName = boardName;
		this.postTitle = postTitle;
		this.writer = writer;
		this.postedDate = postedDate;
		this.postNumber = postNumber;
		this.comments = comments;
		this.numberOfViews = numberOfViews;
	}

}
