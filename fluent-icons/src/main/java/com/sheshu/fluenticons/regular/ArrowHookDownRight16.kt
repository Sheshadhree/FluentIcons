package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookDownRight16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.876f, 5.105f)
            curveTo(5.476f, 4.431f, 6.364f, 4f, 7.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(10.776f, 4f, 11f, 4.224f, 11f, 4.5f)
            reflectiveCurveTo(10.776f, 5f, 10.5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(6.636f, 5f, 6.024f, 5.32f, 5.624f, 5.77f)
            curveTo(5.215f, 6.23f, 5f, 6.857f, 5f, 7.5f)
            reflectiveCurveToRelative(0.215f, 1.27f, 0.624f, 1.73f)
            curveTo(6.024f, 9.68f, 6.636f, 10f, 7.5f, 10f)
            horizontalLineToRelative(3.793f)
            lineToRelative(-1.146f, -1.146f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.707f)
            lineTo(11.293f, 11f)
            horizontalLineTo(7.5f)
            curveToRelative(-1.136f, 0f, -2.024f, -0.43f, -2.624f, -1.105f)
            curveTo(4.285f, 9.229f, 4f, 8.357f, 4f, 7.5f)
            curveToRelative(0f, -0.856f, 0.285f, -1.73f, 0.876f, -2.395f)
            close()
        }
    }.build()
}
