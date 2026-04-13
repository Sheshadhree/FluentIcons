package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CompassNorthwest16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CompassNorthwest16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveTo(5.81f, 4.83f)
            curveTo(5.196f, 4.577f, 4.58f, 5.193f, 4.833f, 5.81f)
            lineToRelative(1.045f, 2.543f)
            curveToRelative(0.33f, 0.802f, 0.969f, 1.44f, 1.771f, 1.77f)
            lineToRelative(2.542f, 1.045f)
            curveToRelative(0.616f, 0.253f, 1.23f, -0.362f, 0.978f, -0.979f)
            lineToRelative(-1.044f, -2.543f)
            curveToRelative(-0.33f, -0.802f, -0.968f, -1.44f, -1.77f, -1.77f)
            lineTo(5.81f, 4.83f)
            close()
        }
    }.build()
}
