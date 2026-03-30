package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        // Load expected
        String expected = Files.readString(Paths.get("src/test/resources/expected30days.txt"));
        String actual = out.toString();

        assertEquals(expected.trim(), actual.trim());
    }

}
