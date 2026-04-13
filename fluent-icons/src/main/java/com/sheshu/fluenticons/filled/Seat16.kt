package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Seat16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Seat16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(3f)
            curveTo(13.582f, 7.186f, 13.063f, 7f, 12.5f, 7f)
            curveToRelative(-0.894f, 0f, -1.678f, 0.469f, -2.12f, 1.174f)
            curveTo(9.832f, 7.46f, 8.97f, 7f, 8f, 7f)
            reflectiveCurveTo(6.168f, 7.46f, 5.62f, 8.174f)
            curveTo(5.178f, 7.469f, 4.394f, 7f, 3.5f, 7f)
            curveTo(2.937f, 7f, 2.418f, 7.186f, 2f, 7.5f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(8f, 5.5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(1f, 4f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(9.5f)
            curveTo(14f, 8.672f, 13.328f, 8f, 12.5f, 8f)
            reflectiveCurveTo(11f, 8.672f, 11f, 9.5f)
            verticalLineTo(14f)
            close()
            moveToRelative(-6f, 0f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 14f, 2f, 13.216f, 2f, 12.25f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            reflectiveCurveTo(5f, 8.672f, 5f, 9.5f)
            verticalLineTo(14f)
            close()
        }
    }.build()
}
