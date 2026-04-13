package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareDovetailJoint12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareDovetailJoint12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.192f, 6.606f)
            curveTo(5.071f, 6.701f, 5f, 6.846f, 5f, 7f)
            verticalLineToRelative(2.999f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.154f, 0.07f, 0.299f, 0.192f, 0.394f)
            curveToRelative(0.121f, 0.095f, 0.278f, 0.129f, 0.429f, 0.091f)
            lineTo(7f, 5.14f)
            verticalLineToRelative(1.719f)
            lineTo(5.621f, 6.515f)
            curveTo(5.472f, 6.478f, 5.314f, 6.511f, 5.192f, 6.606f)
            close()
            moveTo(6f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            verticalLineTo(7.641f)
            lineToRelative(1.379f, 0.345f)
            curveTo(7.532f, 8.023f, 7.687f, 7.99f, 7.808f, 7.895f)
            reflectiveCurveTo(8f, 7.654f, 8f, 7.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.154f, -0.071f, -0.299f, -0.192f, -0.394f)
            curveToRelative(-0.121f, -0.094f, -0.279f, -0.13f, -0.429f, -0.091f)
            lineTo(6f, 4.359f)
            verticalLineTo(2f)
            close()
        }
    }.build()
}
