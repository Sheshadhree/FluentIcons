package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Database24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Database24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 10f)
            curveToRelative(4.418f, 0f, 8f, -1.79f, 8f, -4f)
            reflectiveCurveToRelative(-3.582f, -4f, -8f, -4f)
            reflectiveCurveToRelative(-8f, 1.79f, -8f, 4f)
            reflectiveCurveToRelative(3.582f, 4f, 8f, 4f)
            close()
            moveToRelative(6.328f, 0.17f)
            curveToRelative(0.588f, -0.294f, 1.17f, -0.666f, 1.672f, -1.117f)
            verticalLineTo(18f)
            curveToRelative(0f, 2.21f, -3.582f, 4f, -8f, 4f)
            reflectiveCurveToRelative(-8f, -1.79f, -8f, -4f)
            verticalLineTo(9.053f)
            curveToRelative(0.502f, 0.451f, 1.084f, 0.823f, 1.672f, 1.117f)
            curveTo(7.37f, 11.018f, 9.608f, 11.5f, 12f, 11.5f)
            curveToRelative(2.392f, 0f, 4.63f, -0.482f, 6.328f, -1.33f)
            close()
        }
    }.build()
}
