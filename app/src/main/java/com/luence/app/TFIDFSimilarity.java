package com.luence.app;
import java.lang.Math;
import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.search.CollectionStatistics;
import org.apache.lucene.search.TermStatistics;


public class TFIDFSimilarity extends org.apache.lucene.search.similarities.TFIDFSimilarity {


    @Override
    public float tf(float freq) {
        return freq;
    }

    @Override
    public float idf(long docFreq, long docCount) {
        return (float) Math.log((docCount + 1.0) / (docFreq + 1.0));
    }

    @Override
    public float lengthNorm(int length) {
        return length;
    }
}
