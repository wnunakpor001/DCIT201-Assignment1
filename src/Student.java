public class Student {
    private String studentID;
    private String name;
    private double score;

    // Constructor

    public Student(String studentID, String name, double score) {
        this.studentID = studentID;
        this.name = name;
        setScore(score);
    }


    // Getters and Setters

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    // Setter for score validation
    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
            System.out.println("Score is set to " + score);
        } else {
            System.out.println("Invalid score.");

        }
    }

    // Method to get grade
    public String getGrade() {
        if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else if (score >= 45) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
