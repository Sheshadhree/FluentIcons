package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DoubleTapSwipeUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DoubleTapSwipeUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 10.5f)
            curveTo(4.5f, 12.433f, 6.067f, 14f, 8f, 14f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -1.396f, -0.818f, -2.601f, -2f, -3.163f)
            verticalLineToRelative(-1.08f)
            curveToRelative(1.748f, 0.617f, 3f, 2.284f, 3f, 4.243f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveToRelative(-4.5f, -2.015f, -4.5f, -4.5f)
            curveToRelative(0f, -1.96f, 1.252f, -3.626f, 3f, -4.244f)
            verticalLineToRelative(1.08f)
            curveToRelative(-1.183f, 0.563f, -2f, 1.768f, -2f, 3.164f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(0f, -0.818f, -0.393f, -1.544f, -1f, -2f)
            verticalLineToRelative(2f)
            curveTo(9.5f, 11.328f, 8.828f, 12f, 8f, 12f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(-0.607f, 0.456f, -1f, 1.182f, -1f, 2f)
            curveTo(5.5f, 11.88f, 6.62f, 13f, 8f, 13f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveToRelative(-2f, 0f)
            curveTo(8.5f, 10.776f, 8.276f, 11f, 8f, 11f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(2.707f)
            lineTo(5.854f, 4.354f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(8.5f, 2.707f)
            verticalLineTo(10.5f)
            close()
        }
    }.build()
}
