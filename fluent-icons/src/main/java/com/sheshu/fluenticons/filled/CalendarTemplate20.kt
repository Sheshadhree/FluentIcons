package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarTemplate20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarTemplate20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2f)
            curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(2.035f)
            curveTo(7.012f, 15.837f, 7f, 15.67f, 7f, 15.5f)
            verticalLineToRelative(-5f)
            curveTo(7f, 9.52f, 7.402f, 8.635f, 8.05f, 8f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 8f, 5f, 7.776f, 5f, 7.5f)
            reflectiveCurveTo(5.224f, 7f, 5.5f, 7f)
            horizontalLineToRelative(10f)
            curveToRelative(0.17f, 0f, 0.337f, 0.012f, 0.5f, 0.035f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, 3.5f)
            curveTo(5f, 5.224f, 5.224f, 5f, 5.5f, 5f)
            horizontalLineToRelative(7f)
            curveTo(12.776f, 5f, 13f, 5.224f, 13f, 5.5f)
            reflectiveCurveTo(12.776f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-7f)
            curveTo(5.224f, 6f, 5f, 5.776f, 5f, 5.5f)
            close()
            moveToRelative(3f, 5f)
            curveTo(8f, 9.12f, 9.12f, 8f, 10.5f, 8f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineTo(11f)
            horizontalLineTo(8f)
            verticalLineToRelative(-0.5f)
            close()
            moveToRelative(0f, 5f)
            verticalLineTo(12f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(9.12f, 18f, 8f, 16.88f, 8f, 15.5f)
            close()
        }
    }.build()
}
