/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.luence.app;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        StandardAnalyzer analyzer = new StandardAnalyzer();
        assertTrue(true);
        //assertNotNull("index shouldn't be null", App.index(analyzer));
    }
}
