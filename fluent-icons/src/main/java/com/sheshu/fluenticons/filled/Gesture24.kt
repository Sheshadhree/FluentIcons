package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Gesture24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Gesture24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 18f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
            moveTo(7f, 4f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(17f, 6f)
            horizontalLineToRelative(-4.649f)
            lineToRelative(8.01f, 3.102f)
            curveToRelative(0.77f, 0.298f, 0.855f, 1.33f, 0.195f, 1.764f)
            lineToRelative(-0.11f, 0.064f)
            lineToRelative(-14f, 6.965f)
            curveToRelative(-0.495f, 0.246f, -1.095f, 0.045f, -1.341f, -0.45f)
            curveToRelative(-0.229f, -0.459f, -0.071f, -1.01f, 0.348f, -1.282f)
            lineToRelative(0.102f, -0.058f)
            lineToRelative(11.97f, -5.956f)
            lineTo(6.64f, 5.933f)
            curveTo(5.645f, 5.548f, 5.873f, 4.112f, 6.88f, 4.005f)
            lineTo(7f, 4f)
            horizontalLineToRelative(10f)
            horizontalLineTo(7f)
            close()
            moveToRelative(13f, 0f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
