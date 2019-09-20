import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class LambdaExpression {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Deb", "Indrajit", "Amit", "Pavan");
        out.println(String.join(",", friends));
        out.println(friends.stream().map(String::toUpperCase).collect(Collectors.joining(",")));

        final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);
    }
}
