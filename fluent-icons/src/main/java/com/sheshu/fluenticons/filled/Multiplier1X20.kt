package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Multiplier1X20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Multiplier1X20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 6.75f)
            curveToRelative(0f, -0.334f, -0.221f, -0.628f, -0.543f, -0.72f)
            curveToRelative(-0.321f, -0.093f, -0.665f, 0.038f, -0.842f, 0.322f)
            lineTo(7.067f, 6.427f)
            curveTo(6.853f, 6.77f, 6.707f, 7.003f, 6.492f, 7.24f)
            curveTo(6.267f, 7.486f, 5.945f, 7.76f, 5.364f, 8.107f)
            curveTo(5.01f, 8.32f, 4.894f, 8.78f, 5.107f, 9.136f)
            curveTo(5.32f, 9.49f, 5.781f, 9.606f, 6.136f, 9.393f)
            curveTo(6.476f, 9.19f, 6.759f, 8.996f, 7f, 8.805f)
            verticalLineToRelative(4.445f)
            curveTo(7f, 13.664f, 7.336f, 14f, 7.75f, 14f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(2.78f, 3.47f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            lineTo(10.94f, 12f)
            lineToRelative(-0.72f, 0.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(12f, 13.06f)
            lineToRelative(0.72f, 0.72f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(13.06f, 12f)
            lineToRelative(0.72f, -0.72f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(12f, 10.94f)
            lineToRelative(-0.72f, -0.72f)
            close()
        }
    }.build()
}
