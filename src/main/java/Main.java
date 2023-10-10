import ru.netology.javaQA.HW_OOP_Principes.posts.FormDate;
import ru.netology.javaQA.HW_OOP_Principes.posts.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.pasport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.patronymic = "Иванович";
        post.surname = "Иванов";

        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;


    }
}
