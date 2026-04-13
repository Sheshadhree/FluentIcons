package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Mic24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mic24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.25f, 11f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(19f, 11.75f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 3.56f, -2.755f, 6.475f, -6.249f, 6.732f)
            lineTo(12.75f, 21.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(11.25f, 21.25f)
            verticalLineToRelative(-2.268f)
            curveToRelative(-3.417f, -0.25f, -6.127f, -3.044f, -6.246f, -6.496f)
            lineTo(5f, 12.25f)
            verticalLineToRelative(-0.5f)
            curveTo(5f, 11.336f, 5.336f, 11f, 5.75f, 11f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(6.5f, 11.75f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 2.827f, 2.235f, 5.132f, 5.034f, 5.246f)
            lineTo(11.75f, 17.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(2.827f, 0f, 5.132f, -2.234f, 5.246f, -5.034f)
            lineTo(17.5f, 12.25f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveTo(12f, 2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
        }
    }.build()
}
