package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BowlChopsticks24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BowlChopsticks24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.4f, 2.376f)
            curveTo(6.193f, 2.016f, 5.735f, 1.894f, 5.376f, 2.1f)
            curveTo(5.016f, 2.307f, 4.893f, 2.765f, 5.1f, 3.124f)
            lineTo(9.635f, 11f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
            verticalLineTo(12f)
            curveToRelative(0f, 5.523f, 4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-5.885f)
            lineTo(10.4f, 2.376f)
            curveTo(10.193f, 2.016f, 9.735f, 1.894f, 9.376f, 2.1f)
            curveTo(9.016f, 2.307f, 8.893f, 2.765f, 9.1f, 3.124f)
            lineTo(13.635f, 11f)
            horizontalLineToRelative(-2.27f)
            lineTo(6.4f, 2.376f)
            close()
            moveTo(4.787f, 16.5f)
            horizontalLineToRelative(14.425f)
            curveToRelative(-1.502f, 2.402f, -4.17f, 4f, -7.212f, 4f)
            reflectiveCurveToRelative(-5.71f, -1.598f, -7.213f, -4f)
            close()
            moveTo(4.045f, 15f)
            curveToRelative(-0.296f, -0.784f, -0.48f, -1.624f, -0.53f, -2.5f)
            horizontalLineToRelative(16.97f)
            curveToRelative(-0.05f, 0.876f, -0.233f, 1.716f, -0.53f, 2.5f)
            horizontalLineTo(4.045f)
            close()
        }
    }.build()
}
