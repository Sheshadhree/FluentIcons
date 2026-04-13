package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarCheckmarkCenter32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarCheckmarkCenter32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(29f, 24.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(26f)
            verticalLineToRelative(13.5f)
            close()
            moveToRelative(-6.793f, -9.207f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(14.5f, 21.586f)
            lineToRelative(-2.793f, -2.793f)
            lineToRelative(-0.076f, -0.068f)
            curveToRelative(-0.393f, -0.32f, -0.972f, -0.298f, -1.338f, 0.068f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(7f, -7f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            close()
            moveTo(24.5f, 3f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(9f)
            horizontalLineTo(3f)
            verticalLineTo(7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            close()
        }
    }.build()
}
