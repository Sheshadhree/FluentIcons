package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Fluent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fluent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.724f, 2.053f)
            curveToRelative(-0.141f, -0.07f, -0.307f, -0.07f, -0.448f, 0f)
            lineToRelative(-5f, 2.5f)
            curveTo(5.107f, 4.638f, 5f, 4.81f, 5f, 5f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.176f, 0.092f, 0.338f, 0.243f, 0.429f)
            lineToRelative(5f, 3f)
            curveToRelative(0.154f, 0.092f, 0.347f, 0.095f, 0.503f, 0.006f)
            curveTo(10.903f, 17.846f, 11f, 17.68f, 11f, 17.5f)
            verticalLineToRelative(-4.691f)
            lineToRelative(4.724f, -2.362f)
            curveTo(15.893f, 10.363f, 16f, 10.19f, 16f, 10f)
            reflectiveCurveToRelative(-0.107f, -0.363f, -0.276f, -0.447f)
            lineTo(11.618f, 7.5f)
            lineToRelative(4.106f, -2.053f)
            curveTo(15.893f, 5.362f, 16f, 5.19f, 16f, 5f)
            reflectiveCurveToRelative(-0.107f, -0.362f, -0.276f, -0.447f)
            lineToRelative(-5f, -2.5f)
            close()
        }
    }.build()
}
