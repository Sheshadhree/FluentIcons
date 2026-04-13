package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(7f)
            horizontalLineToRelative(18f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(0f, 5.772f)
            verticalLineTo(8.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(9.25f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(5.772f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveToRelative(0f, -3.59f, 2.91f, -6.5f, 6.5f, -6.5f)
            curveToRelative(1.289f, 0f, 2.49f, 0.375f, 3.5f, 1.022f)
            close()
            moveToRelative(2f, 5.478f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveTo(12f, 14.462f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            close()
            moveTo(17.5f, 14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(20.276f, 18f, 20f, 18f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
