package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Emoji32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Emoji32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.923f, 19.733f)
            curveToRelative(-0.148f, -0.233f, -0.457f, -0.303f, -0.69f, -0.156f)
            curveToRelative(-0.234f, 0.148f, -0.303f, 0.457f, -0.156f, 0.69f)
            curveTo(10.5f, 22.519f, 13.161f, 24f, 16f, 24f)
            curveToRelative(2.839f, 0f, 5.5f, -1.481f, 6.923f, -3.733f)
            curveToRelative(0.147f, -0.233f, 0.078f, -0.542f, -0.156f, -0.69f)
            curveToRelative(-0.233f, -0.147f, -0.542f, -0.078f, -0.69f, 0.156f)
            curveTo(20.842f, 21.688f, 18.504f, 23f, 16f, 23f)
            reflectiveCurveToRelative(-4.842f, -1.312f, -6.077f, -3.267f)
            close()
            moveTo(13.5f, 13f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveToRelative(6.5f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(16f, 2f)
            curveTo(8.268f, 2f, 2f, 8.268f, 2f, 16f)
            reflectiveCurveToRelative(6.268f, 14f, 14f, 14f)
            reflectiveCurveToRelative(14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            close()
            moveTo(3f, 16f)
            curveTo(3f, 8.82f, 8.82f, 3f, 16f, 3f)
            reflectiveCurveToRelative(13f, 5.82f, 13f, 13f)
            reflectiveCurveToRelative(-5.82f, 13f, -13f, 13f)
            reflectiveCurveTo(3f, 23.18f, 3f, 16f)
            close()
        }
    }.build()
}
