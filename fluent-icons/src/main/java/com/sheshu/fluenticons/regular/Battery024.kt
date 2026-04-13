package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Battery024: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Battery024",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 6f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.182f, 0f, 0.353f, 0.049f, 0.5f, 0.134f)
            curveTo(21.8f, 10.307f, 22f, 10.63f, 22f, 11f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.37f, -0.2f, 0.693f, -0.5f, 0.866f)
            curveTo(21.353f, 13.951f, 21.182f, 14f, 21f, 14f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(12f)
            close()
            moveToRelative(-0.002f, 1.5f)
            horizontalLineTo(5f)
            curveToRelative(-0.78f, 0f, -1.42f, 0.595f, -1.494f, 1.355f)
            lineTo(3.5f, 9f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.78f, 0.595f, 1.42f, 1.355f, 1.493f)
            lineTo(5f, 16.5f)
            horizontalLineToRelative(11.998f)
            curveToRelative(0.78f, 0f, 1.42f, -0.595f, 1.493f, -1.355f)
            lineTo(18.498f, 15f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.78f, -0.595f, -1.42f, -1.355f, -1.493f)
            lineTo(16.998f, 7.5f)
            close()
        }
    }.build()
}
