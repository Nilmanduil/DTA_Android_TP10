package fr.codevallee.formation.android_tp10;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by tgoudouneix on 13/10/2017.
 */

public class NumberStack extends Stack<Integer> {
    public Integer[] getLastFour() {
        Integer number;
        Stack<Integer> stack = new Stack<Integer>();

        Integer[] result = {-1, -1, -1, -1};

        for (int i = 0; i < 4 && !this.isEmpty(); i++) {
            number = this.pop();
            result[i] = number;
            stack.add(number);
        }

        while(!stack.isEmpty()) {
            this.push(stack.pop());
        }

        return result;
    }
}
