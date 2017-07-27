package com.xingen.glideokhttp.librarymodule

import android.content.Context
import com.bumptech.glide.Registry
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.module.LibraryGlideModule
import java.io.InputStream

/**
 * Created by ${新根} on 2017/7/28.
 * blog ：http://blog.csdn.net/hexingen
 *  自定义一个OkHttp3集成的GlideModule，注册OkHttp相关类型。
 *
 *  介绍：运用程序使用了集成其他网络库，则会包含一个AppGlideModule和Glide`注解，而本类将会自动包含。
 *
 */
@GlideModule
internal class CustomOkHttpGlideModule : LibraryGlideModule(){
    override fun registerComponents(context: Context?, registry: Registry) {
                 registry.replace(GlideUrl::class.java,InputStream::class.java,OkHttpUrlLoader.factory)
    }
}