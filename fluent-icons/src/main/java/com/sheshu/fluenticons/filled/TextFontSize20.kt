package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextFontSize20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextFontSize20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.007f, 3f)
            curveToRelative(0.317f, 0.003f, 0.598f, 0.205f, 0.702f, 0.504f)
            lineToRelative(4.25f, 12.25f)
            curveToRelative(0.136f, 0.391f, -0.072f, 0.819f, -0.463f, 0.955f)
            curveToRelative(-0.391f, 0.135f, -0.819f, -0.072f, -0.954f, -0.463f)
            lineToRelative(-1.3f, -3.746f)
            horizontalLineToRelative(-4.657f)
            lineToRelative(-1.38f, 3.759f)
            curveToRelative(-0.108f, 0.293f, -0.386f, 0.488f, -0.698f, 0.491f)
            curveToRelative(-0.312f, 0.003f, -0.594f, -0.188f, -0.706f, -0.48f)
            lineTo(6.92f, 14f)
            horizontalLineTo(4.257f)
            lineToRelative(-0.799f, 2.25f)
            curveToRelative(-0.139f, 0.391f, -0.567f, 0.595f, -0.958f, 0.457f)
            curveToRelative(-0.39f, -0.139f, -0.594f, -0.567f, -0.456f, -0.958f)
            lineTo(4.793f, 8f)
            curveTo(4.898f, 7.704f, 5.176f, 7.505f, 5.49f, 7.5f)
            curveTo(5.803f, 7.496f, 6.086f, 7.687f, 6.2f, 7.98f)
            lineToRelative(2.282f, 5.895f)
            lineTo(12.296f, 3.49f)
            curveToRelative(0.11f, -0.296f, 0.394f, -0.493f, 0.711f, -0.49f)
            close()
            moveToRelative(-8.219f, 9.5f)
            horizontalLineToRelative(1.553f)
            lineToRelative(-0.81f, -2.093f)
            lineTo(4.788f, 12.5f)
            close()
            moveToRelative(8.192f, -6.52f)
            lineTo(11.136f, 11f)
            horizontalLineToRelative(3.586f)
            lineTo(12.98f, 5.98f)
            close()
        }
    }.build()
}
