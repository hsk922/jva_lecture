package com.urdomain.practice;

public class BoardExample {

	public static void main(String[] args) {
		NoticeBoard noticeboard = new NoticeBoard("�������� ", "�ȳ��ϼ���. ù �����Դϴ�. ", "��� ", "2021-01-13 ", 1, 1,
				3);
		Board board = new Board("���� ", "�ȳ��ϼ���. �̰��� �����Խ����Դϴ�. ", "��� ", "2021-01-13 ", 1, 1, 5, 2);
		System.out.print(NoticeBoard.boardName);
		System.out.print(NoticeBoard.postTitle);
		System.out.print(NoticeBoard.writer);
		System.out.print(NoticeBoard.postedDate);
		System.out.print(NoticeBoard.postNumber);
		System.out.print(NoticeBoard.comments);
		System.out.print(NoticeBoard.numberOfViews);
		// =========================================
		System.out.println(Board.boardName);
		System.out.print(Board.postTitle);
		System.out.print(Board.writer);
		System.out.print(Board.postedDate);
		System.out.print(Board.postNumber);
		System.out.print(Board.comments);
		System.out.print(Board.numberOfViews);
		System.out.print(Board.numberOfLike);
	}

}
