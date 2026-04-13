package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRotateClockwise24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRotateClockwise24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3f)
            curveToRelative(4.97f, 0f, 9f, 4.03f, 9f, 9f)
            curveToRelative(0f, 3.436f, -1.942f, 6.488f, -4.873f, 8.001f)
            lineTo(18f, 20f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(18f, 22f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.883f)
            lineTo(13f, 21f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            curveToRelative(0.513f, 0f, 0.935f, 0.386f, 0.993f, 0.883f)
            lineTo(15f, 17f)
            lineToRelative(0.001f, 1.327f)
            curveTo(17.397f, 17.19f, 19f, 14.753f, 19f, 12f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            close()
            moveToRelative(0f, 6f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            close()
            moveToRelative(0f, 2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
