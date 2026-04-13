package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BranchFork20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BranchFork20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 5f)
            curveToRelative(0f, 1.487f, -1.081f, 2.72f, -2.5f, 2.958f)
            verticalLineTo(10f)
            horizontalLineTo(12f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(7.958f)
            curveTo(12.081f, 7.721f, 11f, 6.487f, 11f, 5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            curveToRelative(0f, 1.487f, -1.081f, 2.72f, -2.5f, 2.958f)
            verticalLineTo(8.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(6.5f)
            verticalLineToRelative(1.041f)
            curveTo(7.919f, 12.28f, 9f, 13.514f, 9f, 15f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -1.486f, 1.081f, -2.72f, 2.5f, -2.959f)
            verticalLineTo(7.958f)
            curveTo(4.081f, 7.721f, 3f, 6.487f, 3f, 5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
    }.build()
}
