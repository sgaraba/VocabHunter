/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

import io.github.vocabhunter.gui.main.VocabHunterGuiExecutable;

import static java.util.Collections.emptyList;

/**
 * This class is used instead of VocabHunterGuiExecutable to avoid showing the package name in the JavaFX menu.
 * This problem will be solve in a better way in a future version.
 */
public class VocabHunter extends VocabHunterGuiExecutable {
    public static void main(final String... args) {
        VocabHunterGuiExecutable.runApp(args, emptyList(), a -> launch(a));
    }
}
