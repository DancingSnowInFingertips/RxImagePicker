package com.qingmei2.sample.zhihu

import android.content.Context
import com.qingmei2.rximagepicker.entity.Result
import com.qingmei2.rximagepicker.entity.sources.Camera
import com.qingmei2.rximagepicker.entity.sources.Gallery
import com.qingmei2.rximagepicker.ui.ICustomPickerConfiguration
import com.qingmei2.rximagepicker_extension_zhihu.ui.ZhihuImagePickerActivity
import io.reactivex.rxjava3.core.Observable

interface ZhihuImagePicker {

    @Gallery(componentClazz = ZhihuImagePickerActivity::class,
            openAsFragment = false)
    fun openGalleryAsNormal(context: Context,
                            config: ICustomPickerConfiguration): Observable<Result>

    @Gallery(componentClazz = ZhihuImagePickerActivity::class,
            openAsFragment = false)
    fun openGalleryAsDracula(context: Context,
                             config: ICustomPickerConfiguration): Observable<Result>

    @Camera
    fun openCamera(context: Context): Observable<Result>
}
