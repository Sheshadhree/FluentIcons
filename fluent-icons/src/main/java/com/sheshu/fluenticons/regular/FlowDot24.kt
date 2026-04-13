package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlowDot24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlowDot24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 2.25f)
            curveToRelative(1.12f, 0f, 2.066f, 0.736f, 2.385f, 1.75f)
            horizontalLineToRelative(8.865f)
            lineToRelative(0.219f, 0.006f)
            curveTo(19.214f, 4.12f, 21f, 5.976f, 21f, 8.25f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-9.5f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            reflectiveCurveTo(5.731f, 18f, 7.25f, 18f)
            horizontalLineToRelative(8.865f)
            curveToRelative(0.319f, -1.014f, 1.266f, -1.75f, 2.385f, -1.75f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-1.12f, 0f, -2.066f, -0.736f, -2.385f, -1.75f)
            horizontalLineTo(7.25f)
            curveTo(4.903f, 19.5f, 3f, 17.597f, 3f, 15.25f)
            reflectiveCurveTo(4.903f, 11f, 7.25f, 11f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            curveToRelative(0f, -1.424f, -1.082f, -2.595f, -2.469f, -2.735f)
            lineTo(16.75f, 5.5f)
            horizontalLineTo(7.885f)
            curveTo(7.566f, 6.514f, 6.619f, 7.25f, 5.5f, 7.25f)
            curveTo(4.12f, 7.25f, 3f, 6.13f, 3f, 4.75f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.build()
}
