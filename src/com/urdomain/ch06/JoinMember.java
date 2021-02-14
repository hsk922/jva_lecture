package com.urdomain.ch06;

public class JoinMember {

	String title = "회원가입";
	String sns = "SNS계정으로도 간편하게 가입하실 수 있습니다.";
	String naver = 	"네이버로 로그인";
	String kakao = "카카오로 로그인";
	//---------------------------------------------------------------------------------------------
	String joindb = "회원가입 정보";
	String email = "이메일 주소";							//이메일 입력 , 중복 확인
	
	String pw = "비밀번호 (영문+숫자+특수문자 조합 8자리 이상)";	//비밀번호 입력 , 비밀번호 양식 맞는지 검토
	String pwCheck = "비밀번호 확인";						//비밀번호 다시 입력 , pw와 동일한지 검토
	String nick = "닉네임(권장)";							//닉네임 입력
	//---------------------------------------------------------------------------------------------	
	String TermsAndAgreement = "약관 및 동의"; 
	String AllAgreement = "전체 동의";  // 앞부분에 체크박스 , 내용보기 클릭시 약관으로 이동
	String TermsofService = "이용약관 동의 (필수)";// 내용보기 클릭시 약관으로 이동
	String CollectionAndUsage = "개인정보 수집 및 이용동의 (필수)";// 내용보기 클릭시 약관으로 이동
	String ElectronicFinancialTransaction = "전자금융 거래 이용약관 (필수)";// 내용보기 클릭시 약관으로 이동
	String Usersover14yearsold = "만14세 이상 이용자 (필수)";// 내용보기 클릭시 약관으로 이동
	String Benefitnotification = "요기요 혜택 알림 동의(선택)";
	//---------------------------------------------------------------------------------------------
	String next = "다음 >"; // True 값 검토후 다음페이지로 이동

}

