package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Comma20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Comma20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 7.5f)
            curveTo(13.5f, 5.567f, 11.933f, 4f, 10f, 4f)
            reflectiveCurveTo(6.5f, 5.567f, 6.5f, 7.5f)
            reflectiveCurveTo(8.067f, 11f, 10f, 11f)
            curveToRelative(0.842f, 0f, 1.615f, -0.298f, 2.22f, -0.793f)
            curveToRelative(-0.262f, 1.167f, -0.693f, 2.133f, -1.236f, 2.881f)
            curveTo(10.071f, 14.348f, 8.84f, 15f, 7.5f, 15f)
            curveTo(7.224f, 15f, 7f, 15.224f, 7f, 15.5f)
            reflectiveCurveTo(7.224f, 16f, 7.5f, 16f)
            curveToRelative(1.698f, 0f, 3.216f, -0.839f, 4.294f, -2.325f)
            curveTo(12.866f, 12.197f, 13.5f, 10.086f, 13.5f, 7.5f)
            close()
        }
    }.build()
}
