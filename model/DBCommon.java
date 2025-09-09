package model;

/*
* 데이터베이스와 관련된 공통 작업을 정의합니다.
* 정보 입력, 삭제, 수정, 검색, 정렬 등의 기능의 표준을 제시한다.
*
* */

import vo.StudentVO;

public interface DBCommon {
    /**
    * 새로운 데이터를 입력하는 메서드
    * @param StudentVO 입력할 데이터의 정보
    **/
    void input(StudentVO student);
    void delete(StudentVO student);
    void update(StudentVO student);
    void totalSearch(int sortNum);
    void search(String searchNum);
    void sort(int sortNum);

}
