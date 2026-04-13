package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookUpLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookUpLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 11.5f)
            curveTo(5f, 11.776f, 5.224f, 12f, 5.5f, 12f)
            horizontalLineToRelative(3f)
            curveToRelative(1.136f, 0f, 2.024f, -0.43f, 2.624f, -1.105f)
            curveTo(11.715f, 10.229f, 12f, 9.357f, 12f, 8.5f)
            curveToRelative(0f, -0.856f, -0.285f, -1.73f, -0.876f, -2.395f)
            curveTo(10.524f, 5.431f, 9.636f, 5f, 8.5f, 5f)
            horizontalLineTo(4.707f)
            lineToRelative(1.147f, -1.147f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(4.707f, 6f)
            horizontalLineTo(8.5f)
            curveToRelative(0.864f, 0f, 1.476f, 0.32f, 1.876f, 0.77f)
            curveTo(10.785f, 7.23f, 11f, 7.857f, 11f, 8.5f)
            reflectiveCurveToRelative(-0.215f, 1.27f, -0.624f, 1.73f)
            curveTo(9.976f, 10.68f, 9.364f, 11f, 8.5f, 11f)
            horizontalLineToRelative(-3f)
            curveTo(5.224f, 11f, 5f, 11.224f, 5f, 11.5f)
            close()
        }
    }.build()
}
