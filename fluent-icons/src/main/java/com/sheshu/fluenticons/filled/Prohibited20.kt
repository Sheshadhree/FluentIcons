package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Prohibited20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Prohibited20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            close()
            moveToRelative(-1.5f, 0f)
            curveToRelative(0f, -1.525f, -0.525f, -2.927f, -1.404f, -4.035f)
            lineToRelative(-9.131f, 9.131f)
            curveTo(7.073f, 15.975f, 8.475f, 16.5f, 10f, 16.5f)
            curveToRelative(3.59f, 0f, 6.5f, -2.91f, 6.5f, -6.5f)
            close()
            moveTo(4.904f, 14.035f)
            lineToRelative(9.131f, -9.131f)
            curveTo(12.927f, 4.025f, 11.525f, 3.5f, 10f, 3.5f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            curveToRelative(0f, 1.525f, 0.525f, 2.927f, 1.404f, 4.035f)
            close()
        }
    }.build()
}
