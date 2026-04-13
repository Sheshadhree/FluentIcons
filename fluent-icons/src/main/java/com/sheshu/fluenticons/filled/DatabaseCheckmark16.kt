package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DatabaseCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DatabaseCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 6f)
            curveToRelative(2.761f, 0f, 5f, -1.12f, 5f, -2.5f)
            reflectiveCurveTo(10.761f, 1f, 8f, 1f)
            reflectiveCurveTo(3f, 2.12f, 3f, 3.5f)
            reflectiveCurveTo(5.239f, 6f, 8f, 6f)
            close()
            moveTo(3f, 5.487f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 1.294f, 1.773f, 2.3f, 4.235f, 2.473f)
            curveTo(6.463f, 14.027f, 6f, 12.817f, 6f, 11.5f)
            curveToRelative(0f, -1.863f, 0.927f, -3.51f, 2.344f, -4.505f)
            curveTo(8.23f, 6.998f, 8.116f, 7f, 8f, 7f)
            curveTo(5.864f, 7f, 4.057f, 6.413f, 3f, 5.487f)
            close()
            moveTo(16f, 11.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(10.5f, 12.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
