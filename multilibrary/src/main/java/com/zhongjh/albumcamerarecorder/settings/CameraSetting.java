package com.zhongjh.albumcamerarecorder.settings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.zhongjh.albumcamerarecorder.camera.listener.OnCameraViewListener;
import com.zhongjh.albumcamerarecorder.settings.api.CameraSettingApi;

import com.zhongjh.common.coordinator.VideoMergeCoordinator;
import com.zhongjh.common.enums.MimeType;

import java.util.Set;

/**
 * 有关拍摄界面的动态设置
 *
 * @author zhongjh
 * @date 2018/12/26
 */
public class CameraSetting implements CameraSettingApi {

    private final CameraSpec mCameraSpec;


    public CameraSetting() {
        mCameraSpec = CameraSpec.getCleanInstance();
    }

    @Override
    public void onDestroy() {
        mCameraSpec.onCameraViewListener = null;
    }

    @Override
    public CameraSetting mimeTypeSet(@NonNull Set<MimeType> mimeTypes) {
        mCameraSpec.mimeTypeSet = mimeTypes;
        return this;
    }

    @Override
    public CameraSetting duration(int duration) {
        mCameraSpec.duration = duration;
        return this;
    }

    @Override
    public CameraSetting minDuration(int minDuration) {
        mCameraSpec.minDuration = minDuration;
        return this;
    }

    @Override
    public CameraSetting isClickRecord(boolean isClickRecord) {
        mCameraSpec.isClickRecord = isClickRecord;
        return this;
    }

    @Override
    public CameraSetting videoMerge(VideoMergeCoordinator videoEditManager) {
        mCameraSpec.videoMergeCoordinator = videoEditManager;
        return this;
    }

    @Override
    public CameraSetting watermarkResource(int watermarkResource) {
        mCameraSpec.watermarkResource = watermarkResource;
        return this;
    }

    @Override
    public CameraSetting imageSwitch(int imageSwitch) {
        mCameraSpec.imageSwitch = imageSwitch;
        return this;
    }

    @Override
    public CameraSetting imageFlashOn(int imageFlashOn) {
        mCameraSpec.imageFlashOn = imageFlashOn;
        return this;
    }

    @Override
    public CameraSetting imageFlashOff(int imageFlashOff) {
        mCameraSpec.imageFlashOff = imageFlashOff;
        return this;
    }

    @Override
    public CameraSetting imageFlashAuto(int imageFlashAuto) {
        mCameraSpec.imageFlashAuto = imageFlashAuto;
        return this;
    }

    @Override
    public CameraSetting flashModel(int flashModel) {
        mCameraSpec.flashModel = flashModel;
        return this;
    }

    @Override
    public CameraSetting enableFlashMemoryModel(boolean enableFlashMemoryModel) {
        mCameraSpec.enableFlashMemoryModel = enableFlashMemoryModel;
        return this;
    }

    @Override
    public CameraSetting setOnCameraViewListener(@Nullable OnCameraViewListener listener) {
        mCameraSpec.onCameraViewListener = listener;
        return this;
    }


}
