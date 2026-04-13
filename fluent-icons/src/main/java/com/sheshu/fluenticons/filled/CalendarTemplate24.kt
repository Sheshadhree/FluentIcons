package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarTemplate24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarTemplate24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineToRelative(10.5f)
            curveTo(17.545f, 2f, 19f, 3.455f, 19f, 5.25f)
            verticalLineTo(9f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 9f, 6f, 9.336f, 6f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3f)
            curveTo(9.279f, 11.127f, 9f, 11.906f, 9f, 12.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.257f, 0.026f, 0.508f, 0.075f, 0.75f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(5.25f)
            close()
            moveToRelative(4f, 1.5f)
            curveTo(6f, 7.164f, 6.336f, 7.5f, 6.75f, 7.5f)
            horizontalLineToRelative(7.5f)
            curveTo(14.664f, 7.5f, 15f, 7.164f, 15f, 6.75f)
            reflectiveCurveTo(14.664f, 6f, 14.25f, 6f)
            horizontalLineToRelative(-7.5f)
            curveTo(6.336f, 6f, 6f, 6.336f, 6f, 6.75f)
            close()
            moveToRelative(4f, 6f)
            curveToRelative(0f, -1.519f, 1.231f, -2.75f, 2.75f, -2.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(0.75f)
            horizontalLineTo(10f)
            verticalLineToRelative(-0.75f)
            close()
            moveTo(10f, 15f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(11.231f, 22f, 10f, 20.769f, 10f, 19.25f)
            verticalLineTo(15f)
            close()
        }
    }.build()
}
