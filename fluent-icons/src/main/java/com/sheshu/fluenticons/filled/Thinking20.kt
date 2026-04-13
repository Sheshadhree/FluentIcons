package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Thinking20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Thinking20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.695f, 2.642f)
            curveTo(8.28f, 2.242f, 9.038f, 2f, 10f, 2f)
            curveToRelative(0.962f, 0f, 1.72f, 0.242f, 2.305f, 0.642f)
            curveToRelative(0.583f, 0.397f, 0.963f, 0.929f, 1.21f, 1.46f)
            curveToRelative(0.33f, 0.706f, 0.436f, 1.437f, 0.47f, 1.915f)
            curveToRelative(0.647f, 0.048f, 1.31f, 0.203f, 1.855f, 0.567f)
            curveTo(16.558f, 7.063f, 17f, 7.854f, 17f, 9f)
            curveToRelative(0f, 1.17f, -0.438f, 1.966f, -1.164f, 2.44f)
            curveTo(15.151f, 11.888f, 14.281f, 12f, 13.5f, 12f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.79f, 0f, -1.657f, -0.129f, -2.34f, -0.584f)
            curveTo(3.442f, 10.937f, 3f, 10.146f, 3f, 9f)
            reflectiveCurveToRelative(0.442f, -1.937f, 1.16f, -2.416f)
            curveTo(4.705f, 6.22f, 5.368f, 6.065f, 6.016f, 6.017f)
            curveTo(6.049f, 5.54f, 6.154f, 4.808f, 6.484f, 4.101f)
            curveToRelative(0.248f, -0.53f, 0.628f, -1.062f, 1.21f, -1.46f)
            close()
            moveTo(10f, 15f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(-5f, 1.5f)
            curveTo(5f, 17.328f, 4.328f, 18f, 3.5f, 18f)
            reflectiveCurveTo(2f, 17.328f, 2f, 16.5f)
            reflectiveCurveTo(2.672f, 15f, 3.5f, 15f)
            reflectiveCurveTo(5f, 15.672f, 5f, 16.5f)
            close()
        }
    }.build()
}
