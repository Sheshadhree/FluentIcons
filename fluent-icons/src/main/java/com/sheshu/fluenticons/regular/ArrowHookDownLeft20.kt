package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookDownLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineTo(11f)
            curveToRelative(1.636f, 0f, 2.9f, 0.618f, 3.749f, 1.574f)
            curveTo(15.59f, 6.521f, 16f, 7.77f, 16f, 9f)
            curveToRelative(0f, 1.232f, -0.41f, 2.48f, -1.251f, 3.426f)
            curveTo(13.899f, 13.382f, 12.636f, 14f, 11f, 14f)
            horizontalLineTo(5.707f)
            lineToRelative(2.647f, 2.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(5.707f, 13f)
            horizontalLineTo(11f)
            curveToRelative(1.364f, 0f, 2.35f, -0.507f, 3.001f, -1.238f)
            curveTo(14.66f, 11.02f, 15f, 10.018f, 15f, 9f)
            curveToRelative(0f, -1.019f, -0.34f, -2.02f, -0.999f, -2.762f)
            curveTo(13.351f, 5.507f, 12.364f, 5f, 11f, 5f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 5f, 6f, 4.776f, 6f, 4.5f)
            close()
        }
    }.build()
}
