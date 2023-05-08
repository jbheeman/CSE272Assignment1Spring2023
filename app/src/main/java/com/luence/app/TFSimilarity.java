package com.luence.app;

import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.search.CollectionStatistics;
import org.apache.lucene.search.TermStatistics;
import org.apache.lucene.search.similarities.Similarity;

public class TFSimilarity extends Similarity {


    @Override
    public long computeNorm(FieldInvertState state) {
        return 1;
    }

    @Override
    public SimScorer scorer(float boost, CollectionStatistics collectionStats, TermStatistics... termStats) {
        return new SimScorer() {
            @Override
            public float score(float freq, long norm) {
                return freq;
            }
        };
    }
}
