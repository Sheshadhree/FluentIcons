package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Chat20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Chat20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            curveToRelative(-1.273f, 0f, -2.504f, -0.298f, -3.613f, -0.86f)
            lineToRelative(-0.121f, -0.065f)
            lineToRelative(-3.645f, 0.91f)
            curveToRelative(-0.31f, 0.078f, -0.595f, -0.148f, -0.62f, -0.441f)
            verticalLineToRelative(-0.082f)
            lineToRelative(0.014f, -0.083f)
            lineToRelative(0.91f, -3.644f)
            lineToRelative(-0.063f, -0.12f)
            curveToRelative(-0.455f, -0.896f, -0.738f, -1.873f, -0.83f, -2.887f)
            lineToRelative(-0.025f, -0.382f)
            lineTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            close()
            moveToRelative(0.5f, 9f)
            horizontalLineToRelative(-3f)
            lineToRelative(-0.09f, 0.008f)
            curveTo(7.177f, 11.05f, 7f, 11.255f, 7f, 11.5f)
            reflectiveCurveToRelative(0.177f, 0.45f, 0.41f, 0.492f)
            lineTo(7.5f, 12f)
            horizontalLineToRelative(3f)
            lineToRelative(0.09f, -0.008f)
            curveTo(10.823f, 11.95f, 11f, 11.745f, 11f, 11.5f)
            reflectiveCurveToRelative(-0.177f, -0.45f, -0.41f, -0.492f)
            lineTo(10.5f, 11f)
            close()
            moveToRelative(2f, -3f)
            horizontalLineToRelative(-5f)
            lineTo(7.41f, 8.008f)
            curveTo(7.177f, 8.05f, 7f, 8.255f, 7f, 8.5f)
            reflectiveCurveToRelative(0.177f, 0.45f, 0.41f, 0.492f)
            lineTo(7.5f, 9f)
            horizontalLineToRelative(5f)
            lineToRelative(0.09f, -0.008f)
            curveTo(12.823f, 8.95f, 13f, 8.745f, 13f, 8.5f)
            reflectiveCurveToRelative(-0.177f, -0.45f, -0.41f, -0.492f)
            lineTo(12.5f, 8f)
            close()
        }
    }.build()
}
