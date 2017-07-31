package com.xingen.glideokhttp

import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.engine.cache.LruResourceCache
import com.bumptech.glide.module.AppGlideModule
import com.xingen.glideokhttp.appmodule.CustomBaseGlideUrlLoader

/**
 * Created by ${新根} on 2017/7/28.
 * blog ：http://blog.csdn.net/hexingen
 */
@GlideModule
internal class CustomAppGlideModule : AppGlideModule() {
    /**
     * 设置内存缓存大小10M
     */
    val  cacheSize=10*1024*1024
    override fun applyOptions(context: android.content.Context?, builder: com.bumptech.glide.GlideBuilder) {
        builder.setMemoryCache(LruResourceCache(cacheSize))
    }
    /**
     * 注册一个String类型的BaseGlideUrlLoader
     */
    override fun registerComponents(context: android.content.Context?, registry: com.bumptech.glide.Registry) {
        registry.append(String::class.java, java.io.InputStream::class.java,
                CustomBaseGlideUrlLoader.Companion.factory)
    }
    /**
     * 关闭解析AndroidManifest
     */
    override fun isManifestParsingEnabled(): Boolean {
        return false
    }
}
