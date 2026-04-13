package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Megaphone12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Megaphone12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 2.504f)
            curveToRelative(0f, -1.052f, -1.055f, -1.777f, -2.037f, -1.4f)
            lineToRelative(-7f, 2.683f)
            curveTo(1.383f, 4.009f, 1f, 4.567f, 1f, 5.187f)
            verticalLineTo(6.27f)
            curveTo(1f, 6.922f, 1.422f, 7.5f, 2.044f, 7.7f)
            lineTo(3f, 8.002f)
            verticalLineTo(9f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            curveToRelative(1.012f, 0f, 1.848f, -0.752f, 1.982f, -1.727f)
            lineTo(9.044f, 9.93f)
            curveTo(10.012f, 10.239f, 11f, 9.517f, 11f, 8.5f)
            verticalLineTo(2.505f)
            close()
            moveTo(6f, 8.96f)
            verticalLineTo(9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(4f, 9.552f, 4f, 9f)
            verticalLineTo(8.322f)
            lineTo(6f, 8.96f)
            close()
            moveToRelative(3.321f, -6.923f)
            curveTo(9.648f, 1.912f, 10f, 2.154f, 10f, 2.504f)
            verticalLineToRelative(5.997f)
            curveToRelative(0f, 0.34f, -0.33f, 0.58f, -0.652f, 0.477f)
            lineToRelative(-7f, -2.232f)
            curveTo(2.141f, 6.68f, 2f, 6.486f, 2f, 6.269f)
            verticalLineTo(5.188f)
            curveTo(2f, 4.98f, 2.128f, 4.795f, 2.321f, 4.72f)
            lineToRelative(7f, -2.683f)
            close()
        }
    }.build()
}
