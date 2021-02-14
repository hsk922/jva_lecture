package com.urdomain.practice;

public class Board extends CommonReference { // �Ϲ� �Խ���
	public static int numberOfLike; // ���ƿ� ��

	Board(String boardName, String postTitle, String writer, String postedDate, int postNumber, int comments,
			int numberOfViews, int numberOfLike) {
		this.boardName = boardName;
		this.postTitle = postTitle;
		this.writer = writer;
		this.postedDate = postedDate;
		this.postNumber = postNumber;
		this.comments = comments;
		this.numberOfViews = numberOfViews;
		this.numberOfLike = numberOfLike;
	}

	public void callNotice() {
		// ���������� ��ܿ� ����
	}
}
