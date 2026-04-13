package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonProhibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonProhibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 15f)
            curveTo(8.015f, 15f, 6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            reflectiveCurveTo(12.985f, 15f, 10.5f, 15f)
            close()
            moveToRelative(-2.803f, -2.404f)
            lineToRelative(4.9f, -4.9f)
            curveTo(12.011f, 7.26f, 11.286f, 7f, 10.5f, 7f)
            curveTo(8.567f, 7f, 7f, 8.567f, 7f, 10.5f)
            curveToRelative(0f, 0.786f, 0.26f, 1.512f, 0.697f, 2.096f)
            close()
            moveToRelative(0.707f, 0.707f)
            curveTo(8.988f, 13.741f, 9.714f, 14f, 10.5f, 14f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -0.786f, -0.26f, -1.512f, -0.697f, -2.096f)
            lineToRelative(-4.9f, 4.9f)
            close()
            moveTo(9.626f, 5.07f)
            curveToRelative(-1.313f, 0.21f, -2.47f, 0.883f, -3.299f, 1.848f)
            curveToRelative(-1.193f, -0.3f, -2.077f, -1.38f, -2.077f, -2.667f)
            curveTo(4.25f, 2.731f, 5.481f, 1.5f, 7f, 1.5f)
            reflectiveCurveToRelative(2.75f, 1.231f, 2.75f, 2.75f)
            curveToRelative(0f, 0.285f, -0.043f, 0.56f, -0.124f, 0.82f)
            close()
            moveTo(5.6f, 8f)
            curveTo(5.216f, 8.75f, 5f, 9.6f, 5f, 10.5f)
            curveToRelative(0f, 1.31f, 0.458f, 2.512f, 1.222f, 3.457f)
            curveTo(3.555f, 13.653f, 2f, 11.803f, 2f, 10f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(2.1f)
            close()
        }
    }.build()
}
