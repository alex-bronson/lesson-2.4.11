package extend.lesson_2_4_11;

public class Student {
    protected final String studying;

    protected Student(String work) {
        this.studying = work;
    }

    public Student() {
        this.studying = "Прохожу тестирование. ";
    }

    public void study() {
        System.out.println("Я очень занят. " + studying);
    }

    public static class LazyStudent extends Student {
        public LazyStudent() {
            super();
        }

        public void study() {
            System.out.println("Сегодня не учусь, мне лень");
        }
    }
}
