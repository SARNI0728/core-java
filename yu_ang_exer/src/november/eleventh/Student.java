package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 15:36
 * @Version 1.0
 */
public class Student {
    private String name;
    private LibraryCard libraryCard;
    public class LibraryCard{
        String color; //借书证的颜色
        char level; //借书证的等级

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public char getLevel() {
            return level;
        }

        public void setLevel(char level) {
            this.level = level;
        }

        public LibraryCard(String color, char level) {
            this.color = color;
            this.level = level;

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }

    public Student() {
    }

    public Student(String name,String color,char level) {
        this.name = name;
        libraryCard = new LibraryCard(color,level);
    }
}
