package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Important28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Important28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 20f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            close()
            moveToRelative(0f, -18f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            curveToRelative(0f, 0.538f, -0.126f, 1.257f, -0.304f, 2.02f)
            curveToRelative(-0.181f, 0.78f, -0.43f, 1.662f, -0.702f, 2.551f)
            curveToRelative(-0.543f, 1.779f, -1.19f, 3.616f, -1.607f, 4.765f)
            curveTo(16.02f, 17.346f, 15.06f, 18f, 14f, 18f)
            reflectiveCurveToRelative(-2.02f, -0.654f, -2.387f, -1.664f)
            curveToRelative(-0.417f, -1.15f, -1.063f, -2.986f, -1.607f, -4.765f)
            curveToRelative(-0.272f, -0.889f, -0.521f, -1.771f, -0.702f, -2.55f)
            curveTo(9.126f, 8.257f, 9f, 7.537f, 9f, 7f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            close()
        }
    }.build()
}
