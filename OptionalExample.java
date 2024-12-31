import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Cat myCat = optionalCat(new Cat("Cat1",21)).orElseThrow(()->new RuntimeException("Cat is null"));
        System.out.println(myCat.getAge());

    }

    public static Optional<Cat> optionalCat(Cat cat) {

        return Optional.ofNullable(cat);

    }

}
