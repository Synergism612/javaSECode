package com.atguigu04.objarr.exer2;

/**
 * 学生工具类
 *
 * @author Synergism
 */
public class StudentUtil {

    /**
     * @param students 学生们
     * @param state    指定的年级
     * @apiNote 打印指定年级的学生
     */
    public void printStudentsByState(Student[] students, int state) {
        for (Student student : students) {
            if (student.state == state) System.out.println(student);
        }
    }

    /**
     * @param students 学生们
     * @apiNote 打印学生们
     */
    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * @param students 学生们
     * @apiNote 按成绩从大到小排序
     */
    public void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].score < students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public void fill(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6) + 1;
            students[i].score = (int) (Math.random() * 101);
        }
    }
}
