package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Fluent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fluent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.585f, 2.082f)
            curveToRelative(-0.21f, -0.106f, -0.46f, -0.106f, -0.67f, 0f)
            lineToRelative(-6f, 3f)
            curveTo(5.66f, 5.209f, 5.5f, 5.468f, 5.5f, 5.752f)
            verticalLineTo(17.48f)
            curveToRelative(0f, 0.258f, 0.133f, 0.498f, 0.351f, 0.636f)
            lineToRelative(6f, 3.77f)
            curveToRelative(0.231f, 0.144f, 0.523f, 0.152f, 0.762f, 0.02f)
            reflectiveCurveTo(13f, 21.523f, 13f, 21.25f)
            verticalLineToRelative(-6.034f)
            lineToRelative(5.585f, -2.793f)
            curveTo(18.84f, 12.296f, 19f, 12.037f, 19f, 11.753f)
            curveToRelative(0f, -0.285f, -0.16f, -0.544f, -0.415f, -0.671f)
            lineToRelative(-4.658f, -2.33f)
            lineToRelative(4.658f, -2.329f)
            curveTo(18.84f, 6.296f, 19f, 6.037f, 19f, 5.753f)
            curveToRelative(0f, -0.285f, -0.16f, -0.544f, -0.415f, -0.671f)
            lineToRelative(-6f, -3f)
            close()
        }
    }.build()
}
