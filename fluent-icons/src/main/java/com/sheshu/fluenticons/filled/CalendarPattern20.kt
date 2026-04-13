package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarPattern20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarPattern20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 3f)
            horizontalLineToRelative(8.5f)
            curveTo(15.769f, 3f, 17f, 4.231f, 17f, 5.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(4.231f, 17f, 3f, 15.769f, 3f, 14.25f)
            verticalLineToRelative(-8.5f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            close()
            moveTo(4.5f, 5.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(11f)
            verticalLineTo(5.75f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-8.5f)
            curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
            close()
            moveTo(14.707f, 8f)
            lineToRelative(-4f, 4f)
            horizontalLineToRelative(2.586f)
            lineTo(15.5f, 9.793f)
            verticalLineTo(8f)
            horizontalLineToRelative(-0.793f)
            close()
            moveToRelative(-1.414f, 0f)
            horizontalLineToRelative(-2.586f)
            lineToRelative(-4f, 4f)
            horizontalLineToRelative(2.586f)
            lineToRelative(4f, -4f)
            close()
            moveToRelative(-8f, 4f)
            lineToRelative(4f, -4f)
            horizontalLineTo(6.707f)
            lineTo(4.5f, 10.207f)
            verticalLineTo(12f)
            horizontalLineToRelative(0.793f)
            close()
            moveTo(4.5f, 8.793f)
            lineTo(5.293f, 8f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(0.793f)
            close()
            moveTo(14.707f, 12f)
            horizontalLineTo(15.5f)
            verticalLineToRelative(-0.793f)
            lineTo(14.707f, 12f)
            close()
        }
    }.build()
}
