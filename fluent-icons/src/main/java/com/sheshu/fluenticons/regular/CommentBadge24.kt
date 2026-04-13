package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CommentBadge24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentBadge24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 7f)
            curveTo(21.88f, 7f, 23f, 5.88f, 23f, 4.5f)
            reflectiveCurveTo(21.88f, 2f, 20.5f, 2f)
            reflectiveCurveTo(18f, 3.12f, 18f, 4.5f)
            reflectiveCurveTo(19.12f, 7f, 20.5f, 7f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(0.537f, 0f, 1.045f, -0.12f, 1.5f, -0.337f)
            verticalLineToRelative(7.087f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-5.738f)
            lineTo(8f, 21.75f)
            curveToRelative(-0.553f, 0.414f, -1.337f, 0.301f, -1.75f, -0.252f)
            curveTo(6.087f, 21.282f, 6f, 21.02f, 6f, 20.75f)
            verticalLineTo(18f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
            verticalLineToRelative(-8.5f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineToRelative(12.087f)
            curveTo(17.12f, 3.455f, 17f, 3.963f, 17f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(2.249f)
            verticalLineToRelative(3.75f)
            lineToRelative(5.015f, -3.75f)
            horizontalLineToRelative(6.236f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
