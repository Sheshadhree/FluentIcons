package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookUpRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.876f, 10.895f)
            curveTo(5.476f, 11.569f, 6.364f, 12f, 7.5f, 12f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 11f, 10.5f, 11f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.864f, 0f, -1.476f, -0.32f, -1.876f, -0.77f)
            curveTo(5.215f, 9.77f, 5f, 9.143f, 5f, 8.5f)
            curveToRelative(0f, -0.644f, 0.215f, -1.27f, 0.624f, -1.73f)
            curveTo(6.024f, 6.32f, 6.636f, 6f, 7.5f, 6f)
            horizontalLineToRelative(3.793f)
            lineToRelative(-1.146f, 1.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineTo(11.293f, 5f)
            horizontalLineTo(7.5f)
            curveTo(6.364f, 5f, 5.476f, 5.43f, 4.876f, 6.105f)
            curveTo(4.285f, 6.771f, 4f, 7.643f, 4f, 8.5f)
            reflectiveCurveToRelative(0.285f, 1.73f, 0.876f, 2.395f)
            close()
        }
    }.build()
}
