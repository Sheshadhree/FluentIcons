package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DoubleTapSwipeDown16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DoubleTapSwipeDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 5.5f)
            curveTo(4.5f, 3.567f, 6.067f, 2f, 8f, 2f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            curveToRelative(0f, 1.396f, -0.818f, 2.601f, -2f, 3.163f)
            verticalLineToRelative(1.08f)
            curveToRelative(1.748f, -0.617f, 3f, -2.284f, 3f, -4.243f)
            curveTo(12.5f, 3.015f, 10.485f, 1f, 8f, 1f)
            reflectiveCurveTo(3.5f, 3.015f, 3.5f, 5.5f)
            curveToRelative(0f, 1.96f, 1.252f, 3.626f, 3f, 4.244f)
            verticalLineToRelative(-1.08f)
            curveTo(5.317f, 8.1f, 4.5f, 6.895f, 4.5f, 5.5f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(0f, 0.818f, -0.393f, 1.544f, -1f, 2f)
            verticalLineToRelative(-2f)
            curveTo(9.5f, 4.672f, 8.828f, 4f, 8f, 4f)
            reflectiveCurveTo(6.5f, 4.672f, 6.5f, 5.5f)
            verticalLineToRelative(2f)
            curveToRelative(-0.607f, -0.456f, -1f, -1.182f, -1f, -2f)
            curveTo(5.5f, 4.12f, 6.62f, 3f, 8f, 3f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveToRelative(-2f, 0f)
            curveTo(8.5f, 5.224f, 8.276f, 5f, 8f, 5f)
            reflectiveCurveTo(7.5f, 5.224f, 7.5f, 5.5f)
            verticalLineToRelative(7.793f)
            lineToRelative(-1.646f, -1.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(8.5f, 13.293f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}
