package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DatabaseStack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DatabaseStack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveTo(5.149f, 1f, 3f, 2.075f, 3f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 13.925f, 5.149f, 15f, 8f, 15f)
            reflectiveCurveToRelative(5f, -1.075f, 5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(13f, 2.075f, 10.851f, 1f, 8f, 1f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(2.441f, 0f, 4f, 0.888f, 4f, 1.5f)
            reflectiveCurveTo(10.441f, 5f, 8f, 5f)
            reflectiveCurveTo(4f, 4.112f, 4f, 3.5f)
            reflectiveCurveTo(5.558f, 2f, 8f, 2f)
            close()
            moveToRelative(0f, 12f)
            curveToRelative(-2.442f, 0f, -4f, -0.889f, -4f, -1.5f)
            verticalLineTo(9.537f)
            curveTo(4.897f, 10.13f, 6.328f, 10.5f, 8f, 10.5f)
            curveToRelative(1.672f, 0f, 3.103f, -0.37f, 4f, -0.963f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.611f, -1.559f, 1.5f, -4f, 1.5f)
            close()
            moveToRelative(0f, -4.5f)
            curveTo(5.558f, 9.5f, 4f, 8.612f, 4f, 8f)
            verticalLineTo(5.021f)
            curveTo(5.214f, 5.719f, 6.601f, 6.058f, 8f, 6f)
            curveToRelative(1.399f, 0.058f, 2.786f, -0.281f, 4f, -0.979f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.612f, -1.558f, 1.5f, -4f, 1.5f)
            close()
        }
    }.build()
}
