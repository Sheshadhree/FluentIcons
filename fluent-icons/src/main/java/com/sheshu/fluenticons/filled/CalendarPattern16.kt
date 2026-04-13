package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarPattern16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarPattern16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 2f)
            curveTo(3.231f, 2f, 2f, 3.231f, 2f, 4.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 12.769f, 3.231f, 14f, 4.75f, 14f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-6.5f)
            curveTo(14f, 3.231f, 12.769f, 2f, 11.25f, 2f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(3.5f, 4.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineTo(6f)
            horizontalLineToRelative(-9f)
            verticalLineTo(4.75f)
            close()
            moveTo(11.707f, 7f)
            horizontalLineTo(12.5f)
            verticalLineToRelative(0.793f)
            lineTo(10.293f, 10f)
            horizontalLineTo(8.707f)
            lineToRelative(3f, -3f)
            close()
            moveToRelative(-1.414f, 0f)
            lineToRelative(-3f, 3f)
            horizontalLineTo(5.707f)
            lineToRelative(3f, -3f)
            horizontalLineToRelative(1.586f)
            close()
            moveToRelative(-6f, 3f)
            horizontalLineTo(3.5f)
            verticalLineTo(9.207f)
            lineTo(5.707f, 7f)
            horizontalLineToRelative(1.586f)
            lineToRelative(-3f, 3f)
            close()
            moveTo(3.5f, 7.793f)
            verticalLineTo(7f)
            horizontalLineToRelative(0.793f)
            lineTo(3.5f, 7.793f)
            close()
            moveTo(11.707f, 10f)
            lineTo(12.5f, 9.207f)
            verticalLineTo(10f)
            horizontalLineToRelative(-0.793f)
            close()
        }
    }.build()
}
