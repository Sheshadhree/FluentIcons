package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookDownLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.5f)
            curveTo(5f, 4.224f, 5.224f, 4f, 5.5f, 4f)
            horizontalLineToRelative(3f)
            curveToRelative(1.136f, 0f, 2.024f, 0.43f, 2.624f, 1.105f)
            curveTo(11.715f, 5.771f, 12f, 6.643f, 12f, 7.5f)
            reflectiveCurveToRelative(-0.285f, 1.73f, -0.876f, 2.395f)
            curveTo(10.524f, 10.569f, 9.636f, 11f, 8.5f, 11f)
            horizontalLineTo(4.707f)
            lineToRelative(1.147f, 1.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(2f, -2f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineTo(4.707f, 10f)
            horizontalLineTo(8.5f)
            curveToRelative(0.864f, 0f, 1.476f, -0.32f, 1.876f, -0.77f)
            curveTo(10.785f, 8.77f, 11f, 8.143f, 11f, 7.5f)
            curveToRelative(0f, -0.644f, -0.215f, -1.27f, -0.624f, -1.73f)
            curveTo(9.976f, 5.32f, 9.364f, 5f, 8.5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(5.224f, 5f, 5f, 4.776f, 5f, 4.5f)
            close()
        }
    }.build()
}
