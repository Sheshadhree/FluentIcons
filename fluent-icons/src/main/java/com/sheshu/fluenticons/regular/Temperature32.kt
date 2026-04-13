package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Temperature32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Temperature32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 5f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(9.975f)
            lineToRelative(-0.333f, 0.298f)
            curveTo(11.642f, 19.19f, 11f, 20.519f, 11f, 22f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            curveToRelative(0f, -1.48f, -0.642f, -2.81f, -1.667f, -3.727f)
            lineTo(19f, 17.975f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(-5f, 3f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            verticalLineToRelative(9.101f)
            curveToRelative(1.236f, 1.262f, 2f, 2.992f, 2f, 4.899f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            curveToRelative(0f, -1.907f, 0.764f, -3.637f, 2f, -4.899f)
            verticalLineTo(8f)
            close()
            moveToRelative(4f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(7.17f)
            curveToRelative(1.165f, 0.412f, 2f, 1.524f, 2f, 2.83f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -1.306f, 0.835f, -2.418f, 2f, -2.83f)
            verticalLineTo(12f)
            close()
        }
    }.build()
}
