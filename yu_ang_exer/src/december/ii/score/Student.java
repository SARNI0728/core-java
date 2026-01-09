package december.ii.score;

public class Student {
    String name;
    double chineseScore;
    double englishScore;
    double mathScore;
    double geographyScore;

    public Student() {
    }

    public Student(String name, double chineseScore, double englishScore, double mathScore, double geographyScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.geographyScore = geographyScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(double chineseScore) {
        this.chineseScore = chineseScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getGeographyScore() {
        return geographyScore;
    }

    public void setGeographyScore(double geographyScore) {
        this.geographyScore = geographyScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                ", geographyScore=" + geographyScore +
                '}';
    }
    public double getTotalScore() {
        return chineseScore +  englishScore + mathScore + geographyScore;
    }
}
