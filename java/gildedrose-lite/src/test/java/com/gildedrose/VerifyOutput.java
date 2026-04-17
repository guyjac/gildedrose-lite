package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class VerifyOutput {

    @Test
    void test30DaysOutputIsCorrect() throws Exception {
        // Capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            // Run the original program
            BaselineFixture.main(new String[]{"30"});
        } finally {
            System.setOut(originalOut);
        }

        List<String> expectedLines =
                Files.readAllLines(Paths.get("src/test/resources/expected30days.txt"));

        List<String> actualLines =
                Arrays.asList(out.toString().split("\\R"));

        assertLinesMatch(expectedLines, actualLines);
    }

}
