package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareDovetailJoint12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareDovetailJoint12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            horizontalLineTo(4f)
            curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveTo(3f, 8f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.154f, 0.071f, 0.299f, 0.192f, 0.394f)
            curveToRelative(0.121f, 0.094f, 0.278f, 0.127f, 0.429f, 0.091f)
            lineTo(7f, 5.141f)
            verticalLineTo(6.86f)
            lineTo(5.621f, 6.516f)
            curveTo(5.472f, 6.478f, 5.314f, 6.513f, 5.192f, 6.607f)
            curveTo(5.07f, 6.702f, 5f, 6.847f, 5f, 7.001f)
            verticalLineToRelative(2f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(8f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            verticalLineTo(7.641f)
            lineToRelative(1.379f, 0.344f)
            curveToRelative(0.152f, 0.039f, 0.308f, 0.004f, 0.429f, -0.091f)
            reflectiveCurveTo(8f, 7.654f, 8f, 7.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.154f, -0.071f, -0.299f, -0.192f, -0.394f)
            curveToRelative(-0.121f, -0.094f, -0.278f, -0.13f, -0.429f, -0.091f)
            lineTo(6f, 4.359f)
            verticalLineTo(3f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4f)
            close()
        }
    }.build()
}
