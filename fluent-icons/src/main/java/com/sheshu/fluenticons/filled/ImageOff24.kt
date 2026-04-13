package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.263f, 1.264f)
            curveTo(3.177f, 5.04f, 3f, 5.624f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.626f, 0.177f, 1.21f, 0.483f, 1.706f)
            lineToRelative(6.926f, -6.926f)
            curveToRelative(0.186f, -0.186f, 0.396f, -0.332f, 0.62f, -0.44f)
            lineToRelative(1.49f, 1.49f)
            curveToRelative(-0.293f, -0.282f, -0.76f, -0.278f, -1.05f, 0.011f)
            lineToRelative(-6.925f, 6.926f)
            curveTo(5.04f, 20.823f, 5.624f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.626f, 0f, 1.21f, -0.177f, 1.706f, -0.483f)
            lineToRelative(1.263f, 1.264f)
            curveToRelative(0.293f, 0.292f, 0.768f, 0.292f, 1.061f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.061f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(21f, 17.75f)
            verticalLineToRelative(0.068f)
            lineTo(6.182f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            close()
            moveTo(16.5f, 9.5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
