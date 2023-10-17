package kr.or.ddit.work.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ddit.approval.vo.ApboxVO;
import kr.or.ddit.approval.vo.DocWriVO;
import kr.or.ddit.vo.AuthorAlwncVO;
import kr.or.ddit.vo.WkApVO;
import kr.or.ddit.vo.WorkVO;

@Mapper
public interface WorkMapper {
	
	//읽기 리스트(여러줄)
	public List<WkApVO> workSelect();
	
	//한명 데이터 가져오기
	public WkApVO OneSelect(WkApVO wkapVO);
	
	//등록
	public int workInsert(WkApVO wkapVO);
	
	//수정
	public int workUpdate(WkApVO wkapVO);
	
	//삭제
	public int workDelete(WkApVO wkapVO);
	
	//총근무시간 조회
	public Integer totalWork(String waAper);
	
	//한개 데이터 조회
	public List<WkApVO> workOneSelect();
	
	//특정 사원 데이터 가져오기
	public List<WkApVO> getEmpSelect(String waAper); 
	
	//사원 리스트 뽑아오기
	public List<WkApVO> countEMP();
	
	// 문서 INSERT 
	public int docInsert(DocWriVO vo);
	
	//결제선 INSERT
	public int apboxInsert(ApboxVO vo);
	
	// DFTNO 셀렉트
	public int selectdftNo();
	
	// DFTNO WK_AP테이블에서 SELECT
	public int selectWorkDftNo();
	
	// 근무 결재 승인자 사번가져오기
	public String workAuthSelect();
	
	// 근무 타입 리스트 불러오기
	public List<WorkVO> workTypeList();
	
}
