package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowFlowDiagonalUpRight24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFlowDiagonalUpRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.75f, 4f)
            curveTo(12.336f, 4f, 12f, 4.336f, 12f, 4.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(4.69f)
            lineToRelative(-8.192f, 8.191f)
            curveTo(8.608f, 13.255f, 7.834f, 13f, 7f, 13f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            curveToRelative(0f, -0.834f, -0.255f, -1.607f, -0.691f, -2.248f)
            lineTo(18.5f, 6.56f)
            verticalLineToRelative(4.689f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(20f, 11.664f, 20f, 11.25f)
            verticalLineToRelative(-6.5f)
            curveTo(20f, 4.336f, 19.664f, 4f, 19.25f, 4f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(4.5f, 17f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
        }
    }.build()
}
