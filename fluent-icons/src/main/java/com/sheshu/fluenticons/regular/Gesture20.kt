package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Gesture20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Gesture20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.011f, 4.394f)
            curveTo(5.061f, 4.164f, 5.265f, 4f, 5.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 4f, 15f, 4.224f, 15f, 4.5f)
            reflectiveCurveTo(14.776f, 5f, 14.5f, 5f)
            horizontalLineTo(7.808f)
            lineToRelative(8.899f, 4.045f)
            curveTo(16.88f, 9.123f, 16.993f, 9.293f, 17f, 9.483f)
            curveToRelative(0.006f, 0.19f, -0.096f, 0.367f, -0.263f, 0.457f)
            lineToRelative(-11f, 5.923f)
            curveToRelative(-0.243f, 0.131f, -0.546f, 0.04f, -0.677f, -0.203f)
            curveToRelative(-0.131f, -0.243f, -0.04f, -0.546f, 0.203f, -0.677f)
            lineToRelative(10.112f, -5.445f)
            lineTo(5.293f, 4.955f)
            curveToRelative(-0.214f, -0.097f, -0.332f, -0.33f, -0.282f, -0.56f)
            close()
            moveTo(17f, 4.5f)
            curveTo(17f, 4.776f, 16.776f, 5f, 16.5f, 5f)
            reflectiveCurveTo(16f, 4.776f, 16f, 4.5f)
            reflectiveCurveTo(16.224f, 4f, 16.5f, 4f)
            reflectiveCurveTo(17f, 4.224f, 17f, 4.5f)
            close()
            moveTo(3.5f, 17f)
            curveTo(3.776f, 17f, 4f, 16.776f, 4f, 16.5f)
            reflectiveCurveTo(3.776f, 16f, 3.5f, 16f)
            reflectiveCurveTo(3f, 16.224f, 3f, 16.5f)
            reflectiveCurveTo(3.224f, 17f, 3.5f, 17f)
            close()
        }
    }.build()
}
