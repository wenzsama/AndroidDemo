package com.hjw.mydownload;

/**
 * Created by Administrator on 2017/6/30.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onPaused();
    void onFailed();
    void onCanceled();
}
