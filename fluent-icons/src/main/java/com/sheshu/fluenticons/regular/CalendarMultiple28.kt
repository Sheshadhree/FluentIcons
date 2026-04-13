package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarMultiple28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarMultiple28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(13.5f)
            curveTo(3f, 21.545f, 4.455f, 23f, 6.25f, 23f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(23f, 4.455f, 21.545f, 3f, 19.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(-17f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(0f, 2.25f)
            horizontalLineToRelative(17f)
            verticalLineToRelative(11.25f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(8.5f)
            close()
            moveToRelative(4.247f, 17f)
            curveToRelative(-1.15f, 0f, -2.162f, -0.598f, -2.74f, -1.5f)
            horizontalLineToRelative(14.24f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-1.072f)
            lineTo(24f, 19f)
            verticalLineTo(6.013f)
            curveTo(24.9f, 6.59f, 25.497f, 7.6f, 25.497f, 8.75f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-11.5f)
            close()
        }
    }.build()
}
