package Chapter8.interfaces.interfaceprocesssor;

import java.util.Objects;

/**
 * Created by Changjiang on 2015/6/26.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
