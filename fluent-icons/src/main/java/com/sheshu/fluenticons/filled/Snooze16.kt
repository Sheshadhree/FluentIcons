package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Snooze16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Snooze16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 7.5f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.574f, 0f, 0.922f, 0.61f, 0.665f, 1.097f)
            lineTo(7.11f, 8.686f)
            lineTo(5.457f, 11f)
            horizontalLineToRelative(1.042f)
            curveToRelative(0.415f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(6.5f, 12.5f)
            horizontalLineTo(4f)
            curveToRelative(-0.574f, 0f, -0.922f, -0.61f, -0.665f, -1.097f)
            lineToRelative(0.055f, -0.089f)
            lineTo(5.042f, 9f)
            horizontalLineTo(3.999f)
            curveTo(3.585f, 9f, 3.25f, 8.664f, 3.25f, 8.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.649f, -0.743f)
            lineToRelative(0.1f, -0.007f)
            horizontalLineToRelative(2.5f)
            horizontalLineTo(4f)
            close()
            moveToRelative(5f, -5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.556f, 0f, 0.907f, 0.579f, 0.681f, 1.063f)
            lineToRelative(-0.049f, 0.09f)
            lineTo(10.366f, 8f)
            horizontalLineToRelative(2.133f)
            curveToRelative(0.415f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(12.5f, 9.5f)
            horizontalLineTo(9f)
            curveToRelative(-0.557f, 0f, -0.907f, -0.579f, -0.681f, -1.063f)
            lineToRelative(0.049f, -0.09f)
            lineTo(11.133f, 4f)
            horizontalLineTo(9f)
            curveTo(8.585f, 4f, 8.25f, 3.664f, 8.25f, 3.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.649f, -0.743f)
            lineToRelative(0.1f, -0.007f)
            horizontalLineToRelative(3.5f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}
