package Lab4;

/**
 * This class contains 5 fields, which describe a student.The fields are name, score, group, faculty, year of birth.
 */
public class Student implements Comparable {
    private String name;
    private int score;
    private String group;
    private String faculty;
    private final int yearOfBirth;

    /**
     * @param name        student's name
     * @param score       student's score in the subject
     * @param group       group where the student is studying
     * @param faculty     faculty where the student is studying
     * @param yearOfBirth the year the student was born
     */
    public Student(String name, int score, String group, String faculty, int yearOfBirth) {
        this.name = name;
        this.score = score;
        this.group = group;
        this.faculty = faculty;
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + "', " + "score='" + score + "', " + "group='" + group + "', " + "faculty='" +
                faculty + "', " + "yearOfBirth='" + yearOfBirth + '}';
    }

    @Override
    public int compareTo(Object o) {
        return group.compareTo(((Student) o).group);
    }
}
