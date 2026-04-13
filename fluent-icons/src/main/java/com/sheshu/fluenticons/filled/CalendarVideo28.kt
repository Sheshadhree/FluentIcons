package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarVideo28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarVideo28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.25f, 5f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(10f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            horizontalLineTo(1.25f)
            close()
            moveToRelative(0f, 1.5f)
            verticalLineTo(15f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-2.5f)
            curveTo(7f, 13.903f, 8.903f, 12f, 11.25f, 12f)
            horizontalLineToRelative(7.5f)
            verticalLineTo(6.5f)
            horizontalLineTo(1.25f)
            close()
            moveToRelative(10.5f, 6.5f)
            curveTo(9.679f, 13f, 8f, 14.679f, 8f, 16.75f)
            verticalLineToRelative(6.5f)
            curveTo(8f, 25.321f, 9.679f, 27f, 11.75f, 27f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.067f, 0f, 3.744f, -1.673f, 3.75f, -3.739f)
            lineToRelative(3.25f, 2.262f)
            curveTo(26.412f, 26.33f, 28f, 25.5f, 28f, 24.086f)
            verticalLineToRelative(-8.172f)
            curveToRelative(0f, -1.414f, -1.59f, -2.244f, -2.75f, -1.437f)
            lineTo(22f, 16.738f)
            curveTo(21.994f, 14.673f, 20.317f, 13f, 18.25f, 13f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
