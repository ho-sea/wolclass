package com.wolclass.persistance;

import java.util.List;
import java.util.Map;

import com.wolclass.domain.AlertVO;
import com.wolclass.domain.ClassVO;
import com.wolclass.domain.MemberVO;

public interface TJDAO {
	// 클래스 등록 tj
	public int addClass(ClassVO vo) throws Exception;

	// 클래스 시간 등록
	public void addTime(Map<String, Object> map) throws Exception;
	
	// 시간 중복 체크
	public int timeOverlapCheck(Map<String, Object> map) throws Exception;

	// 등록 완료 클래스 리스트
	public List<ClassVO> registerClassList(String m_id) throws Exception;

	// 회원 조회
	public MemberVO getMemberInfo(String m_id) throws Exception;

	// 키워드별 추천 - tj
	public List<ClassVO> findByKeyword(String keyword) throws Exception;
	
	// 온라인 클래스 
	public List<ClassVO> getOnlineList() throws Exception;

	// 생일 1주일 전 - tj
	public int oneWeekBeforeBirth(String m_id) throws Exception;

	// 메인 카테고리별 리스트 - tj
	public List<ClassVO> getCategoryClassList() throws Exception;

	// 알림 목록
	public List<AlertVO> getAlertList(String m_id) throws Exception;
	
	// 알림 체크
	public void alertCheck(Integer a_no) throws Exception;
	
	// 알림 전체 체크
	public void alertCheckAll(String m_id) throws Exception;
}
