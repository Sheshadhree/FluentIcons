package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Home12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Home12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.37f, 1.222f)
            curveToRelative(0.368f, -0.297f, 0.892f, -0.297f, 1.26f, 0f)
            lineToRelative(3.814f, 3.09f)
            curveTo(10.796f, 4.595f, 11f, 5.023f, 11f, 5.476f)
            verticalLineTo(10f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(7f)
            horizontalLineTo(5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(2f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(5.477f)
            curveToRelative(0f, -0.453f, 0.204f, -0.881f, 0.556f, -1.166f)
            lineToRelative(3.815f, -3.089f)
            close()
            moveToRelative(4.445f, 3.866f)
            lineTo(6f, 2f)
            lineTo(2.185f, 5.088f)
            curveTo(2.068f, 5.183f, 2f, 5.326f, 2f, 5.477f)
            verticalLineTo(10f)
            horizontalLineToRelative(2f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2f)
            verticalLineTo(5.477f)
            curveToRelative(0f, -0.15f, -0.068f, -0.294f, -0.185f, -0.389f)
            close()
        }
    }.build()
}
