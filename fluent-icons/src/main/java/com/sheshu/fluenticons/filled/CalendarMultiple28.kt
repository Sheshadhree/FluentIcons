package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarMultiple28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMultiple28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.008f, 24f)
            curveToRelative(0.578f, 0.902f, 1.589f, 1.5f, 2.74f, 1.5f)
            horizontalLineToRelative(11.5f)
            curveToRelative(2.899f, 0f, 5.25f, -2.35f, 5.25f, -5.25f)
            verticalLineTo(8.75f)
            curveToRelative(0f, -1.15f, -0.597f, -2.16f, -1.498f, -2.737f)
            verticalLineTo(19f)
            curveToRelative(0f, 0.06f, 0f, 0.119f, -0.003f, 0.178f)
            verticalLineToRelative(1.072f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.008f)
            close()
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(13.5f)
            curveTo(21.545f, 3f, 23f, 4.455f, 23f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            close()
            moveTo(3f, 8.5f)
            verticalLineToRelative(11.25f)
            curveTo(3f, 21.545f, 4.455f, 23f, 6.25f, 23f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(8.5f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
