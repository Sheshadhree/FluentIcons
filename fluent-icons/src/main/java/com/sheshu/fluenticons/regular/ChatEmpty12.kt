package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatEmpty12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatEmpty12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            curveToRelative(-0.873f, 0f, -1.694f, -0.224f, -2.41f, -0.618f)
            lineToRelative(-1.944f, 0.592f)
            curveToRelative(-0.177f, 0.054f, -0.369f, 0.006f, -0.5f, -0.125f)
            curveToRelative(-0.13f, -0.13f, -0.178f, -0.322f, -0.124f, -0.499f)
            lineToRelative(0.592f, -1.947f)
            curveTo(1.223f, 7.689f, 1f, 6.87f, 1f, 6f)
            close()
            moveToRelative(5f, -4f)
            curveTo(3.79f, 2f, 2f, 3.79f, 2f, 6f)
            curveToRelative(0f, 0.763f, 0.213f, 1.474f, 0.583f, 2.08f)
            curveToRelative(0.074f, 0.122f, 0.093f, 0.27f, 0.051f, 0.406f)
            lineTo(2.251f, 9.745f)
            lineToRelative(1.257f, -0.383f)
            curveTo(3.645f, 9.32f, 3.793f, 9.34f, 3.914f, 9.414f)
            curveTo(4.521f, 9.786f, 5.234f, 10f, 6f, 10f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveTo(8.21f, 2f, 6f, 2f)
            close()
        }
    }.build()
}
