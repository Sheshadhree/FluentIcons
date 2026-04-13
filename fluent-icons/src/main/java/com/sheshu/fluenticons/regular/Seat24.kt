package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Seat24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Seat24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(12.5f)
            curveTo(3f, 19.993f, 4.007f, 21f, 5.25f, 21f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveToRelative(13.25f, 8.627f)
            curveTo(18.933f, 11.232f, 18.244f, 11f, 17.5f, 11f)
            curveToRelative(-1.116f, 0f, -2.11f, 0.522f, -2.75f, 1.335f)
            curveTo(14.11f, 11.522f, 13.116f, 11f, 12f, 11f)
            reflectiveCurveToRelative(-2.11f, 0.522f, -2.75f, 1.335f)
            curveTo(8.61f, 11.522f, 7.615f, 11f, 6.5f, 11f)
            curveToRelative(-0.744f, 0f, -1.433f, 0.232f, -2f, 0.627f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(5.377f)
            close()
            moveTo(14f, 14.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(1.5f, 5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(15.5f)
            close()
            moveToRelative(-10.25f, 0f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(14.5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}
