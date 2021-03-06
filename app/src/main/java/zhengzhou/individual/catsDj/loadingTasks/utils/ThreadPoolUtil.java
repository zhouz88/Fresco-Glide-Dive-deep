package zhengzhou.individual.catsDj.loadingTasks.utils;

import android.os.Process;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class ThreadPoolUtil {
    private static final ExecutorService mService =
            Executors.newFixedThreadPool(5, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "ThreadPoolUtils");
            thread.setPriority(Process.THREAD_PRIORITY_BACKGROUND);
            return thread;
        }
    });

    public static ExecutorService getService() {
        return mService;
    }
}
