package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarAdd28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarAdd28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25f, 14.5f)
            verticalLineToRelative(-5f)
            horizontalLineTo(3f)
            verticalLineToRelative(12.25f)
            curveTo(3f, 23.545f, 4.455f, 25f, 6.25f, 25f)
            horizontalLineToRelative(8.25f)
            curveToRelative(-0.942f, -1.253f, -1.5f, -2.812f, -1.5f, -4.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(1.688f, 0f, 3.247f, 0.558f, 4.5f, 1.5f)
            close()
            moveToRelative(0f, -8.25f)
            curveTo(25f, 4.455f, 23.545f, 3f, 21.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(22f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(2f, 14.25f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveTo(14f, 24.09f, 14f, 20.5f)
            reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            close()
            moveToRelative(-6f, -4f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(20f, 16.224f, 20f, 16.5f)
            verticalLineTo(20f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(20f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(21f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(24.776f, 20f, 24.5f, 20f)
            horizontalLineTo(21f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
