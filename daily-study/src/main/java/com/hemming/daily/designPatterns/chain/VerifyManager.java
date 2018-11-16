package com.hemming.daily.designPatterns.chain;

import java.util.ArrayList;
import java.util.List;

public class VerifyManager {
    private List<Verify> verifies = new ArrayList<>();

    public VerifyManager addVerify(Verify verify) {
        verifies.add(verify);
        return this;
    }

    public boolean execute() throws Exception {
        if (verifies.isEmpty()) {
            return true;
        }

        int size = verifies.size();

        if (size == 1) {
            return verifies.get(0).doVerify();
        }

        Verify verify = verifies.get(0);
        int i = 1;
        while (i < size) {
            Verify temp = verifies.get(i);
            verify.setNextVerify(temp);
            i++;
        }

        return verifies.get(0).doVerify();
    }
}
