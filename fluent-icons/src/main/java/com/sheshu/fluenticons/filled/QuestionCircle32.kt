package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.QuestionCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.QuestionCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveToRelative(7.732f, 0f, 14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            reflectiveCurveTo(8.268f, 2f, 16f, 2f)
            close()
            moveToRelative(1.5f, 20f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            close()
            moveTo(14f, 12f)
            curveToRelative(0f, -0.537f, 0.18f, -1.041f, 0.497f, -1.398f)
            curveTo(14.798f, 10.263f, 15.271f, 10f, 16f, 10f)
            curveToRelative(1.308f, 0f, 2.382f, 1.348f, 2.03f, 2.758f)
            curveToRelative(-0.18f, 0.722f, -0.61f, 1.135f, -1.257f, 1.756f)
            lineToRelative(-0.178f, 0.17f)
            curveTo(15.866f, 15.39f, 15f, 16.328f, 15f, 18f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            curveToRelative(0f, -0.827f, 0.353f, -1.267f, 0.985f, -1.877f)
            lineToRelative(0.191f, -0.182f)
            curveToRelative(0.614f, -0.58f, 1.466f, -1.385f, 1.794f, -2.699f)
            curveTo(20.618f, 10.652f, 18.692f, 8f, 16f, 8f)
            curveToRelative(-1.271f, 0f, -2.298f, 0.487f, -2.997f, 1.273f)
            curveTo(12.32f, 10.041f, 12f, 11.037f, 12f, 12f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
