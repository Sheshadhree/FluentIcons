package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BatteryCheckmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BatteryCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.5f)
            curveTo(2f, 6.12f, 3.12f, 5f, 4.5f, 5f)
            horizontalLineToRelative(9f)
            curveTo(14.88f, 5f, 16f, 6.12f, 16f, 7.5f)
            verticalLineToRelative(0.833f)
            lineToRelative(1.167f, 0.003f)
            curveToRelative(0.151f, 0f, 0.294f, 0.04f, 0.416f, 0.111f)
            curveTo(17.833f, 8.591f, 18f, 8.861f, 18f, 9.17f)
            verticalLineToRelative(1.667f)
            curveToRelative(0f, 0.308f, -0.168f, 0.577f, -0.417f, 0.721f)
            curveToRelative(-0.122f, 0.071f, -0.265f, 0.112f, -0.416f, 0.112f)
            lineTo(16f, 11.667f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-2.707f)
            curveTo(10.928f, 14.523f, 11f, 14.02f, 11f, 13.5f)
            curveTo(11f, 10.462f, 8.538f, 8f, 5.5f, 8f)
            curveTo(4.17f, 8f, 2.95f, 8.472f, 2f, 9.257f)
            verticalLineTo(7.5f)
            close()
            moveToRelative(8f, 6f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(1f, 15.985f, 1f, 13.5f)
            reflectiveCurveTo(3.015f, 9f, 5.5f, 9f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(4.5f, 14.293f)
            lineToRelative(-0.647f, -0.647f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
