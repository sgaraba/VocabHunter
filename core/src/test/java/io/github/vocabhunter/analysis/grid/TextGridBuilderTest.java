/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

package io.github.vocabhunter.analysis.grid;

import org.junit.Test;

import static io.github.vocabhunter.analysis.grid.GridTestTool.*;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;

public class TextGridBuilderTest {

    private final TextGridBuilder target = new TextGridBuilderImpl();

    @Test
    public void testEmpty() {
        assertEquals(emptyGrid(), target.build(emptyList()));
    }

    @Test
    public void testUnchanged() {
        assertEquals(grid(), target.build(normalisedLines()));
    }

    @Test
    public void testNormalise() {
        assertEquals(grid(), target.build(unnormalisedLines()));
    }

    @Test
    public void testLegalSpacing() {
        assertEquals(legalSpacingGrid(), target.build(legalSpacingLines()));
    }
}
