package vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class StudentVO implements Comparable<StudentVO> {
    private String sno;
    private String name;
    private int korean;
    private int english;
    private int math;
    private int science;

    private int total;
    private double average;
    private String grade;

    public StudentVO() {}

    public StudentVO(String sno, String name, int korean, int english, int math, int science) {
        this.sno = sno;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.science = science;
    }

    /**
*     학생의 동등성 비교
*     @param object 비교할 객체
*     @return 동일한 학번을 가진 경우 {@code true} 그렇지 않으면 {@code false}
**/
    @Override
    public boolean equals(Object obj) {
        StudentVO that = (StudentVO) obj;
        return Objects.equals(sno, that.sno);
    }

    /**
     *     학생의 학번을 기준으로 정렬
     *     @param object 비교할 객체 {@code StudentVO} 객체
     *     @return 학번의 문자열 비교 결과
     **/
    @Override
    public int compareTo(StudentVO o) {
        return this.sno.compareTo(o.sno);
    }

    @Override
    public String toString() {
        String str = "\t%-12s%-11s%-11d%-11d%-11d%-11d%-11d%-12.1f%-8s";
        return String.format(str,sno,name,korean,english,math,science,total,average);
    }
}
