package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterVertical16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 15f)
            curveTo(8.224f, 15f, 8f, 14.776f, 8f, 14.5f)
            verticalLineTo(14f)
            horizontalLineTo(6.75f)
            curveTo(5.784f, 14f, 5f, 13.216f, 5f, 12.25f)
            verticalLineToRelative(-1.5f)
            curveTo(5f, 9.784f, 5.784f, 9f, 6.75f, 9f)
            horizontalLineTo(8f)
            verticalLineTo(7f)
            horizontalLineTo(5.75f)
            curveTo(4.784f, 7f, 4f, 6.216f, 4f, 5.25f)
            verticalLineToRelative(-1.5f)
            curveTo(4f, 2.784f, 4.784f, 2f, 5.75f, 2f)
            horizontalLineTo(8f)
            verticalLineTo(1.5f)
            curveTo(8f, 1.224f, 8.224f, 1f, 8.5f, 1f)
            reflectiveCurveTo(9f, 1.224f, 9f, 1.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(2.25f)
            curveTo(12.216f, 2f, 13f, 2.784f, 13f, 3.75f)
            verticalLineToRelative(1.5f)
            curveTo(13f, 6.216f, 12.216f, 7f, 11.25f, 7f)
            horizontalLineTo(9f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1.25f)
            curveTo(11.216f, 9f, 12f, 9.784f, 12f, 10.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(9f)
            verticalLineToRelative(0.5f)
            curveTo(9f, 14.776f, 8.776f, 15f, 8.5f, 15f)
            close()
        }
    }.build()
}
