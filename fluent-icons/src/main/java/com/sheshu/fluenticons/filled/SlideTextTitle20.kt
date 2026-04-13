package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideTextTitle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideTextTitle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 4f)
            curveTo(3.12f, 4f, 2f, 5.12f, 2f, 6.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 14.88f, 3.12f, 16f, 4.5f, 16f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(18f, 5.12f, 16.88f, 4f, 15.5f, 4f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(6f, 7f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveTo(5.448f, 9f, 5f, 8.552f, 5f, 8f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
