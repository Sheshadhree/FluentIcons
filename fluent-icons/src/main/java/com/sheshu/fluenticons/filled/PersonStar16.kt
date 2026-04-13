package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonStar16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonStar16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.327f, 6.917f)
            curveTo(7.156f, 5.952f, 8.313f, 5.28f, 9.626f, 5.07f)
            curveTo(9.706f, 4.81f, 9.75f, 4.535f, 9.75f, 4.25f)
            curveTo(9.75f, 2.731f, 8.519f, 1.5f, 7f, 1.5f)
            reflectiveCurveTo(4.25f, 2.731f, 4.25f, 4.25f)
            curveToRelative(0f, 1.287f, 0.884f, 2.367f, 2.077f, 2.667f)
            close()
            moveTo(5f, 10.5f)
            curveTo(5f, 9.6f, 5.216f, 8.75f, 5.6f, 8f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 8f, 2f, 8.672f, 2f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.803f, 1.555f, 3.653f, 4.222f, 3.957f)
            curveTo(5.458f, 13.012f, 5f, 11.809f, 5f, 10.5f)
            close()
            moveToRelative(10f, 0f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
            moveToRelative(-4.024f, -2.64f)
            curveToRelative(-0.15f, -0.48f, -0.802f, -0.48f, -0.952f, 0f)
            lineTo(9.547f, 9.393f)
            horizontalLineTo(8f)
            curveToRelative(-0.484f, 0f, -0.686f, 0.647f, -0.294f, 0.944f)
            lineToRelative(1.25f, 0.947f)
            lineToRelative(-0.477f, 1.532f)
            curveToRelative(-0.15f, 0.48f, 0.378f, 0.88f, 0.77f, 0.583f)
            lineToRelative(1.25f, -0.947f)
            lineToRelative(1.25f, 0.947f)
            curveToRelative(0.392f, 0.297f, 0.92f, -0.103f, 0.77f, -0.583f)
            lineToRelative(-0.477f, -1.532f)
            lineToRelative(1.25f, -0.947f)
            curveToRelative(0.392f, -0.297f, 0.19f, -0.944f, -0.294f, -0.944f)
            horizontalLineToRelative(-1.546f)
            lineToRelative(-0.477f, -1.531f)
            close()
        }
    }.build()
}
