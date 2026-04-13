package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentBadge24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentBadge24",
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
            horizontalLineTo(13f)
            lineToRelative(-5f, 3.75f)
            curveToRelative(-0.824f, 0.618f, -2f, 0.03f, -2f, -1f)
            verticalLineTo(18f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
            verticalLineToRelative(-8.5f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineToRelative(12.087f)
            curveTo(17.12f, 3.455f, 17f, 3.963f, 17f, 4.5f)
            curveTo(17f, 6.433f, 18.567f, 8f, 20.5f, 8f)
            close()
        }
    }.build()
}
