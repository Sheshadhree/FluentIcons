package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Location12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Location12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 0.5f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            curveToRelative(0f, 1.863f, -1.42f, 3.815f, -4.2f, 5.9f)
            curveToRelative(-0.178f, 0.133f, -0.422f, 0.133f, -0.6f, 0f)
            curveTo(2.92f, 8.815f, 1.5f, 6.863f, 1.5f, 5f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            close()
            moveToRelative(0f, 1f)
            curveTo(4.067f, 1.5f, 2.5f, 3.067f, 2.5f, 5f)
            curveToRelative(0f, 1.355f, 1.06f, 2.918f, 3.224f, 4.653f)
            lineTo(6f, 9.871f)
            lineToRelative(0.276f, -0.218f)
            curveTo(8.441f, 7.918f, 9.5f, 6.355f, 9.5f, 5f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(6f, 4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveTo(6.552f, 6f, 6f, 6f)
            reflectiveCurveTo(5f, 5.552f, 5f, 5f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
