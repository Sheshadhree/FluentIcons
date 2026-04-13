package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarPlay28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarPlay28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25f, 9.5f)
            verticalLineToRelative(5f)
            curveToRelative(-1.253f, -0.942f, -2.812f, -1.5f, -4.5f, -1.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 1.688f, 0.558f, 3.247f, 1.5f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 25f, 3f, 23.545f, 3f, 21.75f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(22f)
            close()
            moveTo(21.75f, 3f)
            curveTo(23.545f, 3f, 25f, 4.455f, 25f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(15.5f)
            close()
            moveTo(20.5f, 27f)
            curveToRelative(3.59f, 0f, 6.5f, -2.91f, 6.5f, -6.5f)
            reflectiveCurveTo(24.09f, 14f, 20.5f, 14f)
            reflectiveCurveTo(14f, 16.91f, 14f, 20.5f)
            reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
            close()
            moveToRelative(-0.902f, -9.404f)
            lineToRelative(4.032f, 2.275f)
            curveToRelative(0.493f, 0.278f, 0.493f, 0.98f, 0f, 1.258f)
            lineToRelative(-4.032f, 2.274f)
            curveToRelative(-0.49f, 0.277f, -1.098f, -0.072f, -1.098f, -0.629f)
            verticalLineToRelative(-4.548f)
            curveToRelative(0f, -0.557f, 0.609f, -0.905f, 1.098f, -0.63f)
            close()
        }
    }.build()
}
