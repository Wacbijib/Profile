public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Иванов";
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = "1234 № 12345678";
        post.phone = "+7 999 123-45-67";
        post.subscription = true;
        post.birthday.day = 10;
        post.birthday.month = 10;
        post.birthday.year = 2000;
    }
}
