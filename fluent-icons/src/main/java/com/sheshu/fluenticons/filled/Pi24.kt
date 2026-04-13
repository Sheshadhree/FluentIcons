package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pi24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pi24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(15.25f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(17f)
            verticalLineToRelative(10.703f)
            curveToRelative(0f, 1.037f, 1.028f, 1.761f, 2.005f, 1.412f)
            lineToRelative(0.159f, -0.057f)
            curveToRelative(0.52f, -0.186f, 1.092f, 0.086f, 1.278f, 0.606f)
            curveToRelative(0.186f, 0.52f, -0.086f, 1.092f, -0.606f, 1.278f)
            lineToRelative(-0.159f, 0.057f)
            curveTo(17.397f, 20.813f, 15f, 19.123f, 15f, 16.703f)
            verticalLineTo(6f)
            horizontalLineTo(9.979f)
            curveTo(9.968f, 6.22f, 9.95f, 6.514f, 9.928f, 6.868f)
            curveToRelative(-0.056f, 0.83f, -0.151f, 1.995f, -0.31f, 3.343f)
            curveToRelative(-0.316f, 2.682f, -0.888f, 6.141f, -1.924f, 9.117f)
            curveToRelative(-0.18f, 0.522f, -0.75f, 0.798f, -1.272f, 0.617f)
            curveToRelative(-0.522f, -0.182f, -0.798f, -0.752f, -0.616f, -1.273f)
            curveToRelative(0.964f, -2.774f, 1.516f, -6.066f, 1.826f, -8.695f)
            curveToRelative(0.154f, -1.308f, 0.246f, -2.44f, 0.3f, -3.243f)
            curveTo(7.952f, 6.444f, 7.966f, 6.197f, 7.976f, 6f)
            horizontalLineTo(5f)
            curveTo(4.448f, 6f, 4f, 6.448f, 4f, 7f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}
