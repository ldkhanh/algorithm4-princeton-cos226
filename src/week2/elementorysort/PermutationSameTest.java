package week2.elementorysort;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static commonutil.Shuffler.shuffle;
import static org.junit.Assert.*;

public class PermutationSameTest {
    @Test
    public void testSuccess() {
        for (int k = 0; k < 10; k++) {
            int N = 10000;
            int[] arr = new int[N], arr2 = new int[N];
            Random r = new Random();
            for (int i = 0; i < N; i++) {
                arr2[i] = arr[i] = r.nextInt(N);
            }
            shuffle(arr);
            Assert.assertEquals(true, PermutationSame.same(arr, arr2));
        }
    }

    @Test
    public void testNotSuccess() {
        for (int k = 0; k < 10; k++) {
            int N = 10000;
            int[] arr = new int[N], arr2 = new int[N];
            Random r = new Random();
            for (int i = 0; i < N; i++) {
                arr2[i] = arr[i] = r.nextInt(N);
            }
            arr[0] = N;
            shuffle(arr);
            Assert.assertEquals(false, PermutationSame.same(arr, arr2));
        }
    }



}