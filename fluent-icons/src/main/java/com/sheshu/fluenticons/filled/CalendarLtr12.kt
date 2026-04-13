package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarLtr12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarLtr12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.05f, 3f)
            curveTo(1.282f, 1.859f, 2.29f, 1f, 3.5f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(1.21f, 0f, 2.218f, 0.859f, 2.45f, 2f)
            horizontalLineToRelative(-9.9f)
            close()
            moveTo(1f, 4f)
            verticalLineToRelative(4.5f)
            curveTo(1f, 9.88f, 2.12f, 11f, 3.5f, 11f)
            horizontalLineToRelative(5f)
            curveTo(9.88f, 11f, 11f, 9.88f, 11f, 8.5f)
            verticalLineTo(4f)
            horizontalLineTo(1f)
            close()
            moveToRelative(2f, 1.5f)
            curveTo(3f, 5.224f, 3.224f, 5f, 3.5f, 5f)
            reflectiveCurveTo(4f, 5.224f, 4f, 5.5f)
            reflectiveCurveTo(3.776f, 6f, 3.5f, 6f)
            reflectiveCurveTo(3f, 5.776f, 3f, 5.5f)
            close()
            moveToRelative(0f, 2f)
            curveTo(3f, 7.224f, 3.224f, 7f, 3.5f, 7f)
            reflectiveCurveTo(4f, 7.224f, 4f, 7.5f)
            reflectiveCurveTo(3.776f, 8f, 3.5f, 8f)
            reflectiveCurveTo(3f, 7.776f, 3f, 7.5f)
            close()
            moveTo(5.5f, 5f)
            curveTo(5.776f, 5f, 6f, 5.224f, 6f, 5.5f)
            reflectiveCurveTo(5.776f, 6f, 5.5f, 6f)
            reflectiveCurveTo(5f, 5.776f, 5f, 5.5f)
            reflectiveCurveTo(5.224f, 5f, 5.5f, 5f)
            close()
            moveTo(5f, 7.5f)
            curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
            reflectiveCurveTo(6f, 7.224f, 6f, 7.5f)
            reflectiveCurveTo(5.776f, 8f, 5.5f, 8f)
            reflectiveCurveTo(5f, 7.776f, 5f, 7.5f)
            close()
            moveTo(7.5f, 5f)
            curveTo(7.776f, 5f, 8f, 5.224f, 8f, 5.5f)
            reflectiveCurveTo(7.776f, 6f, 7.5f, 6f)
            reflectiveCurveTo(7f, 5.776f, 7f, 5.5f)
            reflectiveCurveTo(7.224f, 5f, 7.5f, 5f)
            close()
        }
    }.build()
}
