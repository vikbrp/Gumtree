package main.Constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Constants {

    private Constants() {
    }

    public static final List<String> names = Collections
            .unmodifiableList(Arrays.asList("Bill McKnight", "Paul Robinson"));

    public static final String male = "MALE";
}
