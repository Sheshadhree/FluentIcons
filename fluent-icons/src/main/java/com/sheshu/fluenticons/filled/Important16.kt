package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Important16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Important16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.96f, 4.457f)
            curveTo(5.722f, 3.18f, 6.7f, 2f, 8f, 2f)
            reflectiveCurveToRelative(2.279f, 1.18f, 2.04f, 2.457f)
            lineToRelative(-0.856f, 4.56f)
            curveTo(9.077f, 9.587f, 8.58f, 10f, 8f, 10f)
            reflectiveCurveTo(6.923f, 9.587f, 6.816f, 9.017f)
            lineTo(5.96f, 4.457f)
            close()
            moveTo(9.5f, 12.5f)
            curveTo(9.5f, 13.328f, 8.828f, 14f, 8f, 14f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(7.172f, 11f, 8f, 11f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
